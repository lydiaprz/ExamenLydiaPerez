package ejercicios;

import java.util.Scanner;

/**
 * Las pruebas realizadas son las siguientes:
 * 7856 ---> El numero contiene 2 cifras pares y 2 cifras impares.
 * 0 ---> El numero contiene 0 cifras pares y 0 cifras impares.
 * -5241 ---> El numero debe ser positivo.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        //declaramos la variable en la que guardaremos el numero proporcionado por el usuario
        int num;
        //declaramos la variable donde guardaremos la cifra que estamos comprobando en el momento
        int cif;
        //declaramos los contadores de pares e impares
        int par=0, impar=0;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos al usuario el numero
        System.out.println("Introduzca un numero entero:");
        num= sc.nextInt();
        //comprobamos si el numero es correcto
        if (num<0){
            System.out.println("El numero debe ser positivo.");
        }
        else{
            //mientras el numero tenga cifras para comprobar en la variable cifra guardaremos
            // la ultima cifra y comprobaremos que si el resultado de la cifra entre dos en
            // cero sera par por lo cual aumentaremos la variable par, y si no aumentaremos la variable impar
            while (num!=0){
                cif=num%10;
                if (cif%2==0){
                    par++;
                }else{
                    impar++;
                }
                num/=10;
            }
            System.out.println("El numero contiene "+par+" cifras pares y "+impar+" cifras impares.");
        }
    }
}
