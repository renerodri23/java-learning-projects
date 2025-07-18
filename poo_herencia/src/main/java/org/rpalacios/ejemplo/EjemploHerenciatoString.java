package org.rpalacios.ejemplo;

import org.rpalacios.pooherencia.Alumno;
import org.rpalacios.pooherencia.AlumnoInternacional;
import org.rpalacios.pooherencia.Persona;
import org.rpalacios.pooherencia.Profesor;

public class EjemploHerenciatoString {
    public static void main(String[] args) {

        System.out.println("================Creando la instancia de la clase Alumno============");
        Alumno alumno = new Alumno("Rene","Palacios",20,"Instituto nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaMatematicas(7.0);
        alumno.setNotaSociales(9.0);
        alumno.setEmail("nsqklover@gmail.com");

        System.out.println("================Creando la instancia de la clase Alumno Internacional============");
        AlumnoInternacional alumno2 = new AlumnoInternacional("Peter","Stanford","Australia");
        alumno2.setInstitucion("Instituto Nacional");
        alumno2.setNotaLenguaje(5.0);
        alumno2.setNotaMatematicas(8.3);
        alumno2.setNotaSociales(4.5);
        alumno2.setNotaIdiomas(9.0);
        alumno2.setEmail("nsqklover2@gmail.com");

        System.out.println("================Creando la instancia de la clase Profesor============");
        Profesor profesor = new Profesor("Lucas","IDK","matematicas");
        profesor.setEdad(47);
        profesor.setEmail("nsqk.teacher@gmail.com");

        imprimir(alumno);
        imprimir(alumno2);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona) {
        System.out.println("==============================");
        System.out.println(persona);
    }
}
