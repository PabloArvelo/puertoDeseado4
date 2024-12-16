package com.puertodeseado.controladores.anticiporetorno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imprimirRecibos")
public class ImprimirRecibosControlador {

    @GetMapping("/vistaImprimirRecibos")
    public String vistaImprimirRecibos(){

        return "imprimirRecibos.html";
    }
}
