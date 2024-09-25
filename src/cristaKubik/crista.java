package cristaKubik;

import java.util.HashMap;
import java.util.Map;

public class crista {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<String,Integer>();
        students.put("Crista" , 001);
        students.put("Nelya" , 002);
        students.put("Yordan" , 003);
        students.put("Talha" , 004);
        students.put("Anvar" , 005);
        students.put("Taieb", 006);
        System.out.println(students.size());
        System.out.println(students.get("Crista"));



    }
}
