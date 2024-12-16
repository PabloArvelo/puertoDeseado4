package com.puertodeseado.controladores.anticiporetorno;

import com.puertodeseado.EntidadesDTO.RespuestaDTO;
import com.puertodeseado.EntidadesDTO.anticipoderetorno.CrearLiquidacionDTO;
import com.puertodeseado.servicio.CrearExcelFileServicio;
import com.puertodeseado.servicio.anticiporetorno.LiquidacionHistorialServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/liquidaciones")
public class CrearLiquidacionControlador {

  @Autowired
  private LiquidacionHistorialServicio liquidacionHistorialServicio;

  @Autowired
  private CrearExcelFileServicio crearExcelFileServicio;

  @GetMapping("/vistaLiquidaciones")
  public String vistaCrearLiquidacion(Model modelo) {


    //System.out.println("hola desde controlador");

    modelo.addAttribute("crearLiquidacionDTO", new CrearLiquidacionDTO());
    return "crearLiquidacion.html";
  }


  @PostMapping("/crearNuevaLiquidacion")
  public String crearNuevaLiquidacion(@Valid CrearLiquidacionDTO crearLiquidacionDTO,
                                      BindingResult result,
                                      Model modelo) throws Exception {
    System.out.println("hola desde controlador - Crear Liquidación");

    if (!crearLiquidacionDTO.getArchivoCSV().getOriginalFilename().endsWith(".csv")){
      result.rejectValue("archivoCSV","error.archivoCSV","el archivo debe ser un csv válido");
    }



    if (result.hasErrors()) {
      return "crearLiquidacion.html";
    }



    RespuestaDTO respuesta = liquidacionHistorialServicio.importarLiquidacionDesdeCSV(crearLiquidacionDTO.getPeriodoNuevaLiquidacion(),
            crearLiquidacionDTO.getArchivoCSV());

    modelo.addAttribute("respuesta", respuesta);
    modelo.addAttribute("crearLiquidacionDTO", new CrearLiquidacionDTO());

    return "crearLiquidacion.html";
  }


  @GetMapping("/exportarPadronAsociadosActivosW")
  public ResponseEntity<byte[]> descargarExcel() {
    return crearExcelFileServicio.listadoAsociadosLiquidacionWeb();
  }

}
