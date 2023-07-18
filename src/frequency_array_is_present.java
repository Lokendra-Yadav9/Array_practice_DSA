import java.util.Scanner;

public class frequency_array_is_present {
    public static int[] FrequeArr(int []arr,int n){
        int[]freq=new int[10005];
        for(int i=0;i<n;i++){
            freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array..");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]fre=FrequeArr(arr,n);
        System.out.println("enter the number of query");
        int k= sc.nextInt();
        while (k>0){
            int val=sc.nextInt();
            if (fre[val]>0){
                System.out.println("present...(yes)");
            }
            else {
                System.out.println("not ");
            }
            k--;
        }

    }
}
