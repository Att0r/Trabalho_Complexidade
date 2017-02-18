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
 // test
 public static void main(String[] args) {
  System.out.println(fibRec(3));
 
 }
    
}
