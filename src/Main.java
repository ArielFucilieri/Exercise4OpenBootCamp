public class Main {
    public static void main(String[] args) {
                var numeroIf = 9;

                if(numeroIf > 0 ){
                    System.out.println("El numero es positivo");
                } else if (numeroIf < 0) {
                    System.out.println("El numero es negativo");
                }else {
                    System.out.println("El numero es igual a 0");
                }

                var numeroWhile = 0;

                while(numeroWhile < 3){
                    numeroWhile++;
                    System.out.println(numeroWhile);
                }

                var numeroDoWhile = 3;

                do{
                    numeroWhile++;
                    System.out.println(numeroWhile);
                }while(numeroWhile < 3);

                for (int numeroFor= 0; numeroFor < 3; numeroFor++){
                    System.out.println(numeroFor);
                }

                var estaciones= "INVIERNO";

                switch (estaciones){
                    case "VERANO":
                        System.out.println("Es VERANO");
                        break;
                    case "INVIERNO":
                        System.out.println("Es INVIERNO");
                        break;
                    case "OTOÑO":
                        System.out.println("Es OTOÑO");
                        break;
                    case "PRIMEVARA":
                        System.out.println("Es PRIMAVERA");
                        break;
                    default:
                        System.out.println(estaciones);
                        break;
                }



        }

}