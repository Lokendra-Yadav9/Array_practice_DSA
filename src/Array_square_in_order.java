import java.util.Scanner;

public class Array_square_in_order {
    public static void Printarray(int [] arr){
        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

//    public static void SquareArr(int[]arr,int n) {
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = arr[i] * arr[i];
//        }
//      Order_non_dec(arr,n);
//      Printarray(arr);
//    }

//   public static int[] Order_non_dec(int[] arr,int n) {
//        int temp;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if (arr[i]>arr[j]){
//                   temp=arr[j];
//                   arr[j]=arr[i];
//                   arr[i]=temp;
//                }
//            }
//        }
//        return arr;
//    }

    public static void SquareInOrder(int [] arr ,int n){
     int left=0;
     int right=n-1;
     int k=0;
     int[]ans=new int[n];
     while (left<=right){
      if (Math.abs(arr[left])>=Math.abs(arr[right])){
          ans[k++]=arr[left]*arr[left];
          left++;
      }
      if (Math.abs(arr[left])<Math.abs(arr[right]))
         {
          ans[k++]=arr[right]*arr[right];
          right--;
         }

     }
     Printarray(ans);
     Order_non_dec(ans,n);
       Printarray(ans);
    }

    public static int[] Order_non_dec(int[] arr,int n) {
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array..");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" element of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Printarray(arr);
//        SquareArr(arr,n);
    SquareInOrder(arr,n);
    }
}
