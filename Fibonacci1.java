# Trabalho_Complexidade
Disciplina: Inteligência Artificial. Professor: Carlos Eduardo Costa Vieira. Data de entrega: 24/03/2017.

//Algoritmo de Fibonacci de complexidade exponencial – Ο (2n)    
    
package Fib1;

public class Fibonacci {   
        
    public static int fibRec(int n) {
  if (n <= 1)
   return n;
  else
   return fibRec(n - 1) + fibRec(n - 2);
 }
 // INSIRA POSIÇÃO ABAIXO:
    
 public static void main(String[] args) {
 long tempoInicio = System.currentTimeMillis(); 
 System.out.println(fibRec(6));
 System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
 }
   
}
