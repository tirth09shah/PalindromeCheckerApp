
import java.util.Scanner;
public class PalindromeCheckerApp{
    public static boolean check(String s,int l,int r){
        if(l>=r)return true;
        if(s.charAt(l)!=s.charAt(r))return false;
        return check(s,l+1,r-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean p=check(s,0,s.length()-1);
        if(p){
            System.out.println("The string "+s+" is a palindrome");
        }else{
            System.out.println("The string "+s+" is not a palindrome");
        }
    }
}

