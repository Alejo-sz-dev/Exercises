package com.exercises.demo;
import java.util.Scanner;

public class Variables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame altura del rectangulo: " );
        var altura = Integer.parseInt(sc.nextLine());
        System.out.print("Dame base del rectangulo: " );
        var base = Integer.parseInt(sc.nextLine());
        var area = altura * base;
        System.out.print("EL area del rectangulo es: " + area);
        
    }
}