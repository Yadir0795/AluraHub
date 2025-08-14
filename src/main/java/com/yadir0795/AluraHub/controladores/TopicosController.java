package com.yadir0795.AluraHub.controladores;

import com.yadir0795.AluraHub.modelos.topicos;
import com.yadir0795.AluraHub.servicios.TopicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
@RequiredArgsConstructor
public class TopicosController {

    private final TopicoService service;

    // GET: listar todos
    @GetMapping
    public ResponseEntity<List<topicos>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // GET: buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<topicos> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findByID(id));
    }

    // POST: guardar nuevo
    @PostMapping
    public ResponseEntity<topicos> save(@RequestBody topicos nuevoTopico) {
        topicos saved = service.save(nuevoTopico);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // PUT: actualizar existente
    @PutMapping("/{id}")
    public ResponseEntity<topicos> update(@PathVariable Integer id, @RequestBody topicos topicoActualizado) {
        topicos updated = service.update(id, topicoActualizado);
        return ResponseEntity.ok(updated);
    }

    // DELETE: eliminar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}





