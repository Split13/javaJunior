package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 56, 43, 456, 444, 47, 78, 8, 4};

        for( int n : nums  ){
            String numInText = n + "";
            if(numInText.contains("4")){
                System.out.println(numInText);
            }
        }

    }
}
