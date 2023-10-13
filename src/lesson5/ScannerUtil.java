package lesson5;

import java.util.Scanner;

public class ScannerUtil {
    /**
     * 1 - Модификатор доступа (public, private, protected, ________)
     * (слово определяющее видимость данного метода)
     * public - видимость внутри всего проекта.
     * private - видимость внутри текущего класса.
     * protected - видимость внутри теекущего класса и его наследника (его дочерние классы)
     * _______ - пакетная видимость, видимость внутри текущей папки.
     * <p>
     * 2 - static общий метод, вызывается у названия классов (пишется или нет).
     * если статик отсутствует, значит метод вызывается у определённого объекта.
     * 3 - возвращаемый тип (или слово войд, если такого нет).
     * 4 - методы с маленькой буквы.
     * 5 - входящие параметры, в круглых скобках через запятую, с указанием типа и названием переменной.
     * 6 - тело метода (то что будет происходить при вызове данного метода)
     */
    public static String getLevel() {
        System.out.println("Выберите уровень ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");
        //формула создания любого ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();
        return level;
    }

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printFigurs() {
        System.out.println("Выбирите фигуру");
        System.out.println("1 - Круг");
        System.out.println("2 - Овал");
        System.out.println("3 - Прямоугольник");
        System.out.println("4 - Треугольник");
        System.out.println("5 - Квадрат");
        System.out.println("6 - Трапеция");
    }

    public static String getInputFigura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру");
        String input = scanner.next();
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")
                || input.equals("2") || input.equals("6") || input.equalsIgnoreCase("Круг")
                || input.equalsIgnoreCase("Овал") || input.equalsIgnoreCase("Прмоугольник")
                || input.equalsIgnoreCase("Треугольник") || input.equalsIgnoreCase("Квадрат")
                || input.equalsIgnoreCase("Трапеция")) {
            return input;
        } else {
            System.out.println("Неверный ввод, повторите");
            return getInputFigura();
        }
    }


    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь или периметр");
        String input = scanner.next();
        if ((input.equalsIgnoreCase("Площадь") || input.equalsIgnoreCase("периметр"))) {
            return input;
        } else{
            System.out.println("Неверный ввод, повторите");
            return getAction();
        }
    }

    public static int getParametr(String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        String input = scanner.next();
        if (isNumeric(input)) {
            // Конвертация String to Int
            // Добавить проверку на минусовое значение
            return Integer.parseInt(input);
        } else{
            System.out.println("Вы ввели не число!!! Повторите");
            return getParametr(messageToUser);
        }
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray())        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

}



