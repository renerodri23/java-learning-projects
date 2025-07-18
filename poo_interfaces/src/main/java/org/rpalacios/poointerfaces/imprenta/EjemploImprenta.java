package org.rpalacios.poointerfaces.imprenta;
import org.rpalacios.poointerfaces.imprenta.modelo.*;
import static org.rpalacios.poointerfaces.imprenta.modelo.Genero.*;
import static org.rpalacios.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Resumen Laboral....",new Persona("Jhon","Doe"),"Ingeniero en sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Full-Stack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich","Gamma"),"Patron de diseños: Elemn. Reusables POO"
                ,PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Estudio de microservicio",new Persona("Martin","Fowler"),new Persona("Ryan","Gosling"));
        imprimir(cv);
        imprimir(informe);
        System.out.println();
        imprimir(libro);


        System.out.println(TEXTO_DEFAULT);
    }


}
