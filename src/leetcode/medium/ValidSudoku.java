package leetcode.medium;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        for (char[] row : board) {
            if (!isArrayValid(row)) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            char[] column = new char[9];
            for (int j = 0; j < board.length; j++) {
                column[j] = board[j][i];
            }
            if (!isArrayValid(column)) {
                return false;
            }
        }

        char[] box1 = {board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]};
        char[] box2 = {board[0][3], board[0][4], board[0][5], board[1][3], board[1][4], board[1][5], board[2][3], board[2][4], board[2][5]};
        char[] box3 = {board[0][6], board[0][7], board[0][8], board[1][6], board[1][7], board[1][8], board[2][6], board[2][7], board[2][8]};

        char[] box4 = {board[3][0], board[3][1], board[3][2], board[4][0], board[4][1], board[4][2], board[5][0], board[5][1], board[5][2]};
        char[] box5 = {board[3][3], board[3][4], board[3][5], board[4][3], board[4][4], board[4][5], board[5][3], board[5][4], board[5][5]};
        char[] box6 = {board[3][6], board[3][7], board[3][8], board[4][6], board[4][7], board[4][8], board[5][6], board[5][7], board[5][8]};

        char[] box7 = {board[6][0], board[6][1], board[6][2], board[7][0], board[7][1], board[7][2], board[8][0], board[8][1], board[8][2]};
        char[] box8 = {board[6][3], board[6][4], board[6][5], board[7][3], board[7][4], board[7][5], board[8][3], board[8][4], board[8][5]};
        char[] box9 = {board[6][6], board[6][7], board[6][8], board[7][6], board[7][7], board[7][8], board[8][6], board[8][7], board[8][8]};

        char[][] boxes = {box1, box2, box3, box4, box5, box6, box7, box8, box9};
        for (char[] box : boxes) {
            if (!isArrayValid(box)) {
                return false;
            }
        }
        return true;
    }

    static boolean isArrayValid(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != '.') {
                    if (array[i] == array[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //idea: flatten the 9x9
    public static void main(String[] args) {
        /*char[][] boardFalse = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};*/


        char[][] boardTrue = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(boardTrue));

    }
}
