// calculator

import java.util.*;

public class conditionalsHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("choose an no:");
        int no = sc.nextInt();


        
         switch(no){
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: System.out.println(a / b);
            break;
            case 5: System.out.println(a % b);
            break;
            default: System.out.println("invalid");
            
        } 
        
        // q2

       /*  System.out.print("enter the no of the month:");
        int a = sc.nextInt();
        
        switch(a){
            case 1: System.out.println("jan");
            break;
            case 2: System.out.println("feb");
            break;
            case 3: System.out.println("march");
            break;
            case 4: System.out.println("april");
            break;
            case 5: System.out.println("may");
            break;
            case 6: System.out.println("june");
            break;
            case 7: System.out.println("july");
            break;
            case 8: System.out.println("aug");
            break;
            case 9: System.out.println("sept");
            break;
            case 10: System.out.println("oct");
            break;
            case 11: System.out.println("nov");
            break;
            case 12: System.out.println("dec");
            break;
            default: System.out.println("no is invalid");
           
        }
 */

    }
    
}
