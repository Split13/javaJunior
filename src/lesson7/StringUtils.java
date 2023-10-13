package lesson7;

public class StringUtils {
    // metod kotoriy prinimset vhodashim parametrom milo,
    // delaet proverku ha validnost i
    // pihet na konsol korrektniy ili net

    public static void checkValidMail(String email){
        /**
         * 1) Proveriaem soder @, esli ee net ne validnii.
         * 2) Cto sobaka odna.
         * 3) Raspologenie sobaki na nugnom meste.
         * 4) Tochka dolgna bit hotiabi odna.
         * 5)Tochka ne moget bit v nachale ili v konce.
         * Dobavit proverki na milo
         */

        if(!email.contains("@")){
            System.out.println("Ne sodergit sobaku!!!");
            return;
        }

        String[] partsOfEmail = email.split("@");
        if(partsOfEmail.length >2){
            System.out.println("Sobachek bolshe odnoi!!!");
            return;
        }

        if(email.startsWith("@") || email.endsWith("@")){
            System.out.println("Email ne moget nachinatsa ili zakanchivatsa s sobaki!!!");
            return;

        }

        String lastPart = partsOfEmail[1];
        if(!lastPart.contains(".")){
            System.out.println("Email ne sodergit tochki vo vtoroq chasti pocle sobachk!!!!");
            return;
        }
        System.out.println("Email podhodit");

    }

}
