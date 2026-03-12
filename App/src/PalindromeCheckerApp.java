
import java.util.Scanner;
public class PalindromeCheckerApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=s.replaceAll("\\s+","").toLowerCase();
        int i=0,j=n.length()-1;
        boolean p=true;
        while(i<j){
            if(n.charAt(i)!=n.charAt(j)){
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
