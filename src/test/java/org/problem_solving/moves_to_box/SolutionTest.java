package org.problem_solving.moves_to_box;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

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
        Solution solution = new Solution();
        solution.minPushBox(grid);

    }
}