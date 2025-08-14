package com.yadir0795.AluraHub.servicios;

import com.yadir0795.AluraHub.modelos.topicos;
import com.yadir0795.AluraHub.repositorios.ITopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicoService {

    private final ITopicoRepositorio repositorio;

    // Metodo GET - listar todos
    public List<topicos> findAll() {
        return repositorio.findAll();
    }

    // Metodo GET - buscar por ID
    public topicos findByID(Integer id) {
        return repositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Tópico no encontrado con id: " + id));
    }

    // Metodo POST - guardar nuevo
    public topicos save(topicos topico) {
        return repositorio.save(topico);
    }

    // Metodo PUT - actualizar existente
    public topicos update(Integer id, topicos topico) {
        if (!repositorio.existsById(id)) {
            throw new RuntimeException("No se puede actualizar. Tópico no encontrado con id: " + id);
        }
        topico.setId(id);
        return repositorio.save(topico);
    }

    // Metodo DELETE - eliminar por ID
    public void deleteById(Integer id) {
        if (!repositorio.existsById(id)) {
            throw new RuntimeException("No se puede eliminar. Tópico no encontrado con id: " + id);
        }
        repositorio.deleteById(id);
    }
}


