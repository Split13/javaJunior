package lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("����� ���������� � ����!");
        int[][] field = new int[9][9];
        boolean[][] mask = new boolean[9][9];
        SaperUtils.fillMines(field);
        SaperUtils.insertNumsAroundMines(field);
        SaperUtils.printField(field, mask);

    }
}
