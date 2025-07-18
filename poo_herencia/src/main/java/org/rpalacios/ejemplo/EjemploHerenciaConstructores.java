package org.rpalacios.ejemplo;

import org.rpalacios.pooherencia.*;

public class EjemploHerenciaConstructores {
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

    public static void imprimir(Persona persona){
        System.out.println("====Imprimiendo datos de Persona=====");
        System.out.println("Nombre: "+persona.getNombre()
                +",Apellido: "+persona.getApellido()
                +",Edad: "+persona.getEdad()
                +",Email: "+persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("====Imprimiendo datos de Alumno=====");
            System.out.println("Institucion: "+((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: "+((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Lenguaje: "+((Alumno) persona).getNotaLenguaje());
            System.out.println("Nota Sociales: "+((Alumno) persona).getNotaSociales());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Nota Idiomas: "+((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());

            }
            System.out.println("================= sobre escritura promedio ===================");
            System.out.println("Promedio: "+((Alumno) persona).calcularPromedio());
            System.out.println("================= sobre escritura promedio ===================");


        }

        if(persona instanceof Profesor){
            System.out.println("====Imprimiendo datos de Profesor=====");

            System.out.println("Asignatura: "+((Profesor) persona).getAsignatura());
        }
        System.out.println("================= sobre escritura saludar ===================");

        System.out.println(persona.saludar());

        System.out.println("====================================");

    }
}
