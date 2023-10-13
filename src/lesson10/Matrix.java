package lesson10;

public class Matrix implements IMatrix{
    private double[][] nums;

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col){
        if(row < 0 || row >10 || col < 0 || col >10) {
            nums = new double[1][1];

        }else {
            nums = new double[row][col];
        }
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[9].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()){
            return  -1;
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()){
            return;
        }
        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // otherMatrix = b
        // this = a
        if(this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Матрирцы не равны!!!");
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for(int i = 0; i < result.getRows(); i++){
            for(int j = 0; j < result.getColumns(); j++){
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
