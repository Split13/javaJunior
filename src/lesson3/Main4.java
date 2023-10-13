package lesson3;

public class Main4 {
    public static void main(String[] args) {
                //Est 2 znamenatelia,
                // nugno opredelit obschii znamenatel.

        int znam1 = 5;
        int znam2 = 8;


        int bigestZnam = znam1;
        if(znam2 < znam1){
            bigestZnam = znam2;
        }


        for (int i = bigestZnam; i <= znam1 * znam2; i++){
            if(i % znam1 == 0 && i % znam2 == 0){
                System.out.println(i);
                break;

            }

        }


    }
}
