package com.yadir0795.AluraHub.repositorios;

import com.yadir0795.AluraHub.modelos.topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicoRepositorio extends JpaRepository<topicos, Integer> {
}
