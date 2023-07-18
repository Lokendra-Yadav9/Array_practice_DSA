import java.util.Scanner;

public class Print_Spiral_of_an_array {

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


    static void PrintSpiral(int[][]arr,int r,int c){
        int runTimes=r*c;
        int topRow=0,btRow=r-1;
        int leftCol=0,RtCol=c-1;
        while (runTimes>0){
           //top row= left col   to right col
            for(int j=leftCol;j<=RtCol && runTimes>0;j++){
                System.out.print(arr[topRow][j]+" ");
                runTimes--;
            }
            topRow++;
            //right col=top row to bt row
            for(int i=topRow;i<=btRow && runTimes>0;i++){
                System.out.print(arr[i][RtCol]+" ");
                runTimes--;
            }

             RtCol--;
            //btrow=right col to left col
            for(int j=RtCol;j>=leftCol && runTimes>0;j--){
                System.out.print(arr[btRow][j]+" ");
                runTimes--;
            }
             btRow--;
            //left col=btRow to top row
            for (int i=btRow;i>=topRow && runTimes>0;i--){
                System.out.print(arr[i][leftCol]+" ");
                runTimes--;
            }
            leftCol++;


        }

        Printarr(arr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j) array 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr_1=new int[r1][c1];
        Array_Create(arr_1,r1,c1);
        Printarr(arr_1);
        PrintSpiral(arr_1,r1,c1);
    }
}
