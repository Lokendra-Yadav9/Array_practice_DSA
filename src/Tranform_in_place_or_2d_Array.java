import java.util.Scanner;

public class Tranform_in_place_or_2d_Array {

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

    static void Tramsform_in_place(int[][] arr1, int r1, int c1) {
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp=0;
                temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
//                if(i==j){
//                    arr1[i][j]=arr1[i][j];
//                }
//                else {
//                    arr1[j][i] = arr1[i][j];
//                }
            }
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
        Tramsform_in_place(arr_1,r1,c1);

    }

}
