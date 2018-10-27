package com.company;

public class HelloWorld
{
    public static void main(String[] args)
    {
        int i = 9;
        long ageOfUniverse = 2957283849834764397L;
        float a = 8.9f;
        double d = 8.9; //zmiennoprzecinkowe domyslnie double
        char c = 'a';
        boolean isJavaFun = true;

        System.out.println("Hello world!");
        System.out.println(ageOfUniverse);
        System.out.println(isJavaFun);

        int var1 = 10, var2 = 4;

        System.out.println((double)var1/var2); //lub var1/(double)var2

        String name = "Marta";

        System.out.println(name);

        int[] tab = {1, 2, 3};
        double[] tabD = new double[10];
        tabD[0] = 0.9;

        System.out.println(tab[1]);

        int[][] tab2 = new int[3][]; //java przechowuje w tablicy hashowej
        tab2[0] = new int[5];
        tab2[1] = new int[4];
        tab2[2] = new int[2];

        tab2[1][0] = 1;


    }
}
