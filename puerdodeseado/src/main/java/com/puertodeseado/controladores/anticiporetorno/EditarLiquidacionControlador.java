package com.puertodeseado.controladores.anticiporetorno;


import com.puertodeseado.EntidadesDTO.RespuestaDTO;
import com.puertodeseado.EntidadesDTO.anticipoderetorno.DatosSesionDTO;
import com.puertodeseado.EntidadesDTO.anticipoderetorno.LiquidacionActualizarDTO;
import com.puertodeseado.EntidadesDTO.anticipoderetorno.LiquidacionesPorPeriodoDTO;
import com.puertodeseado.entidades.anticiporetorno.LiquidacionHistorial;
import com.puertodeseado.repositorio.anticipoderetorno.LiquidacionHistorialRepositorio;
import com.puertodeseado.servicio.anticiporetorno.EditarLiquidacionServicio;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.time.YearMonth;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/editarLiquidacion")
public class EditarLiquidacionControlador {

    @Autowired
    private EditarLiquidacionServicio editarLiquidacionServicio;
    @Autowired
    private LiquidacionHistorialRepositorio liquidacionHistorialRepositorio;

    @GetMapping("/vistaEditarLiquidacion")
    public String vistaEditarLiquidacion(){

        return "editarLiquidacion.html";
    }



    @GetMapping("/liquidacionesPorPeriodo")
    @ResponseBody
    public List<LiquidacionesPorPeriodoDTO> liquidacionesPorPeriodo(@RequestParam YearMonth periodo){

        return editarLiquidacionServicio.liquidacionesPorPeriodo(periodo);
    }



    @GetMapping("/buscarLiquidacionPorAsocPeriodo")
    @ResponseBody
    public LiquidacionHistorial buscarLiquidacionPorAsocPeriodo(HttpSession session){

        String idAsoc = (String) session.getAttribute("idAsoc");
        String periodo = (String) session.getAttribute("periodo");

        int asd = editarLiquidacionServicio.buscarLiquidacionPorAsocPeriodo(idAsoc,periodo).getHoras6();;


        return editarLiquidacionServicio.buscarLiquidacionPorAsocPeriodo(idAsoc,periodo);
    }


    //guarda los datos de la sesion
    @PostMapping("/guardarParametrosSesion")
    public void guardarParametrosSesion(@RequestBody DatosSesionDTO datos, HttpSession session){

        session.setAttribute("idAsoc",datos.getIdAsoc());
        session.setAttribute("periodo",datos.getPeriodo());
    }


    @GetMapping("/verLiquidacion")
    public String vistaLiquidacion(){

        return "liquidacion.html";
    }


    @PutMapping("guardarEdicion/{idLiqui}")
    @ResponseBody
    public ResponseEntity<String> guardarEditado(@PathVariable String idLiqui, @Valid @RequestBody LiquidacionActualizarDTO liqAtcDTO, BindingResult result) {

        System.out.println("hola");

        if (result.hasErrors()) {
            // Construir una respuesta con los errores
            String errores = result.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .collect(Collectors.joining(", "));
            System.out.println("el error es: "+errores);
            return ResponseEntity.badRequest().body(errores);
        }

        RespuestaDTO respeustaDTO = editarLiquidacionServicio.editarLiquidacion(liqAtcDTO);

        return ResponseEntity.ok(respeustaDTO.getMensaje());
    }



}



