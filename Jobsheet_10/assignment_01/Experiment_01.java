package BasicProgramming.Jobsheet_10.assignment_01;
import java.util.Scanner;
import java.util.Arrays;
public class Experiment_01 {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        String audience [][] = new String[4][2];
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";
        // now print 

        System.out.println(audience.length); // to get the number of rows

        for (int i=0; i<audience.length; i++){
            System.out.println("Length of row " + (i+1) + ": " + audience[i].length);}
        System.out.println(audience[0].length); 
        System.out.println(audience[1].length); 
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);

        System.out.printf("%s \t %s\n",audience[0][0],audience[0][1]);
        System.out.printf("%s \t %s\n",audience[1][0],audience[1][1]);
        System.out.printf("%s \t %s\n",audience[2][0],audience[2][1]);
        System.out.printf("%s \t %s\n",audience[3][0],  audience[3][1]);

        //1. the element of an array must be filled in order starting from index 0 because arrays are indexed data starting form 0. if you skip one of then then it will be null. so it might cease an error if you try to access the null value.

        //2. commenting out the audience[3][1] = "Hana"; line will cause an error when trying to print audience[3][1] because it will be null. the defult value for String in arrays is null. so when you try to print it, it will cause a NullPointerException error.

        //3.this is important to fill every element before the array display because if you want to display the array one element is null, it will casue an error.the defult value is null for String.
        
        //4. the purpose of audience.length is to get the number of the rows in the 2D array.the output is "4" and the audienve[0].lenght and other audience[i].length is to get the number of columns in the 2D array. the output is "2" for each of them.
        
        //5.the audience[1].length and other like [1],[2],[3] is the same value because the number of columns in each row is the same. the output is "2" for each of them.

        //6.the program is been modified to for loop to print the length of rows.

        //7.




    }
}
