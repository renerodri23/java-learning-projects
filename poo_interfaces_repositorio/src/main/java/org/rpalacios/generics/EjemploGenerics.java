package org.rpalacios.generics;

import org.rpalacios.poointerdaces.modelo.Cliente;
import org.rpalacios.poointerdaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenerics {
    public static void main(String[] args) {
        List<Cliente> cliente = new ArrayList<>();
        cliente.add(new Cliente("Rene","Palacios"));

        Cliente rene = cliente.get(0);

        Cliente[] clientesArreglo = {new Cliente("Luci","Martinez"),
                new Cliente("Andres","Hernandez")};
        Integer[] enteros={1,2,3};

        List<Cliente> clientes2 = fromArrayToList(clientesArreglo);
        List<Integer> entero2 = fromArrayToList(enteros);

        clientes2.forEach(System.out::println);
        entero2.forEach((System.out::println));


        List<String> nombres = fromArrayToList(new String[]{"Andrew","Rene","Felipe","Israel","Israelipe"}, enteros);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientes3 = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Rene","Israel")});

        imprimirClientes(cliente);
        imprimirClientes(clientes2);
        imprimirClientes(clientes3);

        System.out.println("Maximo de 1, 9 y 4 es: "+ maximo(1,9,4));
        System.out.println("Maximo de 3.9,11.4,7,8 es: "+maximo(3.9,11.4,7.8));
        System.out.println("Maximo de zanahoria,arandanos,manzana es: "+maximo("Zanahoria","Arandanos","Manzana"));
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for (G ej : g){
            System.out.println(ej);

        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List< ? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max)>0){
            max=b;

        }
        if (c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}
