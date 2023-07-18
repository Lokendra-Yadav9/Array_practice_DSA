import java.util.Scanner;

public class twoPointer_Array {
    public static void PrintArr(int []arr){
        System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void Swaap(int []arr,int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
//    public static int[] SortArryTwoPointer(int[] arr){
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                count++;
//            }
//        }
//        for (int i=0;i<count;i++){
//            arr[i]=0;
//        }
//        for (int i=count;i<arr.length;i++){
//            arr[i]=1;
//        }
//        return arr;
//    }
    public static int[] swapArr(int [] arr,int n){
        int left=0;
        int right=n-1;
             while (left<=right) {
                 if ((arr[left] == 1 && arr[right] == 0)) {
                     Swaap(arr,left,right);
                     left++;
                     right--;
                 }
                 if (arr[left]==0){
                     left++;
                 }
                 if (arr[right]==1){
                     right--;
                 }
             }
        return arr;
    }
    public static int[] SortArrayTwoPointer(int[]arr,int n){
           int []k=  swapArr(arr,n);
        return k;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n= sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter "+n+" number of elements :");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        PrintArr(arr);
        int[] result=SortArrayTwoPointer(arr,n);
        PrintArr(result);
    }
}
