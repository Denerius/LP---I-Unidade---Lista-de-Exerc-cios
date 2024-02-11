

package com.mycompany.questao2;
import java.util.Scanner;
public class Questao2 {
    char a,b;
    int livro;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos livros você deseja comprar: ");
        var livro = sc.nextInt();
        var a = 0.25*livro+7.50;
        var b = 0.50*livro+2.50;
        if (a>b){
            System.out.println("A opção mais vantajosa é o critério A, saindo por " + a + " reais." );
        }
        else 
            System.out.println("A opção mais vantajosa é o critério B, saindo por " + b + " reais.");
    }
}
