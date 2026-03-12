
import java.util.Scanner;
public class PalindromeCheckerApp{
    static class Node{
        char data;
        Node next;
        Node(char d){data=d;}
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Node head=null,tail=null;
        for(int i=0;i<s.length();i++){
            Node n=new Node(s.charAt(i));
            if(head==null){head=n;tail=n;}
            else{tail.next=n;tail=n;}
        }
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null,cur=slow;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        Node p1=head,p2=prev;
        boolean p=true;
        while(p2!=null){
            if(p1.data!=p2.data){p=false;break;}
            p1=p1.next;
            p2=p2.next;
        }
        if(p){
            System.out.println("The string "+s+" is a palindrome");
        }else{
            System.out.println("The string "+s+" is not a palindrome");
        }
    }
}