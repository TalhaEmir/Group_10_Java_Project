package cristaKubik;

public class Week_01_Question {

    public static String checkEvenOdd(int num) {

        if (num % 2 == 0) {
            return "Even";
        } else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        System.out.println("Number: " + num1 + ", is " + checkEvenOdd(num1));
        System.out.println("Number: " + num2 + ", is " + checkEvenOdd(num2));

        //week1
    }


}
