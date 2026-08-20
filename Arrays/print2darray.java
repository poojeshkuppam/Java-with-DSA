public class print2darray
{
    public static void main(String[] args) {
        int arr [][] = {{0,1,2},{0,1,2},{0,1,2}};

        int rows = arr.length;
        int colm = arr[0].length;

        for (int i = 0;i<rows;i++){
            for(int j = 0;j<colm;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
         System.out.println(" ");
        }
    }
}