import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//         Lab B:
//        Problem: How many cartons are needed to package N candy bars?
//
//                Given:
//                Each carton can hold up to 24 candy bars
//
//        Examples:
//        1 carton needed to package 1 to 23 candy bars
//        1 carton needed to package 24 candy bars
//        2 cartons needed to package 25 to 48 candy bars

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many candy bars do you have? Enter below:");
        int bars = scanner.nextInt();
        double quotient = bars/24;
        int total = (int) quotient;
        if(bars % 24 != 0){
            total++;
        }
        System.out.println("You will need " + total + " packages to hold " + bars + " candybars.");
    }
}
