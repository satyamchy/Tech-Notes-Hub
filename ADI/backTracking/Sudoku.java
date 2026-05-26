class SudokuGame{
    static void printGrid(int [][]grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.print(grid[i][j]+" | ");
            }
            System.out.println();
        }
    }
    static void fillGrid(int [][]grid, int row, int col){
        if(row>=grid.length){
            printGrid(grid);
            return;
        }
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid.length;j++){
               if(grid[i][j]==0){

                for(int num=1;num<=9;num++){
                    if(isValid(grid, num, i, j)){
                      grid[i][j]=num;
                      if(j<grid.length-1){
                         fillGrid(grid,i,j+1);
                      }
                      else 
                         fillGrid(grid, i+1, j);
                      grid[i][j]=0;   
                    }
                }
               }
            }
        }
    }
    static boolean isValid(int [][]grid, int num, int row, int col){
         for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid.length;j++){
                 if(grid[i][j]==num) return false;
            }
         }
         return true;
    }
};
class Sudoku{
    public static void main(String []args){
        SudokuGame game = new SudokuGame();
        int grid[][] = {
            {0,1,5},
            {3,6,7},
            {4,9,8}
        };
        game.fillGrid(grid,0,0);
    }
};