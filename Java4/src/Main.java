public class Main {
    public static void main(String[] args) {
        int numeroIf = -10;
        int numeroWhile = 0;
        int numeroFor = 0;
        var estacion = "Invierno";

        if(numeroIf == 0) {
            System.out.println("El número es 0");
        } else if (numeroIf < 0) {
            System.out.println("El número: " + numeroIf + " es negativo");
        } else {
            System.out.println("El número: " + numeroIf + " es positivo");
        }

        while(numeroWhile < 3){
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("numeroWhile(Do While): " + numeroWhile);
            numeroWhile++;
        } while(numeroWhile < 3);

        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor: " + numeroFor);
        }

        switch (estacion){
            case "Primavera":
                System.out.println("La estación es: Primavera");
                break;
            case "Verano":
                System.out.println("La estación es: Verano");
                break;
            case "Otoño":
                System.out.println("La estación es: Otoño");
                break;
            case "Invierno":
                System.out.println("La estación es: Invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}