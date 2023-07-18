import java.util.Scanner;

public class Pascal_2d_Array {

    static void Printarr(int[][]arr){
        System.out.println();
        for(int []i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    static int[][] PascalPrint(int n){
        int [][]arr=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];

            arr[i][0]=arr[i][i]=1;

            for (int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i)");
        int r1=sc.nextInt();
        int[][]p= PascalPrint(r1);
        Printarr(p);

    }
}
