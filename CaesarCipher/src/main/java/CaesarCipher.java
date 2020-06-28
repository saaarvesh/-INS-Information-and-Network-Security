
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarvesh Purohit
 */
import java.util.Scanner;

public class CaesarCipher {
     public static StringBuffer Caesar(String text, int s) 
    { 
         StringBuffer result= new StringBuffer(); 
        for (int i=0; i<text.length(); i++)        
        {
            int c;
            char cc;
             if (65<=(text.charAt(i)) && (text.charAt(i))<=90) 
            { 
                c= (int)text.charAt(i)-65;
                cc=(char) (65+((c+s)%26));
                result.append(cc); 
            } 
            else
            { 
               c= (int)text.charAt(i)-97;
               cc=(char) (97+((c+s)%26));
               result.append(cc);
            } 
        } 
        return result; 
        }
    
    
    public static void main(String args[])
           {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the text for encoding:");
             String text=sc.nextLine();
             System.out.println("enter the shift value:");
             int shift=sc.nextInt();
             System.out.println("encoded output: " + Caesar(text, shift));
           
           }
}
