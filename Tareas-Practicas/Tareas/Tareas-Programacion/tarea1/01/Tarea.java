/*
Programa 1

Nombres: Carlos Eduardo Moreno Vargas, Joan Lazaro Silva, Joaquin Castro Cordova, Cesar Alejandro Rojas Murrieta

Curso: Programacion Avazada 2024-2

Descripcion: Programa que recibe una entrada del usuario en un rango de valores especificada e imprime el numero, los numeros generados en el rango de numeros y los intentos   

**/

import java.util.Scanner;
import java.util.Random;


public class Tarea {

/*
Metodo estatico que recibe una entrada del usuario y genera numeros aleatorios  
en un rango de -5 a 5
*/ 
public static int generar(Scanner entrada){

int entradaNum, numeroGenerado;
int contador = 0;
 
 Random rand = new Random();

 StringBuilder numerosIngresados = new StringBuilder();


 System.out.println("Ingrese algun numero entre el -5  y 5: \n");

  entradaNum = entrada.nextInt();
 
do{

    numeroGenerado = rand.nextInt(11)-5;  
 
    numerosIngresados.append(numeroGenerado).append(", ");
      contador++;
      
  }while (entradaNum != numeroGenerado);


System.out.println("Numero entre -5 y 5: " + entradaNum);
System.out.println("Los numeros son: " +  numerosIngresados.toString());
System.out.println("Numero de intentos: " + contador);
 

 return contador + entradaNum + numeroGenerado; 


 }

 public static void main(String[] args){

 Scanner entrada = new Scanner (System.in);
  
 int resultados = Tarea.generar(entrada);
 
}






}

