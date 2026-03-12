
import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        String r="";
        while(!st.isEmpty()){
            r=r+st.pop();
        }
        if(s.equals(r)){
            System.out.println("The string "+s+" is a palindrome");
        }else{
            System.out.println("The string "+s+" is not a palindrome");
        }
    }
}
