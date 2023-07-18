import java.util.Scanner;

public class Two_pointer_odd_even_squence {
    public static void Printarray(int [] arr){
        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void swapAr(int []arr,int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void Odd_even_diiff(int[] arr){
        int n=arr.length;
       int left=0;
       int right=n-1;
       for(int i=0;i<n;i++) {
           while (left < right) {
               if (arr[left] % 2 == 0 && arr[right]%2!=0) {
                  swapAr(arr,left,right);
               }
               if (arr[left]%2!=0){
                   left++;
               }
               if (arr[right]%2==0){
                   right--;
               }
           }

       }
       Printarray(arr);
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
        Odd_even_diiff(arr);
    }
}
