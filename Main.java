public class Main {
    public static void main(String[] args)
    {
        System.out.println("INICIO");

        // Bucle entre dos variables


        int a = 10;
        int b = 20;

        while(a <= b){
            System.out.println(a);
            a++;
        }

        System.out.println("---------------------");

        // Bucle entre dos variables que muestre el numero par


        int aB = 10;
        int bB = 20;

        while(aB <= bB && aB % 2 == 0){
            System.out.println(aB);
            aB = aB + 2;
        }

        System.out.println("---------------------");

        // Bucle entre dos variables que muestra pares o impares


        int aC = 10;
        int bC = 20;


        while (aC <= bC){

            if(aC % 2 == 0){
                System.out.println(aC);
                aC = aC + 2;
            } else{
                System.out.println(aC);
            }
        }

        System.out.println("---------------------");

        // Bucle entre dos variables que muestra numero par con for

        int bD = 20;

        for (int aD = 10; aD <= b ; aD++) {
            if(aD % 2 == 0){
                System.out.println(aD);
            }
        }

        System.out.println("---------------------");

        // Determinar segmento de ingresos

        float ingresosTotales = 489083;
        int vehiculos = 3;
        int antiguedadVehiculos = 5;
        int inmuebles = 3;
        boolean activosExtra = true;

        if(ingresosTotales <= ingresosTotales && vehiculos <= vehiculos && antiguedadVehiculos <= antiguedadVehiculos && inmuebles <= inmuebles && activosExtra == true){
            System.out.println("Pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Usted no pertenece al segmento de ingresos altos");
        }


        System.out.println("---------------------");
        System.out.println("FIN");

    }
}
