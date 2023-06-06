package com.paul.codigoFacilito.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.spi.IIOServiceProvider;

@Controller
public class ParametrosController {

//    private IService equipoService;
//
//    public ParametrosController(@Qualifier IService equipoService){
//        this.equipoService;
//    }

    @GetMapping("/parametros")
    public String parametros(@RequestParam(defaultValue = "") String valor,
                             @RequestParam(defaultValue = "", name = "valor_dos") String otroValor, Model model){

        //como podemos pasar informacion hacia la vista
        //con Model
        model.addAttribute("titulo","Nel perro");
        model.addAttribute("parametro",valor);
        model.addAttribute("otroValor",otroValor);

        return "indexModel";
    }

    //Request mapping se encarga de relacionar un metodo con una peticion http]
    //Si no se agrega ningun parametro en method request maping acepta todos los verbos.
    @RequestMapping(value="index-req-mapping", method = RequestMethod.GET)
    public String indexRequestMapping(){
        return "index";
    }


}
