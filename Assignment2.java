import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array : ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("ENter the elements : ");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.toString(arr);
        for(int i=0;i<len;i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(arr[i]);
            sb.reverse();
            String gg=sb.toString();
            arr[i]=Integer.parseInt(gg);
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i:arr) System.out.println(i);
        sc.close();
    }
}
