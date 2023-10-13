package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] forA = {{2, 4, 6, 7},
                           {5, 6, 9, 7},
                           {5, 6, 9, 7}};

        double[][] forB = {{5, 4, 1, 4},
                           {1, 3, 7, 2},
                           {6, 3, 7, 2}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);

        IMatrix resultAdd = a.add(b);
        resultAdd.printToConsole();
    }
}
