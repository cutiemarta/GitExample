package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        System.out.println("Daj liczbe");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        System.out.println("Wybrales " + var);

        System.out.println("Daj liczbe1");
        int var1 = scanner.nextInt();
        System.out.println("Daj liczbe2");
        int var2 = scanner.nextInt();
        if (var2 != 0)
        {
            System.out.println("Wynik: " + (double)var1/var2);
        }
        else
        {
            System.out.println("Nie dzielimy przez 0");
        }
    }
}
