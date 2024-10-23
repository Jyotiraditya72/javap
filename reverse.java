import java.util.Scanner;

public class reverse {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String revstr=" ";
        for(int i=0;i<str.length();i++){
       revstr=str.charAt(i)+revstr;
        }
        System.out.println(revstr);
        
    }
}
