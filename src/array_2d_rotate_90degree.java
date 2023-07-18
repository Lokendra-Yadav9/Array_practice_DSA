import java.util.Scanner;

public class array_2d_rotate_90degree {
    static void Printarr(int[][]arr){
        System.out.println();
        for(int []i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    static void Array_Create(int[][] arr,int row,int column ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of row "+row+" and column "+column+" for array ");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static int[][] Array_transform(int[][]arr1,int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp=0;
                    temp = arr1[i][j];
                   arr1[i][j]=arr1[j][i];
                   arr1[j][i]=temp;
            }
        }
        Printarr(arr1);
        return arr1;
    }
    static void swapArrays(int[]arr,int c1){
        int j=c1-1;
        for(int i=0;i<j;i++,j--){
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
        }
    }


    static void Rotate_90degree_in_place(int[][] arr1, int r1, int c1) {
        Array_transform(arr1,r1,c1);
        for(int i=0;i<r1;i++){
            swapArrays(arr1[i],c1);
        }
        Printarr(arr1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j) array 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr_1=new int[r1][c1];
        Array_Create(arr_1,r1,c1);
        Printarr(arr_1);
        Rotate_90degree_in_place(arr_1,r1,c1);
    }

}
