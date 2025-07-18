package org.rpalacios.pooexcepciones.ejemplo;

public class Calculadora{

    public double dividir(int num, int div) throws DivisionPorZeroException {
        if (div==0){
            throw new DivisionPorZeroException("No se puede dividir por cero: ");
        }
        return (double) num /div;

    }
    public double dividir(String num, String div) throws DivisionPorZeroException, StringDataException {
        try {
            int num1 = Integer.parseInt(num);
            int div2 = Integer.parseInt(div);
            return this.dividir(num1,div2);
        } catch (NumberFormatException e){
            throw new StringDataException("Debe Ingresar Un Númerador y divisor");
        }




    }
}
