import java.util.Scanner;

public class Prefix_suffix_equality_array {
    public static void Printarr(int[] arr,int n){
        System.out.println(" ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
//    public static int[] revers(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        return arr;
//    }

//    public static void Prefix_Suffix(int arr,int ans){
//        arr
//    }
    static int[] Prefix(int[]arr_1,int n){
        for(int i=1;i<n;i++){
            arr_1[i]=arr_1[i-1]+arr_1[i];
        }
        return arr_1;
    }
    static int[] suffix(int[]arr_2,int n){
        for(int i=n-2;i>=0;i--){
            arr_2[i]=arr_2[i+1]+arr_2[i];
        }
        return arr_2;
    }


    public static void Prefix_suffix(int[]arr,int n){
        int[]k=arr.clone();
        int[]arr_1=Prefix(arr,n);
        Printarr(arr_1,n);
        int[]arr_2=suffix(k,n);
        Printarr(arr_2,n);

    for (int i = 0; i < n - 1; i++) {
        if (arr_1[i] == arr_2[i + 1]) {
            System.out.println("true");
        }
    }

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
        Prefix_suffix(arr,n);
    }
}
