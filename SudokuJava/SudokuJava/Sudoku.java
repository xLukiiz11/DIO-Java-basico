public class Sudoku {
    private Celula[][] board;
    private final int SIZE = 9;

    public Sudoku() {
        board = new Celula[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = new Celula(0, false);
    }

    public void setInitialValue(int row, int col, int value, boolean fixo) {
        board[row][col] = new Celula(value, fixo);
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            if (i % 3 == 0 && i != 0)
                System.out.println("-----------");

            for (int j = 0; j < SIZE; j++) {
                if (j % 3 == 0 && j != 0)
                    System.out.print("|");

                int val = board[i][j].valor;
                System.out.print(val == 0 ? "." : val);
            }
            System.out.println();
        }
    }

    public boolean isValid(int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i].valor == num || board[i][col].valor == num)
                return false;
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = boxRow; i < boxRow + 3; i++)
            for (int j = boxCol; j < boxCol + 3; j++)
                if (board[i][j].valor == num)
                    return false;

        return true;
    }

    public boolean isComplete() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j].valor == 0)
                    return false;
        return true;
    }

    public boolean makeMove(int row, int col, int num) {
        if (!board[row][col].fixo && board[row][col].valor == 0 && isValid(row, col, num)) {
            board[row][col].valor = num;
            return true;
        }
        return false;
    }
}