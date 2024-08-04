package com.cl1.demo.controller;

import com.cl1.demo.model.Atencion;
import com.cl1.demo.service.AtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AtencionController {

    @Autowired
    private AtencionService atencionService;

    @GetMapping({"/", "/cargar"})
    public String cargarPagCrud(Model model) {
        model.addAttribute("mensaje", "Bienvenido a la página de atenciones");
        model.addAttribute("cssmensaje", "alert alert-info");

        model.addAttribute("atencion", new Atencion());

        List<Atencion> atenciones = atencionService.listaAtenciones();

        model.addAttribute("listaAtenciones", atenciones);
        model.addAttribute("listaTipos", atencionService.listaTipos());
        return "atencionesLinares";
    }

    @PostMapping("/guardar")
    public String guardarAtencion(@ModelAttribute Atencion atencion, Model model) {

        try {
            atencionService.grabar(atencion);
            model.addAttribute("mensaje", "Grabando atencion ");
            model.addAttribute("cssmensaje", "alert alert-success");
        } catch (Exception e) {
            model.addAttribute("mensaje", "Error al grabar");
            model.addAttribute("cssmensaje", "alert alert-danger");
        }
        model.addAttribute("listaAtenciones", atencionService.listaAtenciones());
        model.addAttribute("listaTipos", atencionService.listaTipos());

        return "redirect:/";
    }
}