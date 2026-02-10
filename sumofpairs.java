import java.util.Scanner;

public class sumofpairs {
    public static void main(String[] args) {
        int a[]={3,-2,1,4,3,6,8};
        int k=10;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==k){
                    System.out.println(a[i]+a[j]);
                    
                }
            }
        }
        
       

    
    }
}
