import java.util.Scanner;

public class frame_elements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter rows ");
        int r=sc.nextInt();
        System.out.println("enter cols ");
        int c=sc.nextInt();

        int n[][]=new int[r][c];
        System.out.println("elements ");
        for(int i =0;i<r;i++){
            for(int  j =0;j<c;j++){
                n[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix ");
        // int frame =0;
        int core=0;
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                if (i!=0 && j!=0 && i!=r-1 && j!=c-1){
                    
                    core+=n[i][j];
                }
                
            }
           
        }    
        System.out.println(core);
    }
    
}
