package BasicProgramming.Jobsheet_10.assignment_02;
import java.util.Scanner;
public class Experiment_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row , col;
        String name, choice;
        String audience [][] = new String[4][2];
        while(true){
            System.out.print("Enter name: ");
            name = input.nextLine();
            System.out.print("Enter row: ");
            row = input.nextInt();
            System.out.print("Enter column: ");
            col = input.nextInt(); 

            audience[row-1][col-1] = name;
            System.out.print("Add another audience member? (y/n): ");
            choice = input.next();

            if (choice.equalsIgnoreCase("n")){
                break;
            }
            input.nextLine();
        }

        //1.the elements of an array filled form scanner in order starting from 0 bcs arrays are indexed data starting from 0. if you skip one of them then it will be null. so it might cause an error if you try to access the null value.

        //2.




    }
}
