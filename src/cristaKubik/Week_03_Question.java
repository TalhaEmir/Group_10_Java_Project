package cristaKubik;

public class Week_03_Question {

    public static void main(String[] args) {

        int a = 10;
        int b = 40;

        System.out.println("Before swapping values: " + "a = " + a + " "+ "b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping values: " + "a = " + a + " "+ "b = " + b);








    }

}
