package com.edticsa.demoCrud.controllers;

import com.edticsa.demoCrud.models.Producto;
import com.edticsa.demoCrud.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductoViewController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/vista-productos")
    public String verPagina(Model model) {
        model.addAttribute("listaProductos", productoService.listarTodos());
        model.addAttribute("producto", new Producto());
        return "productos";
    }

    @PostMapping("/productos/guardar")
    public String guardar(@ModelAttribute Producto producto) {
        productoService.guardar(producto);
        return "redirect:/vista-productos";
    }
}