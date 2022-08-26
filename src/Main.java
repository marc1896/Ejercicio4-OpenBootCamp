public class Main {
    public static void main(String[] args) {
        int numeroIf;
        numeroIf = -1;

        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es 0");
        }
        System.out.println("Bucle While");
        int numeroWhile = 0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("El valor es: " + numeroWhile);
        }
        System.out.println("Bucle DoWhile");
        int numeroDoWhile = 0;
        do {
            numeroDoWhile = numeroDoWhile + 3;
            System.out.println("El valor es: " + numeroDoWhile);
        }while (numeroDoWhile<3);
        System.out.println("Bucle For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El valor es: " + numeroFor);
        }
        System.out.println("Condicion Swich");
        String estacion = "Verano";
        switch (estacion){
            case  "Primavera":
                System.out.println("Es Primavera");
                break;
            case  "Verano":
                System.out.println("Es Verano");
                break;
            case  "Otoño":
                System.out.println("Es Otoño");
                break;
            case  "Invvierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("El valor no es una estación de tiempo");
                break;
        }


    }
}
