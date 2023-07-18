
import java.util.Scanner;

public class different_number_in_array {
//    public static int differentele(int [] arr){
//        int ans=0;
//        for (int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]== arr[j]){
//                      arr[i]=-1;
//                      arr[j]=-1;
//                }
//            }
//
//            for (int k=0;k<arr.length;k++){
//                if(arr[k]!= -1){
//                    ans=arr[k];
//                }
//
//            }
//
//        }
////        System.out.println(ans+" ");
//        return ans;
//    }

//    public static void SecondMax(int [] arr){
////        int []array=new int[arr.length-1];
////        for(int i=0;i<arr.length;i++){
////            if()
////        }
//       int[]temp= Arrays.stream(arr).sorted().toArray();
//        System.out.println("secondlast max is "+temp[arr.length-2]);
//    }
//     public static void printarr(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }


    public static int findax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > mx) {
                mx = j;
            }
        }
        return mx;
    }
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the length of arr");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int ar : arr) {
                System.out.print(ar + " ");
            }
            System.out.println(" ");

//        int result=differentele(arr);
//        System.out.println("\n a uniqe number is "+result);

//        different_number_in_array.SecondMax(arr);

            int result = different_number_in_array.findax(arr);
            System.out.println("max number is " + result);
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == result) {
                        arr[i] = Integer.MIN_VALUE;
                    }
                }
                int result2 = different_number_in_array.findax(arr);
                System.out.println("second max number is " + result2);

        }

    }
