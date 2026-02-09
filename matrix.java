import java.util.Scanner;


public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter rows :");
        int r=sc.nextInt();
        System.out.println("Enter columns");
        int c=sc.nextInt();
        int n[][]=new int[r][c];
        System.out.println("elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                n[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Diagonal sum ");
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=n[i][j];
                }
                
            }
            

        }
        System.out.println("sum = "+sum);

        



    
    }

    
}
