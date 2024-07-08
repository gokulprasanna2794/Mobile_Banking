package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class insert {
    public static void main(String[]args)
    {
        int []arr=new int[5];
        arr[3]=1234;
        arr[4]=5678;
        System.out.println(Arrays.toString(arr));

    Scanner scan=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("enter your number");
        arr[i]=scan.nextInt();
    }
}}
