package lesson2;

public class Main {
    public static void main(String[] args) {
        //����������� �����������
        //if

        //���� 3 ������� ������������. ������� �� ������� ����� ��� �����������.
        //�������������� �������������� ��� ��������������.

        int a = 10;
        int b = 8;
        int c = 10;

        if (a != b && b != c && c != a) {
            System.out.println("��� �������������� �����������");

        } else if (a == b && b == c && c == a) {

            System.out.println("��� �������������� �����������");


        } else {

            System.out.println("��� �������������� �����������");
        }
    }
}
