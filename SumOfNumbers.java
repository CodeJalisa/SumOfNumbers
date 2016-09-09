package Hewitt.Jalisa.SumOfNumbers;

import java.util.Scanner;

/**
 * Created by jalisahewitt on 9/9/16.
 */
public class SumOfNumbers {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += i;
        }

        System.out.println("The sum is " + sum);


    }




}
