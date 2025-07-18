package org.rpalacios.ejemplo;

import org.rpalacios.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("================Creando la instancia de la clase Alumno============");
        Alumno alumno = new Alumno();
        alumno.setNombre("Rene");
        alumno.setApellido("Palacios");
        alumno.setInstitucion("Instituto nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaMatematicas(7.0);
        alumno.setNotaSociales(9.0);

        System.out.println("================Creando la instancia de la clase Alumno Internacional============");
        AlumnoInternacional alumno2 = new AlumnoInternacional();
        alumno2.setNombre("Peter");
        alumno2.setApellido("Stanford");
        alumno2.setPais("Australia");
        alumno2.setInstitucion("Instituto Nacional");
        alumno2.setNotaLenguaje(5.0);
        alumno2.setNotaMatematicas(8.3);
        alumno2.setNotaSociales(4.5);
        alumno2.setNotaIdiomas(9.0);

        System.out.println("================Creando la instancia de la clase Profesor============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Lucas");
        profesor.setApellido("IDK");
        profesor.setAsignatura("matematicas");

        System.out.println(alumno.getNombre()
                +" "+alumno.getApellido()
                +" "+alumno.getInstitucion());

        System.out.println(alumno2.getNombre()
                +" "+alumno2.getApellido()
                +" "+alumno2.getInstitucion()
                +" "+alumno2.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                +" : "+profesor.getNombre()
                +" "+profesor.getApellido());

        Class clase = alumno2.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija+" es una clase hija de la clase padre "+padre);
            clase = clase.getSuperclass();
        }
    }


}
