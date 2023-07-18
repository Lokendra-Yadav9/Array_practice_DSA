import java.util.Scanner;

public class Prefix_array_query_sum {
    public static void Printarr(int[] arr,int n){
        System.out.println(" ");
        for(int i=1;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void FindtargetSum(int []arr,int l,int r){
       int ans=arr[r]-arr[l-1];
        System.out.println("from "+l+" to "+r+" sum is "+ans);
    }
    public static int[] FindPreSum(int []arr,int n){
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
         n=arr.length;
        System.out.println("enter total "+(n-1)+" elements");
        for(int i=1;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Printarr(arr,n);
        FindPreSum(arr,n);
        System.out.println("\nhow many times wamt to play query: ");
        int k=sc.nextInt();
        while (k>0){
            System.out.println("enter numbers from where to where you want sum");
            int l=sc.nextInt();
            int r=sc.nextInt();
            FindtargetSum(arr,l,r);
            k--;
        }
    }
}
