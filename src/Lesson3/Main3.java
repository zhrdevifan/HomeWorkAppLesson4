package Lesson3;

public class Main3 {

    public static void main (String[] args) {
        massive021_120();
        massiv100();
        zadanie3();
        diagonal();

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
        for (int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                //arr [][] = counter
                System.out.print( arr [i][j] + "  ");
            }
             System.out.println();

        }

    }

}


   // public static void massive021(String args []) {







