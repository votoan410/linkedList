/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.*;

/**
 *
 * @author timmy
 */
public class Assignment4_3 {
     public static void main(String[] args) {
          Node A = new Node(1);// this will be node A
          Node B = new Node(2);// node B
          Node C = new Node(3);//node C
          Node D = new Node(4);//node D
          Node E = new Node(5);//node E
          Node F = new Node(6);//node f
          Node J = new Node(7);//node j
          Node K = new Node(8);//node k 
          Node L = new Node(9);//node l
          Node G = new Node(10);//node g
          Node I = new Node(11);//node i
          Node H = new Node(12);//node h
          Node start=A; //start at A
          Node finish=L;//finish at L
            
            //build the maze by pointing node to the other node
            A.next = B;
            A.down = E;
            
            E.up = A;
            E.down =I;
            
            I.up = E;
            I.next =J;
            
            B.previous=A;
            B.down=F;
            
            F.up=B;
            F.next=G;
            
            G.up=C;
            G.previous=F;
            G.down=K;
            G.next=H;
            
            K.up=G;
            
            C.down=G;
            C.next=D;
            
            H.previous=G;
            H.down=L;
            
            //use while loop to check the direction 
 
            /*if { if ,else} -> if the direction is not null "+=" APPEND
            the direction prompt to the output message*/
            while(start != finish){
                String direction = null;// initialize string "direction"
                if (start.up != null)  
                    direction += " north or";
                
                if (start.down != null)
                 
                        direction += " south or";

                if (start.next != null)
                    
                        direction += " east or";
                
                if (start.previous != null)
                        direction += " left or";
            
            System.out.print("You are in Room " + start.data + " you can go " + direction + " none.");
            System.out.println("\nEnter S,E,N,W to go to next room");
            Scanner input = new Scanner(System.in);
            String response = input.next();
            //using method equalsignorecase to check the input
            //using response == "character" does not really work 
            if (response.equalsIgnoreCase("n") && start.up != null)
                start = start.up;
            else if (response.equalsIgnoreCase("s") && start.down != null)
                start = start.down;
            else if (response.equalsIgnoreCase("e") && start.next != null)
                start = start.next;
            else if (response.equalsIgnoreCase("w") && start.previous != null)
                start = start.previous;
            /*no need to use break since when the condition of the while loop is not met
            the while loop will exit*/
            if(start == finish)
                System.out.println("You have got to the right room! ");
                        }
      }
                }



         
