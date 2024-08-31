/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo;
import java.util.Scanner;
/**
 *
 * @author Yock PC-2
 */
public class Arreglo {

    public static void mensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        int numero = 0;
        int suma = 0;
        int multiplicacion = 1;
        int mayor = 0;
        int menor = 0;
        int respuesta = 0;
        
        mensaje("Ingrese el tamaño del arreglo");
        longitud = sc.nextInt();
        
        int [] arreglo = new int [longitud];
        
        for(int i=0; i<longitud; i++){
            mensaje("Ingrese dato en la posición: " + (i+1));
            arreglo[i] = sc.nextInt();

            suma += arreglo[i];
            multiplicacion *= arreglo[i];
        }
        
        mayor = arreglo[0]; 
        menor = arreglo[0]; 
        
        for (int i = 1; i < longitud; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }

        mensaje("La suma es: " + suma);
        mensaje("La multiplicación es: " + multiplicacion);
        mensaje("El mayor elemento es: " + mayor);
        mensaje("El menor elemento es: " + menor);
        
        mensaje("Ingrese numero a buscar");
        numero = sc.nextInt();
        
        for (int i = 0; i < longitud; i++){
            if(arreglo[i]== numero){
                mensaje("El numero esta en la posicion: " + i);
                respuesta = 1;
            }
        }
        if(respuesta != 1){
            mensaje("El numero no existe");
        }
    }
}
