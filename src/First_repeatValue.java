import java.util.Scanner;

public class First_repeatValue {
   public static void Printarr(int[] arr){
       System.out.println(" ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static int RepeatElement(int[] arr) {
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = arr[i];
                    return count;
                }
            }
        }
        return -1;
    }
//    }public static int[] RepeatElement(int[] arr){
//       int[] count=new int[arr.length];
//       for (int i =0;i<arr.length;i++){
//           for (int j=i+1;j<arr.length;j++) {
//               if (arr[i]==arr[j]){
//                   count[i]=arr[i];
//               }
//           }
//       }
//       return count;
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      First_repeatValue.Printarr(arr);
        int ans=First_repeatValue.RepeatElement(arr);
//        First_repeatValue.Printarr(ans);
        System.out.println(" \n"+ans);
    }
}
