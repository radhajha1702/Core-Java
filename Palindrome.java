import java.util.*;   
class Palindrome 
{  
    // checking if the input number/string is palindrome or not
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
        System.out.println("Entered string/number is a palindrome.");
      else
        System.out.println("Entered string/number is not a palindrome. ");  
         
        
   }  
}  