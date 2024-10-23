import java.util.Scanner;

public class js {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number of array element5:");
    // String input=sc.nextLine();
    // String reversed=new StringBuilder(input).reverse().toString();

    // System.out.println("reversed string:"+reversed);

    // }
    // public static String reverseString(String str){
    // StringBuilder reversed=new StringBuilder(str);
    // return reversed.reverse().toString();
    // }
    // }
    int n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("enter the element of array :");
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }
    int max = array[0];
    for (int i = 0; i < n; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println("maximum element is:" + max);
  }
}