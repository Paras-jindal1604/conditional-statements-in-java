import java.util.*;
public class ifelse{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        /* 
        int age = 15;
        if (age >= 18){
            System.out.println("adult");
        }
        if( (age>13) && (age<18) ){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }

            */

             /*  greatest of 2 numbers

            int a = 10;
            int b = 20;
            if(a>=b){
                System.out.println("a is greatest");
            }
            else{
                System.out.println("b is the greatest");
            }
            */

            // to check if given number is even or odd


            int n = scn.nextInt();
            
            if(n%2 == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
