import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num=sc.nextInt();
        String n="";
        int sum=0;
        while(num>0)
        {
            int temp=num%10;
            n=n+" "+Integer.toString(temp);
            sum=sum+temp;
            num=num/10;

        }
        System.out.println();
        StringBuilder gg=new StringBuilder(n);
        gg.reverse();
        System.out.println(gg);
        System.out.println("Sum is : "+sum);
        sc.close();
    }
}
