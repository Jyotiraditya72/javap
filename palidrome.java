import java.util.Scanner;

public class palidrome {
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter string:");
    String input=sc.nextLine();
    String ispalindrome=new StringBuilder(input).reverse().toString();
    if(input.equals(ispalindrome)){
        System.out.println(input + " is palindrome");
        

    }else{
        System.out.println(input +" is not palindrome");
    }
  }  
}
