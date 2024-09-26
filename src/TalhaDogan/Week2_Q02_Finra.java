package TalhaDogan;

public class Week2_Q02_Finra {
    public static void main(String[] args) {

        printFinra();
    }



    public static void printFinra (){
        for(int n=1 ; n<= 30 ; n++){

            if((n%3==0) && (n%5==0) ){
                System.out.println("FINRA");
            }else if(n%3==0){
                System.out.println("Fin");
            }else if(n%5==0){
                System.out.println("Ra");

            }else{
                System.out.println(n);

            }




        }

    }

}
