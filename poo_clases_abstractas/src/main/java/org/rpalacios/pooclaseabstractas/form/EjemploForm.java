package org.rpalacios.pooclaseabstractas.form;

import org.rpalacios.pooclaseabstractas.form.elementos.*;
import org.rpalacios.pooclaseabstractas.form.elementos.select.Opcion;
import org.rpalacios.pooclaseabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password =  new InputForm("clave","password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador());
        InputForm email = new InputForm("email","email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm exp = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2","Phyton"))
        .addOpcion(new Opcion("3","JavaScript"))
        .addOpcion(new Opcion("4", "TypeScript").setSelected())
        .addOpcion(new Opcion("5","PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("Hola este campo esta deshabilitado");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("jon.doe@correo.com");
        edad.setValor("28");
        java.setSelected(true);
        exp.setValor(".... ninguna :(");

        List<ElementoForm> elemntos = Arrays.asList(username,
                password,
                email,
                edad,
                exp,
                lenguaje,
                saludar);

                elemntos.forEach(e ->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");

        });

        elemntos.forEach(e -> {
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println
                );
            }
        });
    }
}
