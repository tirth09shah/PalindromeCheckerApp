
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character>st=new Stack<>();
        Queue<Character>q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            q.add(s.charAt(i));
        }
        boolean p=true;
        while(!st.isEmpty()){
            if(st.pop()!=q.remove()){
                p=false;
                break;
            }
        }
        if(p){
            System.out.println("The string "+s+" is a palindrome");
        }else{
            System.out.println("The string "+s+" is not a palindrome");
        }
    }
}
