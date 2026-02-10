
import java.util.Scanner;

public class upperdiagonalsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r=sc.nextInt();
        System.out.println("enter cols");
        int c=sc.nextInt();
        int a[][]=new int [r][c];
        System.out.println("elements");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
                

            }
           

        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //upper digonal sum
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i<j){
                    sum+=a[i][j];
                }
            }
            
        }
        System.out.println("sum of upper diagonal = "+ sum);

        //lower diagonal sum
        int lsum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i>j){
                    lsum+=a[i][j];
                }

            }

        }
        System.out.println("lower diagonal sum =" +lsum);

        

        

        
    }
    
}
