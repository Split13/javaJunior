package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // Сколько мы заберём денег с банка,
        // если оставим 10000 т.р на 7 лет, под 9 процентов годовых.
        // Помесячная капитализация.

        int money = 10000;
        int year =5;
        int prosent = 9;

        for(int month = 0; month <= year * 12; month ++){
            money = money + (money/100 * prosent) / 12;

        }

        System.out.println(money);
    }
}
