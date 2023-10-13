package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // Задача: вывести на консоль сумму чисел от 30 до 60

        // 30 + 31 + 32 + 33 ....60
        int summa = 0;
        for (int i = 30; i <= 60; i++){
            summa = summa + i;

        }
        System.out.println(summa);
    }
}
