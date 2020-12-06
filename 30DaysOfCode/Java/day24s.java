import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
        //THe code commented below requires some corrections
        
        // if(head == null || head.next == null){
        //     return head;
        // }else if(head.next.next == null){
        //     if(head.data == head.next.data){
        //         head.next = null;
        //     }
        //     return head;
        // }else{
        //     Node current = head;
        //     while(current.next != null){
        //         Node start = current.next;
        //         Node s = current;
        //         while(start.next != null || s.next != null){
        //             if(start.data == current.data){
        //                 s.next = start.next;
        //                 start.next = null;
        //                 start = s.next;
        //             }else{
        //                 start = start.next;
        //                 s = s.next;
        //             }
        //         }
        //         current = current.next;
        //     }
        //     return head;
        // }

        //This is the correct answer
        if (head == null || head.next == null){
            return head;
        }
        if (head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;
    }

	 public static  Node insert(Node head,int data)