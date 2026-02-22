package org.rpalacios.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.rpalacios.webapp.jaxws.models.Curso;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.rpalacios.webapp.jaxws.services.ServicioWs")
public class ServiciosWsImpl implements ServicioWs {

    public int contador;

    @Override
    public String saludar(String persona) {
        System.out.println("Imprimiendo dentro del servicio web el nombre: " + this);
        contador++;
        System.out.println("El contador es: " + contador);
        return "Hola que tal"+ persona;
    }

    @Override
    public List<Curso> listar() {
        return Arrays.asList(new Curso("Java"),new Curso("Spring"), new Curso("Java EE"));
    }

    @Override
    public Curso crear(Curso curso) {
        System.out.println("Curso guardado con ecito ..." + curso);
        Curso newCurso = new Curso();
        newCurso.setNombre(curso.getNombre());
        return newCurso;
    }
}
