package com.callenge.conversor.principal;

import com.callenge.conversor.service.ConsultaDivisa;
import com.callenge.conversor.service.ConvierteDatos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaDivisa consulta = new ConsultaDivisa();
        ConvierteDatos conversor = new ConvierteDatos();
        Scanner scanner = new Scanner(System.in);

        String mensajeInicio = """
                    ***************************************
                    Sea bienvenido/a al conversor de monedas =)
                    
                    Ingrese la opción que desea
                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir 
                    """;
        String mensajeValorAConvertir = "Ingresa el valor que deseas convertir";

        while (true) {

            try {

                System.out.println(mensajeInicio);
                var intento = scanner.nextInt();
                if (intento == 7) {
                    break;
                }
                if (intento > 7 || intento <= 0) {
                    System.out.println("Opción invalida, ejecutar de nuevo");
                    break;
                }

                System.out.println(mensajeValorAConvertir);
                var montoAConvertir = scanner.nextDouble();

                String url = "https://v6.exchangerate-api.com/v6/78f060949cff6ec52636c485/pair/";
                String monedaBase = "";
                String monedaDestino = "";


                switch (intento) {
                    case 1:
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    case 2:
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaDestino = "COP";
                        break;
                    case 6:
                        monedaBase = "COP";
                        monedaDestino = "USD";
                        break;
                }

                URI direccion = URI.create(url + monedaBase + "/" + monedaDestino + "/" + montoAConvertir);

                String json = consulta.obtenerDatos(direccion);

                var conversion = conversor.convierteDatos(json);

                BigDecimal resultado = BigDecimal.valueOf(montoAConvertir * conversion.conversion_rate());
                System.out.println("El valor de : $" + montoAConvertir + " en " + monedaBase + "son: " +
                        resultado.setScale(2, RoundingMode.HALF_UP) + " en " + monedaDestino);

                var comprobandoResultado = conversion.conversion_result();

            }catch (InputMismatchException e) {
                System.out.println("Acepta solo valores numéricos, ejecuta de nuevo por favor");
                break;
            }
        }
    }
}
