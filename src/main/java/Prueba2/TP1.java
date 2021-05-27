package Prueba2;
import java.util.Scanner;

public class TP1 {
    public void Ej1() {
        Scanner teclado=new Scanner(System.in);
        int [] numeros = new int[3];
        int cuentaDiferentes = 0;
        float promedio;
        int sumoNumeros = 0;
        System.out.println("___Ingrese 3 números___");
        for(int i = 0; i < 3; i++) {
            System.out.println("Ingrese número "+(i+1)+": ");
            /*Quedaría mejor así con un print para que no salte de línea cada vez que pido un número
            pero no me lo toma:
            System.out.print("Ingrese número "+(i+1)+": ");*/
            numeros[i]=teclado.nextInt();
            sumoNumeros+=numeros[i];
        }
        if (numeros[0]!=numeros[1]) {
            cuentaDiferentes++;
        }
        if (numeros[0]!=numeros[2]) {
            cuentaDiferentes++;
        }
        if (numeros[1]!=numeros[2]) {
            cuentaDiferentes++;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                int aux;
                if (numeros[i]>numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        if (cuentaDiferentes==0){
            System.out.println("No hay números diferentes");
        }
        else{   
            System.out.println("Hay "+cuentaDiferentes+" números distintos");
        }
        System.out.println("El promedio da "+((float) sumoNumeros)/3);
        System.out.println("La suma de los números da "+sumoNumeros);
        System.out.println("El producto del menor por el mayor da "+numeros[0]*numeros[2]);
        if (numeros[1]%3==0){
            System.out.println("El número del medio es múltiplo de 3");
        }
        else{
            System.out.println("El número del medio no es múltiplo de 3");
        }
    }//cierra método Ej1
    public void Ej2(){
        
    }
}//cierra clase TP1
