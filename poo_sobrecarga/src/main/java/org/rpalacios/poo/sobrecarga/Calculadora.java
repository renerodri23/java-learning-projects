package org.rpalacios.poo.sobrecarga;

public class Calculadora {

    public int sumar(int a,int b){
        return a+b;
    }

    public  float sumar(float a, float b){
        return a+b;

    }

    public float sumar(int a , float j){
        return a+j;
    }

    public float sumar(float a, int j){
        return a+j;
    }

    public int sumar(int... argumentos){
        int total = 0;

        for (int i:argumentos){
            total+=i;
        }
        return total;
    }

}
