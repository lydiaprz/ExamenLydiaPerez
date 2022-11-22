package ejercicios;

import java.util.Scanner;

/**
 * La prueba realizada es :
 * pepe, 7, 5, 6 --->
 *          nota final: 5.6
 * sara, 8, 9, 2 --->
 *          nota final: 6.1
 * luisa, 5, 9, 10 --->
 *          nota final: 9
 * lorena, 1, 2, 3 --->
 *          nota final: 2.3
 * nota maxima: luisa, 9
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        //declaramos las variables donde guararemos los datos introducidos por el usuario
        int nPractica, nProblemas, nTeoria, cont=0, menu;
        double nFinal, nMax=0, nMin=0, media=0, suma=0;
        String nombre, aMax=null, aMin=null;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos los datos de los alumnos hasta que el usuario nos indique el nombre como 0
        System.out.println("Introduzca el nombre del alumno(Introduzca 0 si desea dejar de insertar alumnos):");
        nombre=sc.next();

        while(!nombre.equals("0")){
            System.out.println("Introduzca la nota de la practica:");
            nPractica= sc.nextInt();
            System.out.println("Introduzca la nota de los problemas:");
            nProblemas= sc.nextInt();
            System.out.println("Introduzca la nota de la teoria:");
            nTeoria= sc.nextInt();
            //comprobamos que las notas estan dentro del rango
            if(nPractica<0||nPractica>10||nProblemas<0||nProblemas>10||nTeoria<0||nTeoria>10){
                System.out.println("La nota esta fuera de rango.");
            }
            else {
                //en caso de que esten aumentamos el contador para hacer despues la media
                cont++;
                //calculamos la nota final con las ponderaciones respectibas
                nFinal=(double) (nPractica*0.1)+(nProblemas*0.5)+(nTeoria*0.4);
                System.out.println("El alumno tiene un "+nFinal);
                //sumamos las notas que llevamos ingresadas
                suma+=nFinal;
                //comprobamos que nota es la mas alta o la mas baja y guardamos el nombre y
                // la nota del usuario en las variables de maximo o minimo para comparar las
                // notas con el siguiente alumno que introduzcamos
                if (nFinal>nMax){
                    nMax=nFinal;
                    aMax=nombre;
                } else if (nFinal<nMin) {
                    nMin=nFinal;
                    aMin=nombre;
                }
                //hacemos la media
                media=suma/cont;
            }
            System.out.println("Introduzca el nombre del alumno(Introduzca 0 si desea dejar de insertar alumnos):");
            nombre=sc.next();
        }
        //mostramos el menu y recogemos la opcion que nos guiara el switch
        System.out.println("Elija una opcion:\n"+
                "1. Nota máxima\n" +
                "2. Nota mínima\n" +
                "3. Media de las notas\n");
        menu= sc.nextInt();
        switch (menu){
            //el primer caso nos muestra al alumno con la nota mas alta
            case 1->{
                System.out.println("El alumno con la nota maxima es "+aMax+" con un "+nMax+".");
            }
            //el segundo caso nos muestra al alumno con la nota mas baja
            case 2->{
                System.out.println("El alumno con la nota minima es "+aMin+" con un "+nMin+".");
            }
            //el tercer caso nos muestra la media de todas las notas
            case 3->{
                System.out.println("La media de las notas de la clase es "+media+".+");
            }
            default->{
                System.out.println("Opcion no valida.");
            }
        }
    }
}
