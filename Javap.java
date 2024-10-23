public class Javap {
  public static int ls(int num[],int key) {
    // for( int i=1;i<=num.length-1;i++){
    //   if(num[i]==key){
    //   return i;
    //   }
    // }return -1;
    // }
    int start=0;
    int end=num.length-1;
   
   
     while(start<=end){
      int mid =(start+end)/2; 
      if(key==num[mid]){
        System.out.println(mid);
      }
      if(num[mid]<key) {
         start= mid+1;
        
      }else{
        end=mid-1;
        
      } 
    } return -1;
  }
  

  public static void main(String[] args) {
    int num[] = { 2, 4, 5, 8, 11, 43, 45, 55 };
    int key = 45;
    // int index = ls(num, key);
    // if (index == -1) {
    //   System.out.println("not f");
    // } else {
    //   System.out.println("key:" + index);
    // }
 System.out.println("ls is:"+ls(num,key));  
 }
}