/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsProblemSolving;

/**
 *
 * @author ridho
 */
import java.util.Scanner;
import tgsProblemSolving.Board;

public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan konfigurasi awal Teka-teki 8-Puzzle (angka 0 hingga 8, 0 adalah ubin kosong):");
        int[][] startPuzzle = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                startPuzzle[i][j] = scanner.nextInt();
            }
        }

        int[][] goalPuzzle = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };

        Board startBoard = new Board(startPuzzle);
        Board goalBoard = new Board(goalPuzzle);

        // Tambahkan batasan kedalaman di sini
        int maxDepth = 10; // Ubah sesuai kebutuhan

        BreadthFirstSearch bfs = new BreadthFirstSearch(maxDepth);
        bfs.search(startBoard, goalBoard);

        scanner.close();
    }
}
