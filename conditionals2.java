// 2 i/p ques  //else if//
import java.util.*;
public class conditionals2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       /*  System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enetr b:");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("equal");
        }
        else if(a > b){
            System.out.println("greater");
        }
        else {
            System.out.println("smaller");
        } */
        System.out.print("press the number:");
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.print("hello");
            break;
            case 2: System.out.print("namaste");
            break;
            case 3: System.out.print("hola");
            break;
            default: System.out.print("invalid");
        }




    }
    
}
