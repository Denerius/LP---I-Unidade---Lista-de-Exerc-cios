
package com.mycompany.questao1;
import java.util.Scanner;
public class Questao1 {
    float media,rec,fim,n1,n2,n3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas três notas: ");
        var n1 = sc.nextFloat();
        var n2 = sc.nextFloat();
        var n3 = sc.nextFloat();
        var media = (n1+n2+n3)/3; 
        
        if (media>=7){
            System.out.println("Média " + media + "\nAprovado.");
        }
        else if (media<7){
            System.out.println("Digite a nota da sua recuperação: ");
            var rec = sc.nextFloat();
            var fim = (media+rec)/2;
            if(fim>=5){
                System.out.println("Média final " + fim + "\nAprovado.");                                   
            }
            else 
                System.out.println("Reprovado.");
        }   
        
    }
}
