package lesson5;

import java.util.Scanner;

public class ScannerUtil {
    /**
     * 1 - ����������� ������� (public, private, protected, ________)
     * (����� ������������ ��������� ������� ������)
     * public - ��������� ������ ����� �������.
     * private - ��������� ������ �������� ������.
     * protected - ��������� ������ ��������� ������ � ��� ���������� (��� �������� ������)
     * _______ - �������� ���������, ��������� ������ ������� �����.
     * <p>
     * 2 - static ����� �����, ���������� � �������� ������� (������� ��� ���).
     * ���� ������ �����������, ������ ����� ���������� � ������������ �������.
     * 3 - ������������ ��� (��� ����� ����, ���� ������ ���).
     * 4 - ������ � ��������� �����.
     * 5 - �������� ���������, � ������� ������� ����� �������, � ��������� ���� � ��������� ����������.
     * 6 - ���� ������ (�� ��� ����� ����������� ��� ������ ������� ������)
     */
    public static String getLevel() {
        System.out.println("�������� ������� ");
        System.out.println("�������");
        System.out.println("��������");
        System.out.println("������������");
        System.out.println("������");
        //������� �������� ������ ���������� ����
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
        System.out.println("�������� ������");
        System.out.println("1 - ����");
        System.out.println("2 - ����");
        System.out.println("3 - �������������");
        System.out.println("4 - �����������");
        System.out.println("5 - �������");
        System.out.println("6 - ��������");
    }

    public static String getInputFigura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������");
        String input = scanner.next();
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")
                || input.equals("2") || input.equals("6") || input.equalsIgnoreCase("����")
                || input.equalsIgnoreCase("����") || input.equalsIgnoreCase("������������")
                || input.equalsIgnoreCase("�����������") || input.equalsIgnoreCase("�������")
                || input.equalsIgnoreCase("��������")) {
            return input;
        } else {
            System.out.println("�������� ����, ���������");
            return getInputFigura();
        }
    }


    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ��������");
        String input = scanner.next();
        if ((input.equalsIgnoreCase("�������") || input.equalsIgnoreCase("��������"))) {
            return input;
        } else{
            System.out.println("�������� ����, ���������");
            return getAction();
        }
    }

    public static int getParametr(String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        String input = scanner.next();
        if (isNumeric(input)) {
            // ����������� String to Int
            // �������� �������� �� ��������� ��������
            return Integer.parseInt(input);
        } else{
            System.out.println("�� ����� �� �����!!! ���������");
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



