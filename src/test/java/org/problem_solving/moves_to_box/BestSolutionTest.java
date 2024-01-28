package org.problem_solving.moves_to_box;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestSolutionTest {


    char[][] grid = {
            {'#', '#', '#', '#', '#', '#'},
            {'#', 'T', '#', '#', '#', '#'},
            {'#', '.', '.', 'B', '.', '#'},
            {'#', '.', '#', '#', '.', '#'},
            {'#', '.', '.', '.', 'S', '#'},
            {'#', '#', '#', '#', '#', '#'}
    };


    @Test
    void minPushBox() {
        BestSolution bestSolution = new BestSolution();
        bestSolution.minPushBox(grid);
    }
}