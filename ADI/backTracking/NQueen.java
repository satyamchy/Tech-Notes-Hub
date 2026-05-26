 class NQueenEl{
    static void printGrid(char grid[][]){
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.print(grid[i][j]+" | ");
            }
            System.out.println();
        }
         System.out.println("----------------------------------------");
    }

    public static void placeQueenAt(char [][]grid, int row ){
         if(row>=grid.length){
            printGrid(grid);
            return;
         }
         for(int col = 0; col<grid.length;col++){
            if(isValid(grid, row, col)){
                 grid[row][col] = 'Q'; 
                 placeQueenAt(grid, row+1);
                 printGrid(grid);
                 grid[row][col] = '_';
            }
         }
    }

    static boolean isValid(char grid[][], int row, int col){
        /* UPPER */
      for(int i=row-1;i>=0;i--){
        if(grid[i][col]== 'Q') return false;
      }
        /* UPPER  LEFT*/
        for(int i=row-1, j = col-1; i>=0 && j>=0; i--, j--){
                    if(grid[i][j]== 'Q') return false;
        }
        /* UPPER RIGHT */
         for(int i=row-1, j = col+1; i>=0 && j<grid.length; i--, j++){
                    if(grid[i][j]== 'Q') return false;
        }
        return true;
    }
}

public class NQueen{

    public static void main(String args[]){
        NQueenEl nq = new NQueenEl();
        char grid[][] = {
            {'_','_','_','_',},
            {'_','_','_','_',},
            {'_','_','_','_',},
            {'_','_','_','_',},
           
        };
            nq.printGrid(grid);
            nq.placeQueenAt(grid, 0);

    }

}