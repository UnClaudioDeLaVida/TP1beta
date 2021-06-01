package Prueba2;
import java.util.Scanner;

public class TP1 {
    Scanner teclado=new Scanner(System.in);
    public void mostrarEj1() {        
        int [] numerosIngresados = new int[3];
        int cuentaDiferentes = 0;
        int sumoNumeros = 0;
        System.out.println("___Ingrese 3 números___");
        for(int i = 0; i < 3; i++) {
            System.out.println("Ingrese número "+(i+1)+": ");
            /*Quedaría mejor así con un print para que no salte de línea cada vez que pido un número, o sea
            System.out.print("Ingrese número "+(i+1)+": ");
            Pero lo hago y no se muestra en consola ese String que le mando como parámetro
            Salta directamente a la línea del ingreso por teclado*/
            numerosIngresados[i]=teclado.nextInt();
            sumoNumeros+=numerosIngresados[i];
        }
        if (numerosIngresados[0]!=numerosIngresados[1]) {
            cuentaDiferentes++;
        }
        if (numerosIngresados[0]!=numerosIngresados[2]) {
            cuentaDiferentes++;
        }
        if (numerosIngresados[1]!=numerosIngresados[2]) {
            cuentaDiferentes++;
        }
        //todo eso de arriba tiene como resultados posibles para cuentaDiferente 0, 2 o 3.
        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                int aux;
                if (numerosIngresados[i]>numerosIngresados[j]){
                    aux = numerosIngresados[i];
                    numerosIngresados[i] = numerosIngresados[j];
                    numerosIngresados[j] = aux;
                }
            }
        }
        /*el ordenamiento (burbuja, de menor a mayor) lo voy a usar para el del producto
        entre el menor y el mayor, así el menor queda en la posición 0 y el mayor en la 2
        Y directamente hago el producto entre numeros[0] y numeros[2]. También lo uso para
        ver si el restante (en posicion 1 del vector) es mútiplo de 3*/
        if (cuentaDiferentes==0){
            System.out.println("No hay números diferentes");
        }
        else{   
            System.out.println("Hay "+cuentaDiferentes+" números distintos");
        }
        System.out.println("El promedio da "+((float) sumoNumeros)/3);
        //Arriba divido por 3 al casteo a float de ese int
        System.out.println("La suma de los números da "+sumoNumeros);
        System.out.println("El producto del menor por el mayor da "+numerosIngresados[0]*numerosIngresados[2]);
        if (numerosIngresados[1]%3==0){
            System.out.println("El número del medio es múltiplo de 3");
        }
        else{
            System.out.println("El número del medio no es múltiplo de 3");
        }
    }//cierra método mostrarEj1()
    public void mostrarEj2(){
        int anioIngresado;
        do {
            System.out.println("Ingrese el año en cuestión para saber si es bisiesto:");
            anioIngresado = teclado.nextInt();
            if (anioIngresado>0){
                if (anioIngresado%400==0) {
                System.out.println(anioIngresado + " es año bisiesto!");
                }
                else if (anioIngresado%4==0) {
                    if (anioIngresado%100==0)
                        System.out.println(anioIngresado + " no es año bisiesto!");
                    else
                        System.out.println(anioIngresado + " es año bisiesto!");
                } else 
                    System.out.println(anioIngresado + " no es año bisiesto!");
            } else
                System.out.println("El año debe ser un número positivo!!");
        } while (anioIngresado < 0);
        
    }//cierra método mostrarEj2()
    public void mostrarEj3(){
        int numeroIngresado;
        long calculaFactorial = 1;
        do {
            System.out.println("¿De qué número te digo el factorial?: ");
            numeroIngresado =  teclado.nextInt();
            if (numeroIngresado > 0) {
                for (int i = 1; i <= numeroIngresado; i++) {
                calculaFactorial = calculaFactorial * i;
                }
            }
            else {
                System.out.println("Necesitamos un número positivo para el factorial!");
            }
        } while (numeroIngresado < 1);
        System.out.println("El factorial de "+ numeroIngresado + " es "+ calculaFactorial);
    }//cierra método mostrarEj3()
    public void mostrarEj4(){
        int numeroIngresado;
        do {
            System.out.println("¿De qué número querés saber sus divisores?");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado > 0){
                System.out.println("Sus divisores son los siguientes:");
                /*empiezo desde 1 para evitar dividir por 0. Considero la posibilidad de
                tomar al número ingresado como divisor de si mismo, por eso <= en vez de <*/
                for (int i = 1; i <= numeroIngresado; i++) {
                    if (numeroIngresado % i == 0)
                        System.out.print(i + " ");
                }
            } else
                System.out.println("El número debe ser positivo!");
        }while (numeroIngresado<0);
    }//cierra método mostrarEj4()
    public void mostrarEj5(){
        int tablaDel;
        do {
        System.out.println("¿De qué número querés saber las tablas?");
        tablaDel = teclado.nextInt();
            if ((tablaDel>=1)&&(tablaDel<=10)) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(tablaDel + " x " + i + " = "+ tablaDel*i);
                }
            } else{
                System.out.println("Este programa muestra las tablas de números del 1 al 10. Intentá con otro número...");
            }
        } while ((tablaDel<1)||(tablaDel>10));
    }//cierra método mostrarEj5()
    public void mostrarEj6(){
        
    }
}//cierra clase TP1
