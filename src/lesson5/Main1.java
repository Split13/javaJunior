package lesson5;

public class Main1 {
    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputFigura();

        if(figura.equals("1") || figura.equalsIgnoreCase("Круг")){
            String action = ScannerUtil.getAction();
            int radius = ScannerUtil.getParametr( "Введите число");
            if(action.equalsIgnoreCase( "площадь")) {
                System.out.println("Площадь круга " + 2 * 3.14 * radius);
            } else {
                System.out.println("Площадь круга " +  3.14 * (radius + radius));
            }

        }
    }
}
