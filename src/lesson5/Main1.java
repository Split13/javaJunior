package lesson5;

public class Main1 {
    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputFigura();

        if(figura.equals("1") || figura.equalsIgnoreCase("����")){
            String action = ScannerUtil.getAction();
            int radius = ScannerUtil.getParametr( "������� �����");
            if(action.equalsIgnoreCase( "�������")) {
                System.out.println("������� ����� " + 2 * 3.14 * radius);
            } else {
                System.out.println("������� ����� " +  3.14 * (radius + radius));
            }

        }
    }
}
