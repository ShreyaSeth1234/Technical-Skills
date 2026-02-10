import java.util.Scanner;
public class sumeverycolumn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=sc.nextInt();
        System.out.println("Enter cols");
        int c=sc.nextInt();

        int n[][]=new int [r][c];
        System.out.println("elements ");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                n[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(n[i][j]+ " ");
            }
            System.out.println();
        }
        
        int csum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                csum+=n[i][j];
            }

            
        }
        System.out.println("Sum of every column = " + csum);

        int rsum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rsum+=n[j][i];
            }
        }
        System.out.println("Sum of every row= "+ rsum);

    }
}