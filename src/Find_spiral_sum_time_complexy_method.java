import java.util.Scanner;

public class Find_spiral_sum_time_complexy_method {

    static void Printarr(int[][]arr){
        System.out.println(" \n");
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

    static void Prefix_Spiral_Array(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        System.out.println("Prefix row wise\n");
        Printarr(arr);
    }

    static void prefix_column_wise_Array(int[][] arr){
        for(int i=1;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]+=arr[i-1][j];
            }
        }
        System.out.println("prefix colomn wise \n");
        Printarr(arr);
    }

    static void SumSpiral_prefix(int [][]arr,int r1,int c1,int r2,int c2){
        int totalSum = 0;
        Prefix_Spiral_Array(arr);
        prefix_column_wise_Array(arr);
        if(r1>0 && c1>0){
            int sum = arr[r2][c2], up=arr[r1-1][c2], left=arr[r2][c1-1],leftup=arr[r1-1][c1-1];
            totalSum =sum-up-left+leftup;
        }
        else {
            int sum = arr[r2][c2];
            totalSum =sum;
        }
        System.out.println("total sum of query spiral is : "+totalSum);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j) array 1");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr_1=new int[r][c];
        Array_Create(arr_1,r,c);

        System.out.println("give the index of query array for some: from");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("give the index of query array for some: to");
        int r2=sc.nextInt();
        int c2= sc.nextInt();

        SumSpiral_prefix(arr_1,r1,c1,r2,c2);
    }
}
