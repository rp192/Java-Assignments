import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of inputs : ");
        int len=sc.nextInt();
        System.out.println("Enter the characters : ");
        char arr[]=new char[len];
        for(int i=0;i<len;i++) arr[i]=sc.next().charAt(0);
        Count c=new Count();
        String arr1=String.valueOf(arr);
        c.count(arr1); 
        sc.close();
    }
}
class Count{
    void count(String inputString)
    {
        HashMap<Character, Integer> charCountMap
        = new HashMap<Character, Integer>();
    char[] strArray = inputString.toCharArray();

    for (char c : strArray) {
        if (charCountMap.containsKey(c)) {
            charCountMap.put(c, charCountMap.get(c) + 1);
        }
        else {
            charCountMap.put(c, 1);
        }
    }
    System.out.println();
    for (Map.Entry entry : charCountMap.entrySet()) System.out.println(entry.getKey() + " " + entry.getValue());
    }
}