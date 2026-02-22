package org.rpalacios.archivos.ejemplos;

import org.rpalacios.archivos.ejemplos.services.ServicesFile;

public class EjemploCrearArchivos {

    public static void main(String[] args) {
        String nameFile = "C:\\Users\\Rene\\Documents\\Cursos\\Java\\archivo\\java.txt";

        ServicesFile service = new ServicesFile();
        service.createFile(nameFile);
    }
}
