package org.rpalacios.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora c =  new Calculadora();
        //String valor = JOptionPane.showInputDialog("Ingrese un entero ");
        String num = JOptionPane.showInputDialog("Ingrese un entero numerador");
        String den = JOptionPane.showInputDialog("Ingrese un entero denominador");
        int divisior ;
        double division ;

       try{
           //divisior = Integer.parseInt(valor);
           //division = c.dividir(10,divisior);
           //System.out.println(division);

           double division2 = c.dividir(num,den);
           System.out.println("division2 = " + division2);

       } catch (NumberFormatException ne){
           System.out.println("Se detecto una excepcion por favor ingrese un valor numerico: "+ne.getMessage());
            main(args);

       } catch (DivisionPorZeroException e){
           System.out.println("Capturamos la excepcion en tiempo de ejecucion: "+e.getMessage());
            main(args);

       } catch (StringDataException e) {
           System.out.println("se detecto una ecepcion ingrese un numero valido: "+ e.getMessage());
           //e.printStackTrace(System.out);
       } finally {
           System.out.println("Es opcional pero se ejecuta siempre");
       }
        System.out.println("Continuamos el flujo");
    }
}
