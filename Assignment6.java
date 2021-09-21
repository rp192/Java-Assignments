import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of inetegers to be entered : ");
     int len=sc.nextInt();
     int arr[]=new int[len];
     for(int i=0;i<len;i++) arr[i]=sc.nextInt();
     Arrays.sort(arr);
     System.out.println("The second smallest element is : "+arr[1]);

     sc.close();
    }
}
