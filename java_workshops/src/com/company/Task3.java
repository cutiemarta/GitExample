package com.company;

public class Task3
{
    public static void main(String[] args)
    {
        String[] tab = {"Monika", "Ola", "Ala"};
        int sum = 0;
        for (int i=0; i < tab.length; ++i)
        {
            System.out.println(tab[i].toLowerCase());
            System.out.println("Dlugosc slowa " + tab[i] + " to: " + tab[i].length());
            sum += tab[i].length();
        }
        System.out.print(sum);
    }
}
