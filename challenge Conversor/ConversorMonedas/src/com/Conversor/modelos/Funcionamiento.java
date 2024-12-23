package com.Conversor.modelos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcionamiento {
    Scanner teclado = new Scanner(System.in);
    String menu = """
            *********************************
                        
            Bienvenido/a al conversor de moneda
                        
            1. Dólar =>> Peso Argentino"
            2. Peso Argentino =>> Dólar"
            3. Dólar =>> Real Brasileño"
            4. Real Brasileño =>> Dólar"
            5. Dólar =>> Peso Colombiano"
            6. Peso Colombiano =>> Dolar"
            7. Salir"
                        
            Elija una opción Valida:
                        
            *********************************
                """;
    String mensaje = "Ingrese el valor que desea convertir: ";


    public void menu() throws IOException, InterruptedException {
        var opcion = 0;
        double valor = 0;
        String respuesta;
        try {
            while (opcion != 7) {
                System.out.println(menu);
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println(mensaje);
                        valor = teclado.nextDouble();
                        respuesta = Conexion.convertirMoneda("USD", "ARS", valor);
                        System.out.println("El valor de " + valor + " [USD] corresponde al valor de " + respuesta + " [ARS]");
                        break;
                    case 2:
                        System.out.println(mensaje);
                        valor = teclado.nextDouble();
                        respuesta = Conexion.convertirMoneda("ARS", "USD", valor);
                        System.out.println("El valor de " + valor + " [ARS] corresponde al valor de " + respuesta + " [USD]");
                        break;
                    case 3:
                        System.out.println(mensaje);
                        valor = teclado.nextDouble();
                        respuesta = Conexion.convertirMoneda("USD", "BRL", valor);
                        System.out.println("El valor de " + valor + " [USD] corresponde al valor de " + respuesta + " [BRL]");
                        break;
                    case 4:
                        System.out.println(mensaje);
                        valor = teclado.nextDouble();
                        respuesta = Conexion.convertirMoneda("BRL", "USD", valor);
                        System.out.println("El valor de " + valor + " [BRL] corresponde al valor de " + respuesta + " [USD]");
                        break;
                    case 5:
                        System.out.println(mensaje);
                        valor = teclado.nextDouble();
                        respuesta = Conexion.convertirMoneda("USD", "COP", valor);
                        System.out.println("El valor de " + valor + " [USD] corresponde al valor de " + respuesta + " [COP]");
                        break;
                    case 6:
                        System.out.println(mensaje);
                        valor = teclado.nextDouble();
                        respuesta = Conexion.convertirMoneda("COP", "USD", valor);
                        System.out.println("El valor de " + valor + " [COP] corresponde al valor de " + respuesta + " [USD]");
                        break;
                    case 7:
                        System.out.println("Saliendo del programa");
                        break;

                    default:
                        System.out.println("Opción no valida");
                        break;

                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Error, no ingreso un numero");

        }
    }
}

