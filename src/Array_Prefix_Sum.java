import java.util.Scanner;

public class Array_Prefix_Sum {
    public static void Printarr(int[] arr){
        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void PreSum(int[]arr,int n){
//        int[]sum=new int[n];

        for(int i=1;i<n;i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        Printarr(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter total "+n+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Printarr(arr);
        PreSum(arr,n);
    }
}
