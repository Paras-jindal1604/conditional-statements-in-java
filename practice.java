import java.util.*;
public class practice {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        /*  QUESTION 1 - TO CHECK A GIVEN NUMBER IS POSITIVE OR NOT 
        System.out.println("enter number");
        int number = scn.nextInt();

        if(number>=0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }

    */


        /* QUESTION 2 - TO CHECK IF YOU HAVE FEVER OR NOT

       System.out.println("enter temperature");
       double temp = scn.nextDouble();
        if(temp>=100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you dont have fever");
        }

        */


        /* QUESTION 3 - TO PRINT DAY OF WEEK USING DAY NUMBER AS INPUT

        System.out.println("enter week number(1-7)");
        int week = scn.nextInt();

        switch(week){
            case 1: System.out.println("Monday");
                        break;
            case 2: System.out.println("Tuesday");
                        break;
            case 3: System.out.println("Wednesday");
                        break;
            case 4: System.out.println("Thursday");
                        break;
            case 5: System.out.println("Friday");
                        break;
            case 6: System.out.println("Saturday");
                        break;
            case 7: System.out.println("Sunday");
                        break;
            default: System.out.println(" enter a valid input");

        }

        */
         
        //  QUESTION 4 - TO CHECK IF A YEAR IS LEAP YEAR OR NOT 
            
        System.out.println("enter an year");
        int year = scn.nextInt();

        if (( (year%4 == 0) && (year%100 != 0)) || ( year%400 == 0)){
            System.out.println("year is a leap year");
        }
        else{
            System.out.println("year is not a leap year");
        }
        }  
}
