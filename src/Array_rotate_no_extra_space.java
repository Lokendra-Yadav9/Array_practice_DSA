import java.util.Scanner;

public class Array_rotate_no_extra_space {

    public static void Printarr(int[] arr) {
        System.out.println(" ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int temp = 0;

    public static int[] SwapArr(int arr[], int i, int j) {

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int[] revers(int[] arr, int i, int j) {
        while(i < j) {
            SwapArr(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static void reverseRotate(int[] arr, int k) {
//      int []ans=new int[arr.length];
        int n = arr.length;
        revers(arr, 0, n - k - 1);
        revers(arr, n - k, n - 1);
        revers(arr,0,n-1);
//        Printarr(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Printarr(arr);
        System.out.println("enter number of rotation: ");
        int k = sc.nextInt();
        if (k > n) {
            k = k % n;
        }
            reverseRotate(arr, k);
          Printarr(arr);
        }
    }

