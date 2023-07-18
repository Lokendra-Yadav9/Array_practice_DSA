import java.util.Scanner;

public class TRansform_of_2D_array {
    static void Printarr(int[][]arr){
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

    private static void Revers_2D_Array_transform(int[][] arr, int r1, int c1) {
        int [][]ans=new int[c1][r1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[j][i]=arr[i][j];
            }
        }
        Printarr(ans);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j) array 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr_1=new int[r1][c1];
        Array_Create(arr_1,r1,c1);
        Printarr(arr_1);
        Revers_2D_Array_transform(arr_1,r1,c1);
    }
}
