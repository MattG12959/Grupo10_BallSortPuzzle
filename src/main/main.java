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

    public static void main(String[] args) {
        Stack<String> Pila1 = new Stack<>();
        Stack<String> Pila2 = new Stack<>();
        Stack<String> Pila3 = new Stack<>();
        Stack<String> Pila4 = new Stack<>();
        Scanner key = new Scanner(System.in);
        //Switch
        int num = 0; int num2 = 0;
        
        //Contadores de Pilas
        int contPila1 = 4;
        int contPila2 = 4;
        int contPila3 = 4;
        int contPila4 = 0;
        
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
                
        
         /*
         * -Mostar como estan formadas las pilas
         */

        while(num != 5) {
            System.out.print("¿De cúal pila desea mover el color del tope? |1|2|3|4| - (5) para salir del programa: ");
            num = key.nextInt();

            switch (num) {
                case 1:
                    System.out.print("\n¿A qué pila desea insertar el color? |2|3|4| : ");
                    num2 = key.nextInt();

                    switch (num2) {
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

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

                            break;
                        case 3:

                            break;
                        case 4:

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

                            break;
                        case 2:

                            break;
                        case 4:

                            break;
                        default:
                            System.out.println("\nNúmero no valido, volver a ingresar.");
                    }
                    break;
                case 4:
                    System.out.print("\n¿A qué pila desea insertar el color? |1|2|3| : ");
                    num2 = key.nextInt();
                    switch (num2) {
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

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

    //Mostar Pilas
    public void mostrarPilas( Stack<String> Pila1, Stack<String> Pila2, Stack<String> Pila3, Stack<String> Pila4){
        System.out.println("Pila 1: " + Pila1);
        System.out.println("Pila 2: " + Pila2);
        System.out.println("Pila 3: " + Pila3);
        System.out.println("Pila 4:" + Pila4);
    }
    
    //Mover Colores e Insertar Colores
    public Stack<String> moverColores(Stack<String> pilaMover, Stack<String> pilaIngresar, int contPila1, int contPila2){
        return null;
    }
}
