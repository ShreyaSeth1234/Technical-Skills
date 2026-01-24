import java.util.Scanner;

class ele_greater_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int count=0;
        for (int i=0;i<n;i++){
            if(arr[i]!=max){
                count++;
            }
        }
        System.out.println("count :" +count);

        
    }
}
