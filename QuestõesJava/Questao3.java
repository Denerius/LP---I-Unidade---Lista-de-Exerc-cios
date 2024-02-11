package com.mycompany.questao3;

import java.util.Scanner;

public class Questao3 {

    int x, s1, s2, m1, m2, h1, h2, sr, hr, mr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro horário:\nh:");
        var h1 = sc.nextInt();
        System.out.println("m:");
        var m1 = sc.nextInt();
        System.out.println("s:");
        var s1 = sc.nextInt();
        System.out.println("Digite o segundo horário:\nh:");
        var h2 = sc.nextInt();
        System.out.println("m:");
        var m2 = sc.nextInt();
        System.out.println("s:");
        var s2 = sc.nextInt();
        System.out.println("Escolha a operação:\n1: soma\n0: diferença");
        var x = sc.nextInt();
        if (x == 1) {
            var hr = h1 + h2;
            var mr = m1 + m2;
            var sr = s1 + s2;
            if (sr > 60) {
                sr -= 60;
                mr++;
            }
            if (mr > 60) {
                mr -= 60;
                hr++;
            }
            System.out.println("A soma dos dois horários é:\n" + hr + ":" + mr + ":" + sr);
        }
        else if (x == 0){
            var hr = h1 - h2;
            var mr = m1 - m2;
            var sr = s1 - s2;
            if(sr<0){
                sr += 60;
                mr--;
            }
            if(mr<0){
                mr += 60;
                hr--;
            }
            if(hr<0){
                hr=hr*-1;
                System.out.println("A diferença dos dois horários é:\n" + hr + ":" + mr + ":" + sr);
            }
            else {
                System.out.println("A diferença dos dois horários é:\n" + hr + ":" + mr + ":" + sr);
            }          
        }
        else 
            System.out.println("ERRO");

    }
}
