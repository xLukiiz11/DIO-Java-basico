import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();

        for (String arg : args) {
            try {
                String[] parts = arg.split(";");
                String[] coords = parts[0].split(",");
                int row = Integer.parseInt(coords[0]);
                int col = Integer.parseInt(coords[1]);

                String[] valueFix = parts[1].split(",");
                int value = Integer.parseInt(valueFix[0]);
                boolean fixo = Boolean.parseBoolean(valueFix[1]);

                sudoku.setInitialValue(row, col, value, fixo);
            } catch (Exception e) {
                System.out.println("Erro ao processar argumento: " + arg);
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Jogo de Sudoku =====");

        while (!sudoku.isComplete()) {
            sudoku.printBoard();
            System.out.println("Digite linha (0-8), coluna (0-8) e número (1-9):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int num = scanner.nextInt();

            if (!sudoku.makeMove(row, col, num)) {
                System.out.println("Movimento inválido! Tente novamente.");
            }
        }

        System.out.println("Parabéns! Você completou o Sudoku!");
        sudoku.printBoard();
    }
}