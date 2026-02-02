
import java.util.Scanner;
public class product_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int product_arr[]=new int[n];
        System.out.println("Enter elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<n;i++){
            product*=arr[i];


        }
        System.out.println(product);
       
        for(int i=0;i<n;i++){
            

            
            product_arr[i]=product/arr[i];
            System.out.print(product_arr[i]+" ");
        }
        


    }
    
}
