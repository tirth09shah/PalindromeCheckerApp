
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Deque<Character>d=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            d.addLast(s.charAt(i));
        }
        boolean p=true;
        while(d.size()>1){
            if(d.removeFirst()!=d.removeLast()){
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
