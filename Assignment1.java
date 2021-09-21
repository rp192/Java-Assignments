import java.util.*;
import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings to be entered : ");
        int len=sc.nextInt();
        String[] arr = new String[len];
        String[] arr1= new String[len];
        System.out.println("Enter the String : ");
        for(int i=0;i<len;i++) arr[i]=sc.next();
        Sorting hh=new Sorting();
        arr1=hh.convert(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
}
class Sorting{
    String[] convert(String[] arr)
    {
        Arrays.sort(arr);
        return arr;
    }
}