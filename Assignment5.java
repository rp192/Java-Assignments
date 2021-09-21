import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String kk;
     System.out.println("Enter the string : ");
     kk=sc.next();
     StringBuilder gg=new StringBuilder(kk);
     StringBuilder rr=new StringBuilder(kk);
     gg.reverse();
     System.out.println(rr+" | "+gg);
     sc.close();
    }
}
