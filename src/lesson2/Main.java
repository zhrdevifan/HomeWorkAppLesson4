package lesson2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        within10and20();
        isPositiveOrNegative();
        isNegative();
        printWordNTimes();
       // whoIsVesokosniy();


    }


    public static void within10and20() {
        {
            System.out.println("           второй урок");
            System.out.println("          |____________|");
            System.out.println("        Первое задание");
            int a = 3, b = 14, i = 10, j = 20, x = a + b;

            if (x < i || x > j) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }

    public static boolean isPositiveOrNegative() {    /*что-то я синтаксически замучался с выполнением
                                                        сведением
                                                        первого и второго задания...
                                                        */
        System.out.println("        Второе задание");
        int x = 222;
        int i = 0;
        if (x >= i) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
        return false;
    }

    public static boolean isNegative() {
        System.out.println("        Третее задание");
        int a = 1, b = 0;
        boolean bool = a < b;
        if (a < b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return false;


    }

    public static void printWordNTimes() {
        System.out.println("      Четвертое задание");
        for (int i = 0; i < 10; i++)
            System.out.println("Съешь этих хрустящих французских булок...");
    }
}

   // public static void whoIsVesokosniy() {
   // public class Gscan{
      //  scanner input = new Scanner(System.in);
       // int god;
       // System.out.println("Введи год ");
        //god = input.nextInt



    //int vesokos4 = q % w;
    //System.out.println("vesokos4");












