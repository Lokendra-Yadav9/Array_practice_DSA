import java.util.Scanner;

public class generate_spiral_anticlockwise {

    static void Printarr(int[][]arr){
        System.out.println();
        for(int []i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    static void Generate_Anti_spiral(int n){
        int[][]arr=new int[n][n];
       int curr=1;
        int toprow=0,bottomrow=n-1;
        int leftcol=0,rightcol=n-1;
        while(curr<=n*n){

            //top row=rightcol to leftcol
            for(int j=rightcol;j>=leftcol && curr<=n*n ;j--){
                arr[toprow][j]=curr++;
            }
            toprow++;
            //left col=top row to bottom row
            for(int i=toprow;i<=bottomrow && curr<=n*n ;i++){
                arr[i][leftcol]=curr++;
            }
            leftcol++;
            //bottom row=left col to right col
            for (int j=leftcol;j<=rightcol && curr<=n*n ;j++){
                arr[bottomrow][j]=curr++;
            }
            bottomrow--;
            //right col=bottm row to top row
            for (int i=bottomrow;i>=toprow && curr<=n*n ;i--){
                arr[i][rightcol]=curr++;
            }
            rightcol--;
        }
        Printarr(arr);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of n");
        int n=sc.nextInt();
        Generate_Anti_spiral(n);
    }
}
