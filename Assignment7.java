import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder ans=new StringBuilder(); 
        System.out.println("Enter the String : ");
        String gg=sc.nextLine();
        gg=gg.toLowerCase();
        int len=gg.length();
        System.out.println();
        for(int i=0;i<len;i++)
        {
            if(gg.charAt(i)=='a' || gg.charAt(i)=='e' || gg.charAt(i)=='i' || gg.charAt(i)=='o' || gg.charAt(i)=='u')
            {
                char temp=(char)(gg.charAt(i));
                ans.append(temp);
                continue;
            }
            else{
                char temp=(char)(gg.charAt(i));
                temp++;
                ans.append(temp);
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
