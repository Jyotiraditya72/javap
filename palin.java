public class palin {
    public static void main(String [] args){
        
    int num=0;
    int sum=0;

        for(int i=0;i<=20;i++){
            if(ispalin(i)){
       System.out.println(i); 
            }


            }
            while(num!=0){
                int digit=num % 10;
              int  reve=reve*10+digit;
                num=num/10;
                System.out.println(reve);

            }
        }
    }

