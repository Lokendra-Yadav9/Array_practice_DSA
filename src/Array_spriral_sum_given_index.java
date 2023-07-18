import java.util.Scanner;

public class Array_spriral_sum_given_index {
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

    static void SumSpiral(int[][]arr,int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.print("the sum of selected spiral is :"+sum);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j) array 1");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr_1=new int[r][c];
        Array_Create(arr_1,r,c);
        Printarr(arr_1);

        System.out.println("give the index of query array for some: from");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("give the index of query array for some: to");
        int r2=sc.nextInt();
        int c2= sc.nextInt();

        SumSpiral(arr_1,r1,c1,r2,c2);
    }
}
