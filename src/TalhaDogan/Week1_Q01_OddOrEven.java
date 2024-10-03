package TalhaDogan;

public class Week1_Q01_OddOrEven {

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

    public static class InvalidValueException extends RuntimeException {

            public InvalidValueException(){
                super("Invalid value");
            }

            public InvalidValueException(String message){
                super(message);
            }


        }
}
