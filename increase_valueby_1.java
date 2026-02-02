import java.util.Scanner;


public class increase_valueby_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter elements ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        //max element
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int time=0;
        for(int i=0;i<n;i++){
            time+=max-arr[i];

            
        }
        System.out.println("Time calculated ");
        System.out.println(time);

        


    }
    
}
