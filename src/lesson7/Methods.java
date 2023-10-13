package lesson7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Methods {

    public static void printMethods() {
        System.out.println("Выберите метод");
        System.out.println("1 - Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте");
        System.out.println("2 - Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке");
        System.out.println("3 - Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации");
        System.out.println("4 - метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам");
    }

    public static String getInputMethods() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите метод");
        String input = scanner.next();
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")
                || input.equalsIgnoreCase("Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте")
                || input.equalsIgnoreCase("Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке")
                || input.equalsIgnoreCase("Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации")
                || input.equalsIgnoreCase("метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам")) {
            return input;
        } else {
            System.out.println("Неверный ввод, повторите!");
            return getInputMethods();
        }
    }

    public static String insertText() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String string = input.nextLine();
        return string;

    }


    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }


    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }


    public static int countPunctuation(String text) {
        return (int) Pattern.compile("\\p{Punct}+").matcher(text).results().count();
    }
}
