import java.util.Scanner;

public class Array_2D_multiplication {

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

    static void Array_multiplication(int[][]arr_1,int[][]arr_2,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("multiplication can not performed: c1!=R1");
            return;
        }
        int[][]mul=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for (int k=0;k<c1;k++) {
                    mul[i][j] += arr_1[i][k] * arr_2[k][j];
                }
            }
        }
        Printarr(mul);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j) array 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr_1=new int[r1][c1];
        Array_Create(arr_1,r1,c1);
        System.out.println("enter the number of row (i) and column (j) array 2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]arr_2=new int[r2][c2];
        Array_Create(arr_2,r2,c2);
        Array_multiplication(arr_1,arr_2,r1,c1,r2,c2);
    }
}
