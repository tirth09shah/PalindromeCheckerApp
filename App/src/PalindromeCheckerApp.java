```java
import java.util.*;

interface PalindromeStrategy{
    boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy{
    public boolean isPalindrome(String text){
        Stack<Character>s=new Stack<>();
        for(char ch:text.toCharArray()){
            s.push(ch);
        }
        StringBuilder rev=new StringBuilder();
        while(!s.isEmpty()){
            rev.append(s.pop());
        }
        return text.equals(rev.toString());
    }
}

class DequeStrategy implements PalindromeStrategy{
    public boolean isPalindrome(String text){
        Deque<Character>d=new ArrayDeque<>();
        for(char ch:text.toCharArray()){
            d.addLast(ch);
        }
        while(d.size()>1){
            char f=d.removeFirst();
            char l=d.removeLast();
            if(f!=l){
                return false;
            }
        }
        return true;
    }
}

class PalindromeChecker{
    private PalindromeStrategy strategy;
    public void setStrategy(PalindromeStrategy strategy){
        this.strategy=strategy;
    }
    public boolean checkPalindrome(String text){
        return strategy.isPalindrome(text);
    }
}

public class PalindromeCheckerApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        PalindromeChecker checker=new PalindromeChecker();
        System.out.println("Enter string:");
        String input=sc.nextLine();
        System.out.println("Choose Algorithm");
        System.out.println("1 Stack Strategy");
        System.out.println("2 Deque Strategy");
        int choice=sc.nextInt();
        if(choice==1){
            checker.setStrategy(new StackStrategy());
        }else if(choice==2){
            checker
```
