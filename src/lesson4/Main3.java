package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Выберите уровень");
        System.out.println("новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("новичок")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {

                int row = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);
                if (field[row][col] != 0) {
                    i--;

                } else {
                    field[row][col] = 1;
                }

            }

            for(int i = 0; i < field.length; i++){
                for(int j = 0; j < field[i].length; j++){
                    System.out.print(field[i][j]+ " ");
                }
                System.out.println();
            }
        }

    }
}