
/*Write a program using a switch statement to print the month names
 given the exact number of days in the month. If the user enters 30 then
 the program will display: "September April June November".
 If the user enters 9 then program will alert the user that no months have exactly 9 days.
You can have more than one statement in each switch case.*/

import java.util.Scanner;
import java.util.*;
public class SwitchSt {

    public static void main(String args[]){
        int month=0 ;
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter Number of days in a months:):");
    String monthName="";
        month=ff.nextInt();
        switch (month) {
        case 28:  monthName = "Some times February";
            break;
            case 29: monthName="rarely february";
        case 30: monthName ="April,June,september";
            break;
        case 31:  monthName = "January,March,May,July,August,October,December";
            break;
        default: monthName = "Sorry no months have exactly"+ monthName+" days ";
    }
        System.out.println(monthName);
}
}