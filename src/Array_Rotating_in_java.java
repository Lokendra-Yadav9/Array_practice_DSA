import java.util.Scanner;

public class Array_Rotating_in_java {
    public static void Printarr(int[] arr){
        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public  static int [] RotateArr(int []arr,int k) {
        int n = arr.length;
        int[] ans = new int[arr.length];
            int j = 0;
            for (int i = n - k; i < n; i++) {
                ans[j] = arr[i];
                j++;
            }
            for (int i = 0; i < n - k; i++) {
                ans[j] = arr[i];
                j++;
            }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Printarr(arr);
        System.out.println("enter number of rotation: ");
        int k=sc.nextInt();
        if(k>n){
            k=k%n;
        }

       int []result= RotateArr(arr,k);
       Printarr(result);
    }
}
