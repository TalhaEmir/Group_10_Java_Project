package TalhaDogan.FirstQuestions;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(0));

    }


    public static String identify(int number) {

        String result="";

        if(number>1){
            if(number%2!=0){
                result="Odd";
            }else{
                result="Even";
            }
        }else {
            System.out.println("Invalid value");
            throw new InvalidValueException();
        }

        return result;


    }

}
