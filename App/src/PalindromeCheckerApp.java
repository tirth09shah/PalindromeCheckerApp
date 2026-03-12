
import java.util.Scanner;
public class PalindromeCheckerApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[]c=s.toCharArray();
        int i=0,j=c.length-1;
        boolean p=true;
        while(i<j){
            if(c[i]!=c[j]){
                p=false;
                break;
            }
            i++;
            j--;
        }
        if(p){
            System.out.println("The string "+s+" is a palindrome");
        }else{
            System.out.println("The string "+s+" is not a palindrome");
        }
    }
}

