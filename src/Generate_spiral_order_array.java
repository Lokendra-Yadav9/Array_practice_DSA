import java.util.Scanner;

public class Generate_spiral_order_array {

    static void Printarr(int[][]arr){
        System.out.println();
        for(int []i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    static void Generate_spiral(int n){
        int [][]arr=new int[n][n];
        int curr=1;
        int topRow=0,btRow=n-1;
        int leftCol=0,RtCol=n-1;
        while (curr<=n*n){
            //top row= left col   to right col
            for(int j=leftCol;j<=RtCol && curr<=n*n;j++){
                arr[topRow][j]= curr++;
            }
            topRow++;
            //right col=top row to bt row
            for(int i=topRow;i<=btRow && curr<=n*n;i++){
                arr[i][RtCol]=curr++;
            }

            RtCol--;
            //btrow=right col to left col
            for(int j=RtCol;j>=leftCol && curr<=n*n;j--){
              arr[btRow][j]=curr++;
            }
            btRow--;
            //left col=btRow to top row
            for (int i=btRow;i>=topRow && curr<=n*n;i--){
                arr[i][leftCol]=curr++;
            }
            leftCol++;

        }

        Printarr(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of n");
        int n=sc.nextInt();
        Generate_spiral(n);
    }
}
