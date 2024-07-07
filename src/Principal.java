import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaDivisa consulta = new ConsultaDivisa();
        Scanner scanner = new Scanner(System.in);
//       System.out.println("Escriba el nombre de la divisa que quiere consultar");
//       var moneda = String.valueOf(consulta.buscarMoneda(scanner.next()));
        System.out.println(consulta.buscarMoneda("USD"));

        boolean ciclo = true;

        while (ciclo){
            int intento = 0;


            System.out.println("""
                    ***************************************
                    Sea bienvenido/a al conversor de monedas =)
                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir 
                    """);
            intento =  scanner.nextInt();
            switch (intento) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7: ciclo = false;
                break;
            }

        }



    }
}
