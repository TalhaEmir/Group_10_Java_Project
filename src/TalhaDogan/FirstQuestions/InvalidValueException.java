package TalhaDogan.FirstQuestions;

public class InvalidValueException extends RuntimeException {

        public InvalidValueException(){
            super("Invalid value");
        }

        public InvalidValueException(String message){
            super(message);
        }


    }


