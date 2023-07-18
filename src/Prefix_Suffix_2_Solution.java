import java.util.Scanner;

public class Prefix_Suffix_2_Solution {
    public static void Printarr(int[] arr,int n){
        System.out.println(" ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int TotalSum(int[]arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean Prefix_suffix(int arr[]){
        int totalsum=TotalSum(arr);
        int prefixSum=0;
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            int SuffixSum=totalsum-prefixSum;
            if(prefixSum==SuffixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        n=arr.length;
        System.out.println("enter total "+(n)+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Printarr(arr,n);
       boolean ans=Prefix_suffix(arr);
        System.out.println(ans);
    }
}
