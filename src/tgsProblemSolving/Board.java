/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsProblemSolving;

import java.util.Arrays;

public class Board {

    private final int[][] puzzle;
    private final int n; // Ukuran papan (biasanya 3x3)

    public Board(int[][] puzzle) {
        n = puzzle.length;
        this.puzzle = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.puzzle[i][j] = puzzle[i][j];
            }
        }
    }

    // Metode untuk mencetak papan
    public void printBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(puzzle[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Metode untuk memeriksa apakah papan saat ini adalah tujuan
    public boolean isGoal() {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (puzzle[i][j] != num) {
                    return false;
                }
                num = (num % (n * n) == 0) ? 0 : num;
                num++;
            }
        }
        return true;
    }

    // Metode untuk mengembalikan langkah-langkah yang mungkin
    public Board[] getNeighbors() {
        int[] dx = {0, 1, 0, -1}; // Perpindahan baris
        int[] dy = {-1, 0, 1, 0}; // Perpindahan kolom

        int x = -1, y = -1; // Koordinat ubin kosong
        outer:
        for (x = 0; x < n; x++) {
            for (y = 0; y < n; y++) {
                if (puzzle[x][y] == 0) {
                    break outer;
                }
            }
        }

        Board[] neighbors = new Board[4];
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                int[][] newPuzzle = new int[n][n];
                for (int j = 0; j < n; j++) {
                    System.arraycopy(puzzle[j], 0, newPuzzle[j], 0, n);
                }
                // Swap ubin kosong dengan tetangganya
                newPuzzle[x][y] = newPuzzle[newX][newY];
                newPuzzle[newX][newY] = 0;
                neighbors[i] = new Board(newPuzzle);
            }
        }

        return neighbors;
    }
}

/**
 *
 * @author ridho
 */
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Board extends JFrame {
//
//    private final int n; // Ukuran papan (biasanya 3x3)
//    private final JButton[][] buttons;
//
//    public Board(int[][] puzzle) {
//        n = puzzle.length;
//        buttons = new JButton[n][n];
//        JPanel panel = new JPanel(new GridLayout(n, n));
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                buttons[i][j] = new JButton(Integer.toString(puzzle[i][j]));
//                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 24));
//                panel.add(buttons[i][j]);
//            }
//        }
//
//        add(panel);
//        setTitle("8-Puzzle");
//        setSize(300, 300);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    // Metode untuk memperbarui tampilan papan
//    public void updateBoard(int[][] newPuzzle) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                buttons[i][j].setText(Integer.toString(newPuzzle[i][j]));
//            }
//        }
//    }
//
//    // Metode untuk menambahkan ActionListener ke tombol
//    public void addButtonClickListener(ActionListener listener, int row, int col) {
//        buttons[row][col].addActionListener(listener);
//    }
//
//    public static void main(String[] args) {
//        int[][] puzzle = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 0, 8}
//        };
//
//        SwingUtilities.invokeLater(() -> {
//            Board board = new Board(puzzle);
//            // Menggunakan ActionListener untuk merespons klik tombol
//            board.addButtonClickListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    // Logika untuk menggerakkan ubin
//                    // Perbarui papan
//                    int[][] newPuzzle = {
//                        {1, 2, 3},
//                        {4, 0, 6},
//                        {7, 5, 8}
//                    };
//                    board.updateBoard(newPuzzle);
//                }
//            }, 2, 1); // Contoh: Menggerakkan ubin kosong dari (2, 1)
//        });
//    }
//}
