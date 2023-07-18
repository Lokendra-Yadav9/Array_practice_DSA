import java.util.Scanner;

public class swapArray {
    public static void Printarr(int[] arr){
        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
//    public static int[] swapArr(int[] arr){
//        int[]arr_2=new int[arr.length];
//        int j=0;
//        for(int i=arr.length-1;i>=0;--i){
//            arr_2[j]=arr[i];
//            j++;
//        }
//        return arr_2;
//    }
    public static int temp=0;
    public static void Swapping(int[] arr,int i,int j){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void SwapInt(int []arr){
        int i=0;
        int j=arr.length-1;
        if(i<j){
            Swapping(arr,i,j);
            i++;
            j--;
        }
        Printarr(arr);
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
//        int []ans=swapArr(arr);
//        Printarr(ans);
        SwapInt(arr);
    }
}
