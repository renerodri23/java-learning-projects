public class ConversionDeTipos {
    public static void main(String[] args){
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double reLdOUBLE = Double.parseDouble(realStr);
        System.out.println("reLdOUBLE = " + reLdOUBLE);

        String logicoStr = "false";
        boolean logicBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicBoolean = " + logicBoolean);
    }
}
