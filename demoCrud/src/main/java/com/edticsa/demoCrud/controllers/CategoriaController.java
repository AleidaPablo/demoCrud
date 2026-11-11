package com.edticsa.demoCrud.controllers;

import com.edticsa.demoCrud.models.Categoria;
import com.edticsa.demoCrud.services.CategoriaService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarTodas();
    }

    @PostMapping
    public Categoria crear(@RequestBody Categoria categoria) {
        return categoriaService.guardar(categoria);
    }
    @PutMapping("/{id}")
    public Categoria actualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria categoriaExistente = categoriaService.obtenerPorId(id);
        if (categoriaExistente != null) {
            categoriaExistente.setNombre(categoria.getNombre());
            return categoriaService.guardar(categoriaExistente);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        categoriaService.eliminar(id);
    }
}