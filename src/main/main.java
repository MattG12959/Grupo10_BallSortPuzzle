package main;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Grupo 10: Natalia Dave Diego Gimenez Jose Urbani Karina Altamirano
 * Matias Antonacci
 *
 */
public class main {

    static final int MAX_CAPACIDAD = 4;
    //Códigos de colores
    static final String RESET    = "\u001B[0m";
    static final String ROJO     = "\u001B[31m"; // texto rojo
    static final String AZUL     = "\u001B[34m"; // texto azul
    static final String AMARILLO = "\u001B[33m"; // texto amarillo
    
    

    public static void main(String[] args) {
        Stack<String> Pila1 = new Stack<>();
        Stack<String> Pila2 = new Stack<>();
        Stack<String> Pila3 = new Stack<>();
        Stack<String> Pila4 = new Stack<>();
        

       
        Scanner key = new Scanner(System.in);
        //Switch
        int num = 0;
        int num2 = 0;

        //Contadores de Pilas
        int cont1 = 0;
        int cont2 = 1;
        int cont3 = 2;
        int cont4 = 3;
        
        int[] contadores = {4,4,4,0};
        /**
         * Código:
         */
// -Asignar los Colores 
        //PRIMER TUBO
        Pila1.push("rojo");
        Pila1.push("azul");
        Pila1.push("rojo");
        Pila1.push("amarillo");

        //SEGUNDO TUBO
        Pila2.push("amarillo");
        Pila2.push("amarillo");
        Pila2.push("rojo");
        Pila2.push("azul");

        //TERCER TUBO
        Pila3.push("azul");
        Pila3.push("rojo");
        Pila3.push("amarillo");
        Pila3.push("azul");

        // CUARTO TUBO (vacío, tubo auxiliar)
        //Pila4 comienza vacía
        System.out.println("\n ======BALL SORT PUZZLE======");
        System.out.println("===Agrupa los colores en cada tubo===");
        System.out.println("\n ¡Reglas del juego!");
        System.out.println("Sólo puedes mover la bola del tope del tubo, puedes mover de a una bola por vez.");
        System.out.println("La bola se debe mover a un tubo vacío, o haciendo coincidir los colores o si sobra espacio en algún tubo.");
        System.out.println("La capacidad máxima de cada tubo es de 4 bolas.");
        System.out.println("¿Cuándo ganas? cuando coincidan los colores en cada tubo, siendo cada tubo de un único color.");
        System.out.println("\n Las pilas se encuentran en este orden, ¿te animas a jugar?");

        /*
         * -Mostar como estan formadas las pilas
         */
        
        int origen=0;
        
        while (num != 5) {

            mostrarPilas(Pila1, Pila2, Pila3, Pila4);

            if (verificarVictoria(Pila1, Pila2, Pila3, Pila4)) {

                System.out.println("\n ¡Felicidades! ¡Ganaste!");
                break;

            }

            System.out.print("¿De cúal pila desea mover el color del tope? |1|2|3|4| - (5) para salir del programa: ");
            num = key.nextInt();

            switch (num) {
                case 1:
                    System.out.print("\n¿A qué pila desea insertar el color? |2|3|4| : ");
                    num2 = key.nextInt();

                    switch (num2) {
                        case 2:
                            moverColores(Pila1, Pila2, cont1, cont2, contadores);
                            break;
                        case 3:
                            moverColores(Pila1, Pila3, cont1, cont3, contadores);
                            break;
                        case 4:
                            moverColores(Pila1, Pila4, cont1, cont4, contadores);
                            break;
                        default:
                            System.out.println("\nNúmero no valido, volver a ingresar.");
                    }
                    break;
                case 2:
                    System.out.print("\n¿A qué pila desea insertar el color? |1|3|4| : ");
                    num2 = key.nextInt();
                    switch (num2) {
                        case 1:
                            moverColores(Pila2, Pila1, cont2, cont1, contadores);
                            break;
                        case 3:
                            moverColores(Pila2, Pila3, cont2, cont3, contadores);
                            break;
                        case 4:
                            moverColores(Pila2, Pila4, cont2, cont4, contadores);
                            break;
                        default:
                            System.out.println("\nNúmero no valido, volver a ingresar.");
                    }
                    break;
                case 3:
                    System.out.print("\n¿A qué pila desea insertar el color? |1|2|4| : ");
                    num2 = key.nextInt();
                    switch (num2) {
                        case 1:
                            moverColores(Pila3, Pila1, cont3, cont1, contadores);
                            break;
                        case 2:
                            moverColores(Pila3, Pila2, cont3, cont2, contadores);
                            break;
                        case 4:
                            moverColores(Pila3, Pila4, cont3, cont4, contadores);
                            break;
                        default:
                            System.out.println("\nNúmero no valido, volver a ingresar.");
                    }
                    break;
                case 4:
                    System.out.print("\n¿A qué pila desea insertar el color? |1|2|3| : ");
                    num2 = key.nextInt();
                    switch (num2) {
                        case 1:
                            moverColores(Pila4, Pila1, cont4, cont1, contadores);
                            break;
                        case 2:
                            moverColores(Pila4, Pila2, cont4, cont2, contadores);
                            break;
                        case 3:
                            moverColores(Pila4, Pila3, cont4, cont3, contadores);
                            break;
                        default:
                            System.out.println("\nNúmero no valido, volver a ingresar.");
                    }
                    break;
                case 5:
                    System.out.println("\nSalió con Éxito del Programa.");
                    break;
                default:
                    System.out.println("\nNúmero no valido, volver a ingresar.");
            }
            
        }
    }

    public static String obtenerColor(String color) {
        switch (color) {
            case "rojo":     return ROJO;
            case "azul":     return AZUL;
            case "amarillo": return AMARILLO;
            default:         return "";
        }
    }
    
    public static void mostrarPilas(Stack<String> Pila1, Stack<String> Pila2, Stack<String> Pila3, Stack<String> Pila4) {
        Stack<?>[] pilas = {Pila1, Pila2, Pila3, Pila4};
 
        System.out.println();
 
        for (int fila = MAX_CAPACIDAD - 1; fila >= 0; fila--) {
            System.out.print("  ");
            for (Stack<?> pila : pilas) {
                if (fila < pila.size()) {
                    String color = (String) pila.get(fila);
                    String codigoAnsi = obtenerColor(color);
                    System.out.printf("|" + codigoAnsi + "%-9s" + RESET + "|", color);
                } else {
                    System.out.print("|         |");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
 
        System.out.println("  -----------  -----------  -----------  -----------");
        System.out.println("   Tubo  1       Tubo  2       Tubo  3       Tubo  4  ");
        System.out.println();
    }
 
   
    //Mover Colores e Insertar Colores
    public static void moverColores(Stack<String> pilaMover, Stack<String> pilaIngresar, int contPila1, int contPila2, int[] contadores) {
        if (!pilaMover.isEmpty() && contadores[contPila2] < 4) {
            if (pilaIngresar.isEmpty()) {
                pilaIngresar.push(pilaMover.pop());
                contadores[contPila1]--;
                contadores[contPila2]++;
                System.out.println("Movimiento exitoso");
            } else if (pilaMover.peek().equals(pilaIngresar.peek())) {
                pilaIngresar.push(pilaMover.pop());
                contadores[contPila1]--;
                contadores[contPila2]++;
                System.out.println("Movimiento exitoso");
            } else {
                System.out.println("Movimiento inválido");
            }
        } else {
            System.out.println("Movimiento inválido");
        }
    }

    public static boolean verificarVictoria(Stack<String> p1, Stack<String> p2, Stack<String> p3, Stack<String> p4) {

        Stack<?>[] pilas = {p1, p2, p3, p4};

        for (Stack<?> pila : pilas) {

            if (pila.isEmpty()) {
                continue; // tubo vacío está bien
            }
            if (pila.size() != MAX_CAPACIDAD) {
                return false; //tubo incompleto
            }
            Object color = pila.get(0);

            for (Object bola : pila) {

                if (!bola.equals(color)) {
                    return false; // colores mezclados
                }
            }

        }
        return true;
    }
}
