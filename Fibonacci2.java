# Trabalho_Complexidade
Disciplina: Inteligência Artificial. Professor: Carlos Eduardo Costa Vieira. Data de entrega: 24/03/2017.

//Algoritmo de Fibonacci de complexidade linear – O(n)

package Fib2;


public class Fibonacci {
    
     static long fibo(int n) {
        int F = 0;     // atual
        int ant = 0;   // anterior
 
        for (int i = 1; i <= n; i++) {
 
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
 
        }
 
        return F;
    }
 
    public static void main(String[] args) {
            
           //INSIRA POSIÇÃO SOLICITA ABAIXO:
           long tempoInicio = System.currentTimeMillis();
            System.out.println(Fibonacci.fibo(6));
           System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
        }
 
    }
    
