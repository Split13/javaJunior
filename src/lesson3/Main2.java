package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // Создать массив длинной в 10 ячеек и наполнить его
        // числами кратными 3 от 30 и до заполнения массива.
        // вывести массив на консоль в качестве результата.

        int[] nums = new int[10];

        // nums[0] = 30;
        // nums[1] = 30;
        // nums[2] = 30;
        // nums[3] = 30;
        //..

        int value = 30;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = value;
            value = value + 3;
            System.out.println(nums[i]);

        }

    }
}
