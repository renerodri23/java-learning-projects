package org.rpalacios.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.rpalacios.webapp.jaxws.models.Curso;

import java.util.List;

@WebService
public interface ServicioWs {
    String saludar(String nombre);
    List<Curso> listar();
    Curso crear(Curso curso);
}
