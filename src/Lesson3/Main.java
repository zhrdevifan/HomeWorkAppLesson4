package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        massive021_120();
        massiv100();
        zadanie3();
        diagonal();
        len();

    }

    private static boolean massive021_120() {
        System.out.println("задание 1: массив с переводом 0в1и1в0");
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++){
            if (arr [i] == 1){
              System.out.print ((arr [i]*0) + " ");
           }else{
                System.out.print( (arr [i]+1)  + " ");
           }
        }
        return false;
    }
    public static void massiv100 (){
        System.out.println(" ");
        System.out.println("Задание 2: массив до 100");
        int[] arr = new int [101];
        for (int i = 1; i < arr.length ; i++){
            System.out.print(+i + " ");
        }
    }

    public static boolean zadanie3 () {
        System.out.println("  ");
        System.out.println("Задание 3: ");
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++){
            if (arr [i] < 6) {
                System.out.print((arr[i] * 2) + " ");
            }else{
                System.out.print(arr[i] + " ");
            }



    }
        return false;
    }

    public static void diagonal () {
        System.out.println("  ");
        System.out.println("Задание 4: тут мы должны заполнить дагонали единицами ");
        int[][] arr = new int[4][4];
        for (int i=0; i < arr[0].length; i++) {
            arr[0][0] = 1;
            for (int j = 0; j < arr[0].length; j++){
                arr[0][3] = 1;
            }
        }
        for (int i=0; i < arr[0].length; i++) {
            arr[1][1] = 1;
            for (int j = 0; j < arr[0].length; j++) {
                arr[1][2] = 1;
            }
        }
        for (int i=0; i < arr[0].length; i++) {
            arr[2][2] = 1;
            for (int j = 0; j < arr[0].length; j++) {
                arr[2][1] = 1;
            }
        }
        for (int i=0; i < arr[0].length; i++) {
            arr[3][3] = 1;
            for (int j = 0; j < arr[0].length; j++) {
                arr[3][0] = 1;
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
                //System.out.print(arr[i][j] + "  ");
                }System.out.println();
        }



        }


    public static void len() {
        System.out.println(" задание 5");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int initialValue = scanner.nextInt();
        //int arr [] = new int [len] [initialValue];
        int[] arr = new int [len];
        arr [5] = initialValue;

        //for (int initialValue = 1; initialValue < arr.length +1 ; initialValue++){
            System.out.print(arr[len]);}





    }






   // public static void massive021(String args []) {







