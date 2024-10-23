import java.util.*;
public class midindexelm {
    public static void main(String [] args){
        int arr[]={7,-3,8,2,-5,10,12};
        System.out.println(findmidie(arr));
        
    }
    public static int findmidie(int[]arr){
int[] filterarr=Arrays.stream(arr).filter(num->num>=0).toArray();
int midindex=filterarr.length/2;
return filterarr[midindex];
    }
}
