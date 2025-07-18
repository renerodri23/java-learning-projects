public class ArgumentosLineaComandosCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("porfavor ingresar una operacion y dos numeros");
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch(operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                if ((b==0)){
                    resultado = (double)a/b;
                    break;
                 }
            default:
                System.out.println("DefAUlt");
        }
    }
}
