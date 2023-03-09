//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;

    Node(char x) {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node((s[0].charAt(0))), tail = head;
        for (int i = 1; i < s.length; i++)
            tail = tail.next = new Node((s[i].charAt(0)));

        return head;
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
        out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            Node head = Node.inputList(br);

            String S = br.readLine().trim();

            Solution obj = new Solution();
            ArrayList<Node> res = obj.findAnagrams(head, S);

            for (Node node : res) {
                Node temp = node;
                Node.printList(temp, out);
            }
            if (res.size() == 0) {
                out.println("-1");
            }
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
/*

Definition for singly Link List Node
class Node
{
    char data;
    Node next;

    Node(char x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        ArrayList<Node>al=new ArrayList<>();
        Node fast=head;
        int n = s.length();
        int i = 1;
        
        StringBuffer sb = new StringBuffer();
        sb.append(fast.data);
        
        while(fast!=null && i<s.length()){
            fast=fast.next;
            sb.append(fast.data);
            i++;
        }
        
        int prevAdd = 0;
        
        while(fast!=null)
        {
            if(i>prevAdd+n-1 && isAnagram(String.valueOf(sb).toCharArray(),s.toCharArray())){
               prevAdd = i;
               al.add(append(String.valueOf(sb).toCharArray()));
            }
            
            i++;
            sb.delete(0,1);
            fast=fast.next;

            if(fast==null)
                break;

            sb.append(fast.data);
        }
        return al;
    }
    static boolean isAnagram(char[] a,char[] b)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(String.valueOf(a).equals(String.valueOf(b)))
            return true;
        return false;
    }
    
    static Node append(char[]arr)
    {
        Node head = null;
        
        for(int i=0;i<arr.length;i++)
        {
            Node node = new Node(arr[i]);
            if(head==null)
                head=node;
            else
            {
                Node temp = head;
                while(temp.next!=null)
                    temp=temp.next;
                temp.next=node;
            }
        }
        return head;
    }
    
}