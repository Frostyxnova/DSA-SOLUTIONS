//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    static Node reverse(Node head){
    if(head == null || head.next == null) return head;
    Node prev = null, cur = head;
    while(cur != null){
        Node temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
    }
    return prev;
    }

    public static Node addOne(Node head){ 
        Node H = reverse(head);
        Node curr = H;
        Node prev=null;

        int c = 1;
        while(curr!=null){
            int d=curr.data+c;
            curr.data = d%10;
            c=d/10;
            prev=curr;
            curr=curr.next;
}
         if(c!=0){
           prev.next=new Node(c);
  }
          return reverse(H);
    }
}
