package Lesson3;

public class Main {

    public static void main (String[] args) {
        massive021();

    }


    public static void massive021(String args []) {

        System.out.println("задание 1: массив с переводом 0в1");
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i;
            System.out.println("arr[" + i +"] = " + arr [i]);
        }



    }
}
