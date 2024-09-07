/*
Programa 2

Nombres: Carlos Eduardo Moreno Vargas, Joan Lazaro Silva, Joaquin Castro Cordova, Cesar Alejandro Rojas Murrieta

Curso: Programacion Avazada 2024-2

**/



public class Tarea{


public static int rangoDigitos(int n){


  if (n < 0){ 

 System.out.println("Numero menor a cero"); 

    return -1; 

     }  

 if (n < 10){

       return 0;

 }


int maxDigito = 0;
int minDigito = 9;


 while(n > 0){

   int digito = n % 10; 

 if (digito > maxDigito){

   maxDigito = digito; 

   } 
 
 if (digito < minDigito){

    minDigito = digito;
  

        }

   n /= 10;


     }

    return maxDigito - minDigito;
    

 }


public static void main(String[] args){


System.out.println(rangoDigitos(5));
System.out.println(rangoDigitos(26));
System.out.println(rangoDigitos(725));
System.out.println(rangoDigitos(777));
System.out.println(rangoDigitos(24680));
System.out.println(rangoDigitos(3876254));


   }

 }





