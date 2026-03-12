```java
public class PalindromeCheckerApp{
    public static void main(String[]args){
        String s="madam";
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("The string "+s+" is a palindrome");
        }else{
            System.out.println("The string "+s+" is not a palindrome");
        }
    }
}
```
