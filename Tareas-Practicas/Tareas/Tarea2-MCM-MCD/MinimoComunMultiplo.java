/*

  Created by ComputerChem

*/


import java.util.Scanner;


public class MinimoComunMultiplo{

    public static void main(String[] args){


	

     Scanner sn = new Scanner(System.in);
     
     System.out.println("Introduce el primer numero");
     int num1 = sn.nextInt();
     
     System.out.println("Introduce el Segundo Numero");
     int num2 = sn.nextInt();

     System.out.println("Introduce el Tercer Numero");
     int num3 = sn.nextInt();

     System.out.printf("MCM: ," + resultado);
     System.out.printf("MCD: ," + resultado);
     

 }
    
    public static int mcm(int num1, int num2){


	int a = Math.max (num1, num2);
	int b = Math.max (num1, num2);


	int resultado = (a / mcm(num1, num2)) * b;

	   

	    return resultado;



}

   public static int mdc(int num1, int num2){


     int a = Math.max (num1, num2);
     int b = Math.max (num1, num2);


     int resultado = 0;

     
     do {
     resultado = b;
      b = a % b;
      a = resultado;

      }while(b != 0);

     return resultado; 
	 
    }

 }


