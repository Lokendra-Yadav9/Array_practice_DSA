import java.util.Scanner;

public class Array_2D_intro_initialization {
    static void Printarr(int[][]arr){
        for(int []i:arr){
              for(int j:i){
                  System.out.print(j+" ");
              }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row (i) and column (j)");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][]arr=new int[row][column];
        System.out.println("Enter numbers of row "+row+" and column "+column);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Printarr(arr);
    }
}
