

package com.mycompany.questao4;

import java.util.Scanner;

public class Questao4 {
     String num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        var num = sc.nextLine();
        System.out.println("O número possui " + num.length() + " dígitos.");
        
    }
}
