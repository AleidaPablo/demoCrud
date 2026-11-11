package com.edticsa.demoCrud.services;

import com.edticsa.demoCrud.models.Categoria;
import com.edticsa.demoCrud.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaServiceRepository; 

    public List<Categoria> listarTodas() {
        return categoriaServiceRepository.findAll();
    }

    public Categoria guardar(Categoria categoria) {
        return categoriaServiceRepository.save(categoria);
    }

    public Categoria obtenerPorId(Long id) {
        return categoriaServiceRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        categoriaServiceRepository.deleteById(id);
    }
}