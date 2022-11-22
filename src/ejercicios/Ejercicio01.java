package ejercicios;

import java.util.Scanner;

/**
 * La prueba realizada es:
 * 12
 * ************
 * *          *
 * *          *
 * *          *
 * *          *
 * *          *
 * *          *
 * *          *
 * *          *
 * *          *
 * *          *
 * ************
 *
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        //declaramos la variable en la que guardaremos la longitud del lado que nos indique el usuario
        int lado;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos el valor del lado al usuario
        System.out.println("Introduzca la longitud del lado: ");
        lado= sc.nextInt();
        //pintamos el cuadrado
        //con este for recorremos la altura del cuadrado y al acabar cada vuelta se imprime un salto de linea
        for (int i = 0; i < lado; i++) {
            //en la primera y ultima linea imprimiremos la cantidad del lado
            if (i==0||i==lado-1){
                for (int j = 1; j <= lado; j++) {
                    System.out.print("*");
                }
            }
            //en el resto de lineas imprimimos un asterisco al principio y al final y los espacios de
            // separacion del medio serian el numero del lado menos dos
            else {
                System.out.print("*");
                for (int j = 0; j < lado-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
