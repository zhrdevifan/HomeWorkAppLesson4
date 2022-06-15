package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [][] field = initField(3);
        printField(field);

        while (true) {

        HumanTurn(field);
        printField(field);
       if (isDraw(field)) {
       break;
       }
       if (isWinner(field,"X")){
           System.out.println("Вы победили");
           break;
       }

        AITurn(field);
        printField(field);
        if (isDraw(field)){
            break;
    }  if (isWinner(field, "0")){
        System.out.println("Вы проиграли");
        break;
            }
        }

        System.out.println("Game Over");

    }
//тут мы обявляем поле и присвиваем значения звездочек
    public static String [][] initField( int size) {
        String [][] field = new String[size][size];
        for (int i = 0; i<field.length; i++){
            for (int j = 0; j < field[0].length; j++){ //почему в данном цикле используется
                 field[i][j] = "*";                     // field[0] ???
            }
        }
        return field;
    }

 // тут мы выводим значение поля в консоль
    public static void printField(String [] [] field) {
        for (int i = 0; i<field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                System.out.print(field[i][j]+ "  ");

            }System.out.println();
        }

    }

    // тут мы делаем вызов ввода в консоль значений
    public static void HumanTurn(String [] [] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите Х и У");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println(" поле занято!");
                }
            } else {
                System.out.println("Вы попали мимо поля");
            }
        }
    }

// тут  ход искуственного интелекта
    public static void AITurn(String [] [] field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============");
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            //int size = field.length;
            if (field[x][y].equals("*")) {
                field[x][y] = "0";
                    break;
                }
        }
        System.out.println("Компьютер сделал свой выбор");
    }

    //Тут производится проверка на ничью

    public static boolean isDraw(String [] [] field) {

        for (int i = 0; i<field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                if (field[i][j].equals("*")){
                    return false;
                }
            }
        }
               return true;

    }


    public static boolean isWinner(String[][] field, String dot) {

        for (int i = 0; i < 3; i++)
            if ((field[i][0] == dot && field[i][1] == dot &&
                    field[i][2] == dot) ||
                    (field[0][i] == dot && field[1][i] == dot &&
                            field[2][i] == dot))
                return true;
        if ((field[0][0] == dot && field[1][1] == dot &&
                field[2][2] == dot) ||
                (field[2][0] == dot && field[1][1] == dot &&
                        field[0][2] == dot))
            return true;
        return false;
    }

       // if (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ||
          //      field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) ||
           //     field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)
      //  ) {
       //     return true;
       // }
        //вертикаль
       // else if (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) ||
      //          field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) ||
        //        field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)) {
        //    return true;
        }
        //диагональ
       // else if (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) ||
       //         field[2][0].equals(turn) && field[1][1].equals(turn) && field[0][2].equals(turn)) {
       //     return true;
      //  }

      //  return false;
    //}






//}

