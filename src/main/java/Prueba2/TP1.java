package Prueba2;

import java.util.Scanner;

public class TP1 {

    Scanner teclado = new Scanner(System.in);

    public void mostrarEj1() {
        int[] numerosIngresados = new int[3];
        int cuentaDiferentes = 0;
        int sumoNumeros = 0;
        System.out.println("___Ingrese 3 números___");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese número " + (i + 1) + ": ");
            /*Quedaría mejor así con un print para que no salte de línea cada vez que pido un número, o sea
            System.out.print("Ingrese número "+(i+1)+": ");
            Pero lo hago y no se muestra en consola ese String que le mando como parámetro
            Salta directamente a la línea del ingreso por teclado*/
            numerosIngresados[i] = teclado.nextInt();
            sumoNumeros += numerosIngresados[i];
        }
        if (numerosIngresados[0] != numerosIngresados[1]) {
            cuentaDiferentes++;
        }
        if (numerosIngresados[0] != numerosIngresados[2]) {
            cuentaDiferentes++;
        }
        if (numerosIngresados[1] != numerosIngresados[2]) {
            cuentaDiferentes++;
        }
        //todo eso de arriba tiene como resultados posibles para cuentaDiferente 0, 2 o 3.
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                int aux;
                if (numerosIngresados[i] > numerosIngresados[j]) {
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
        if (cuentaDiferentes == 0) {
            System.out.println("No hay números diferentes");
        } else {
            System.out.println("Hay " + cuentaDiferentes + " números distintos");
        }
        System.out.println("El promedio da " + ((float) sumoNumeros) / 3);
        //Arriba divido por 3 al casteo a float de ese int
        System.out.println("La suma de los números da " + sumoNumeros);
        System.out.println("El producto del menor por el mayor da " + numerosIngresados[0] * numerosIngresados[2]);
        if (numerosIngresados[1] % 3 == 0) {
            System.out.println("El número del medio es múltiplo de 3");
        } else {
            System.out.println("El número del medio no es múltiplo de 3");
        }
    }//cierra método mostrarEj1()

    public void mostrarEj2() {
        int anioIngresado;
        do {
            System.out.println("Ingrese el año en cuestión para saber si es bisiesto:");
            anioIngresado = teclado.nextInt();
            if (anioIngresado > 0) {
                if (anioIngresado % 400 == 0) {
                    System.out.println(anioIngresado + " es año bisiesto!");
                } else if (anioIngresado % 4 == 0) {
                    if (anioIngresado % 100 == 0) {
                        System.out.println(anioIngresado + " no es año bisiesto!");
                    } else {
                        System.out.println(anioIngresado + " es año bisiesto!");
                    }
                } else {
                    System.out.println(anioIngresado + " no es año bisiesto!");
                }
            } else {
                System.out.println("El año debe ser un número positivo!!");
            }
        } while (anioIngresado < 0);

    }//cierra método mostrarEj2()

    public void mostrarEj3() {
        int numeroIngresado;
        long calculaFactorial = 1;
        do {
            System.out.println("¿De qué número te digo el factorial?: ");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado > 0) {
                for (int i = 1; i <= numeroIngresado; i++) {
                    calculaFactorial = calculaFactorial * i;
                }
            } else {
                System.out.println("Necesitamos un número positivo para el factorial!");
            }
        } while (numeroIngresado < 1);
        System.out.println("El factorial de " + numeroIngresado + " es " + calculaFactorial);
    }//cierra método mostrarEj3()

    public void mostrarEj4() {
        int numeroIngresado;
        do {
            System.out.println("¿De qué número querés saber sus divisores?");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado > 0) {
                System.out.println("Sus divisores son los siguientes:");
                /*empiezo desde 1 para evitar dividir por 0. Considero la posibilidad de
                tomar al número ingresado como divisor de si mismo, por eso <= en vez de <*/
                for (int i = 1; i <= numeroIngresado; i++) {
                    if (numeroIngresado % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                System.out.println("El número debe ser positivo!");
            }
        } while (numeroIngresado < 0);
    }//cierra método mostrarEj4()

    public void mostrarEj5() {
        int tablaDel;
        do {
            System.out.println("¿De qué número querés saber las tablas?");
            tablaDel = teclado.nextInt();
            if ((tablaDel >= 1) && (tablaDel <= 10)) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(tablaDel + " x " + i + " = " + tablaDel * i);
                }
            } else {
                System.out.println("Este programa muestra las tablas de números del 1 al 10. Intentá con otro número...");
            }
        } while ((tablaDel < 1) || (tablaDel > 10));
    }//cierra método mostrarEj5()

    public void mostrarEj6() {
        int numerosIngresados[] = new int[2];
        int sumoMultiplos = 0;
        System.out.println("Se sumarán todos los múltiplos de 5 comprendidos entre 2 números positivos");
        do {
            System.out.println("Ingrese un número");
            numerosIngresados[0] = teclado.nextInt();
            if (numerosIngresados[0] < 0) {
                System.out.println("El número debe ser positivo. Intentá de nuevo....");
            }
        } while (numerosIngresados[0] < 0);
        do {
            System.out.println("Ingrese otro número");
            numerosIngresados[1] = teclado.nextInt();
            if (numerosIngresados[1] < 0) {
                System.out.println("El número debe ser positivo. Intentá de nuevo....");
            }
        } while (numerosIngresados[1] < 0);
        if (numerosIngresados[0] > numerosIngresados[1]) {
            int aux = numerosIngresados[0];
            numerosIngresados[0] = numerosIngresados[1];
            numerosIngresados[1] = aux;
        }
        for (int i = numerosIngresados[0]; i <= numerosIngresados[1]; i++) {
            if (i % 5 == 0) {
                sumoMultiplos += i;
            }
        }
        System.out.println("Los múltiplos de 5 entre " + numerosIngresados[0] + " y " + numerosIngresados[1] + " suman " + sumoMultiplos);
    }//cierra método mostrarEj6()

    public void mostrarEj7() {
        final int numeroParaAdivinar = 373;
        int intentarAdivinar;
        System.out.println("Ahora tenés que adivinar un número");
        do {
            System.out.println("¿Qué número creés que es?");
            intentarAdivinar = teclado.nextInt();
            if (intentarAdivinar < numeroParaAdivinar) {
                System.out.println("NO. El número es mayor. Seguí intentando...");
            } else if (intentarAdivinar > numeroParaAdivinar) {
                System.out.println("NO. El número es menor. Seguí intentando...");
            } else {
                System.out.println("CORRECTO! Adivinaste");
            }
        } while (intentarAdivinar != numeroParaAdivinar);
    }//cierra método mostrarEj7()

    public void mostrarEj8() {
        int dimensionArray, numeroMinimo, numeroMaximo;
        numeroMinimo = 0;
        numeroMaximo = 0;
        int sumaNumeros = 0;
        int[] numerosIngresados = new int[20];
        System.out.println("¿Cuántos números vas a ingresar?");
        dimensionArray = teclado.nextInt();
        for (int i = 0; i < dimensionArray; i++) {
            System.out.println((i + 1) + ") ");
            numerosIngresados[i] = teclado.nextInt();
            if (i == 0) {
                numeroMinimo = numerosIngresados[i];
                numeroMaximo = numerosIngresados[i];
            } else {
                if (numerosIngresados[i] > numeroMaximo) {
                    numeroMaximo = numerosIngresados[i];
                }
                if (numerosIngresados[i] < numeroMinimo) {
                    numeroMinimo = numerosIngresados[i];
                }
            }
        }
        for (int i = numeroMinimo; i <= numeroMaximo; i++) {
            sumaNumeros += i;
        }
        //sumaNumeros = (numeroMinimo + numeroMaximo) * (1 + numeroMaximo - numeroMinimo) / 2;
        System.out.println("La suma entre los números comprendidos entre el mínimo " + numeroMinimo + " y el máximo " + numeroMaximo + " incluidos ambos da " + sumaNumeros);
    }//cierra método mostrarEj8()

    public void mostrarEj9() {
        int radioCirculo;
        do {
            System.out.println("Ingrese el radio del círculo (número entero");
            radioCirculo = teclado.nextInt();
            if (radioCirculo < 0)
                System.out.println("El radio debe ser un número positivo");
        } while (radioCirculo < 0);
        System.out.println("El diámetro es "+ radioCirculo * 2 + ". La circunferencia es " + Math.PI*radioCirculo * 2 + ". El área es " + Math.PI * radioCirculo * radioCirculo);
    }//cierra método mostrarEj9()
    
    public void mostrarEj10() {
        final int listaEmpleados [][] = {{42, 3500},{28, 4000},{50, 4200},{33, 6000},{25, 7000}};
        final float sueldoBonificado = (float) 1.5;
        int [] sueldoBruto = new int [5];
        for (int numeroEmpleado = 0; numeroEmpleado < 5; numeroEmpleado++) {
            if (listaEmpleados[numeroEmpleado][0] <= 40){
                sueldoBruto[numeroEmpleado] = listaEmpleados[numeroEmpleado][0]*listaEmpleados[numeroEmpleado][1];
            } else {
                sueldoBruto[numeroEmpleado] = (int) (40*listaEmpleados[numeroEmpleado][1] + (listaEmpleados[numeroEmpleado][0]-40)*listaEmpleados[numeroEmpleado][1]*sueldoBonificado);
            }
            System.out.println("Empleado " + (numeroEmpleado + 1) + ": Horas trabajadas: " + listaEmpleados[numeroEmpleado][0] + ". Sueldo por hora: " + listaEmpleados[numeroEmpleado][1]);
            System.out.println("Sueldo bruto: " + sueldoBruto[numeroEmpleado]);
        }
    }//cierra método mostrarEj10()
}//cierra clase TP1
