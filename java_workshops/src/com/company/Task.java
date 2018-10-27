package com.company;

public class Task
{
    public static void main(String[] args)
    {
        int a = 9;
        if (a>0 && a<5)
        {
            System.out.println("hura!");
        }
        else if (a>5 && a<10)
        {
            System.out.println("wow");
        }
        else
        {
            System.out.println("o nie");
        }

        switch(a)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("9");
        }

        int i = 0;
        System.out.println("");
        while (i<10)
        {
            System.out.println(i++);
        }

        i = 0;
        do {
            System.out.println(i++);
        }
        while (i<10);
    }
}

