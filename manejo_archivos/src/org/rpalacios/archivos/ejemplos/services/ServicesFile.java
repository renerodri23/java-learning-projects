package org.rpalacios.archivos.ejemplos.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ServicesFile {
    public void createFile(String name){
        File file = new File(name);

        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            writer.append("Hola que tal amigos!\n").append("Todo bien?...");
            writer.close();
            System.out.println("Archivo creado con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
