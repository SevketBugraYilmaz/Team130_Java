package odevler;

import java.util.Random;
import java.util.Scanner;

public class XOXOyunu {
    static char[][] board = {{'☺', '☻', '☺'}, {'☻', '☺', '☻'}, {'☺', '☻', '☺'}};
    static char playerSymbol, computerSymbol;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("☺☻☺\n☻☺☻\n☺☻☺");
        System.out.println("Oyun baslatılıyor...");

        chooseSymbol();
        displayBoard();

        while (true) {
            playerMove();
            if (checkWin(playerSymbol)) {
                displayBoard();
                System.out.println("Oyuncu kazandı!");
                break;
            }
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Berabere!");
                break;
            }

            computerMove();
            if (checkWin(computerSymbol)) {
                displayBoard();
                System.out.println("Bilgisayar kazandı!");
                break;
            }
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Berabere!");
                break;
            }
        }

        scanner.close();
    }

    static void chooseSymbol() {
        System.out.println("Lütfen 'X' veya 'O' seçeneklerinden birisini seçiniz.");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'X') {
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else if (choice == 'O') {
            playerSymbol = 'O';
            computerSymbol = 'X';
        } else {
            System.out.println("Geçersiz seçenek. 'X' veya 'O' seçiniz.");
            chooseSymbol();
        }
    }

    static void displayBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    static void playerMove() {
        System.out.println("Oyuncu hamlenizi giriniz: ");
        int move = scanner.nextInt();

        if (isValidMove(move)) {
            makeMove(move, playerSymbol);
            displayBoard();
        } else {
            System.out.println("Geçersiz hamle. Lütfen boş bir hücre seçin.");
            playerMove();
        }
    }

    static void computerMove() {
        int move;
        do {
            move = random.nextInt(9) + 1;
        } while (!isValidMove(move));

        makeMove(move, computerSymbol);
        System.out.println("Bilgisayar hamlesi: " + move);
        displayBoard();
    }

    static boolean isValidMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        return board[row][col] == '☺';
    }

    static void makeMove(int move, char symbol) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = symbol;
    }

    static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '☺') {
                    return false;
                }
            }
        }
        return true;
    }
}
