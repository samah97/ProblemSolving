package org.problem_solving.moves_to_box;

import java.util.HashMap;

public class Solution {


    HashMap<Character, Index> indexesMap = new HashMap<>();
    private static final Character PLAYER_VALUE = 'S';
    private static final Character BOX_VALUE = 'B';
    private static final Character TARGET_VALUE = 'T';
    private static final Character FLOOR_VALUE = 'T';

    /*
        char[][] grid = {
            {'#', '#', '#', '#', '#', '#'},
            {'#', 'T', '#', '#', '#', '#'},
            {'#', '.', '.', 'B', '.', '#'},
            {'#', '.', '#', '#', '.', '#'},
            {'#', '.', '.', '.', 'S', '#'},
            {'#', '#', '#', '#', '#', '#'}
    };
     */

    public int minPushBox(char[][] grid) {
        initIndexes(grid);
        int[] distances = new int[3];
        distances[0] = findShortestDistanceFromPtoB(grid);
        indexesMap.forEach((character, index) ->
                        System.out.println(character+" -- "+index.toString())
                );
        return 0;
    }

    private int findShortestDistanceFromPtoB(char[][] grid) {
        Index indexPlayer = indexesMap.get(PLAYER_VALUE);
        Index indexBox = indexesMap.get(BOX_VALUE);
        int optimalRowMoves = calculateOptimalMoves(indexPlayer.row, indexBox.row);
        int optimalColumnMoves = calculateOptimalMoves(indexPlayer.column, indexBox.column);

        int currentPlayerRow = indexPlayer.row;
        int currentPlayerColumn = indexPlayer.row;
        while ((-- currentPlayerRow > optimalRowMoves ) && isFloor(grid, currentPlayerRow, currentPlayerColumn)){
            grid[indexPlayer.row][indexBox.column] = FLOOR_VALUE;
            grid[currentPlayerRow][currentPlayerColumn] = PLAYER_VALUE;
        }

/*        if(optimalRowMoves >0){
            boolean isPossibleUp = moveUp(grid, indexPlayer.row, indexPlayer.column);
        }*/

/*        for(int i=indexPlayer.row;i<grid.length;i++){
            for (int j=indexPlayer.column;j<grid[i].length;j++){

            }
        }*/
        return 0;
    }

    boolean isFloor(char[][] grid, int row, int column){
        return FLOOR_VALUE.equals(grid[row][column]);
    }

    private int calculateOptimalMoves(int indexPlayer, int indexBox) {
        return indexPlayer - indexBox;
    }

    private void initIndexes(char[][] grid) {

        int remainingToFind = 3;

        mainloop:
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                char currentChar = grid[i][j];
                if(PLAYER_VALUE.equals(currentChar)){
                    indexesMap.put(PLAYER_VALUE, new Index(i,j));
                    remainingToFind --;
                }else if (BOX_VALUE.equals(currentChar)){
                    indexesMap.put(BOX_VALUE, new Index(i,j));
                    remainingToFind --;
                }else if (TARGET_VALUE.equals(currentChar)){
                    indexesMap.put(TARGET_VALUE, new Index(i,j));
                    remainingToFind --;
                }
                if(remainingToFind ==0){
                    break mainloop;
                }
            }
        }
    }

    class Index{
        private int row;
        private int column;

        public Index(int row,int column){
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return "Index: "+row+" ;; "+column;
        }
    }


}
