import java.util.*;
public class switchstmt {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
          /* 
        int number = scn.nextInt();

        switch(number){
            case 1: System.out.println("samosa");
                        break;
            case 2: System.out.println("burger");
                        break;
            case 3: System.out.println("Pizza");
                        break;
            default: System.out.println("we wake up");
        }

        */


        // simple calculator using switch statement

        System.out.println("enter a : ");
        int a = scn.nextInt();
        System.out.println("enter b");
        int b = scn.nextInt();
        System.out.println("enter operator ");
        char operator = scn.next().charAt(0);
        
        switch(operator){
            case '+': System.out.println(a+b);
                        break;
            case '-': System.out.println(a-b);
                        break;
            case '*': System.out.println(a*b);
                        break;
            case '/': System.err.println(a/b);
                        break;
            case '%': System.out.println(a%b);
                        break;
            default: System.out.println("wrong operator");
        }
    }
    
}
