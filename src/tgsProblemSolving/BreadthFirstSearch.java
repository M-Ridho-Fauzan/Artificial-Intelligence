/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsProblemSolving;

import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch {

    private int maxDepth; // Batasan kedalaman

    public BreadthFirstSearch(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void search(Board startBoard, Board goalBoard) {
        Queue<Board> queue = new LinkedList<>();
        queue.offer(startBoard);
        boolean found = false;
        int depth = 0; // Menyimpan kedalaman saat ini

        while (!queue.isEmpty() && !found) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Board currentBoard = queue.poll();

                if (currentBoard.isGoal()) {
                    System.out.println("Solusi ditemukan!");
                    found = true;
                    break;
                }

                if (depth < maxDepth) {
                    for (Board neighbor : currentBoard.getNeighbors()) {
                        // Periksa apakah tetangga telah dievaluasi sebelumnya
                        // dan apakah tetangga sama dengan papan tujuan
                        if (neighbor != null && !neighbor.equals(startBoard) && !neighbor.equals(goalBoard)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }

            depth++;

            if (depth >= maxDepth) {
                System.out.println("Solusi tidak ditemukan dalam batasan kedalaman yang diberikan.");
                break;
            }
        }

        if (!found) {
            System.out.println("Tidak ada solusi yang ditemukan.");
        }
    }
}

/**
 *
 * @author ridho
 */
//import java.util.ArrayList;
//import java.util.Queue;
//import java.util.LinkedList;
//import tgsProblemSolving.Board;
//
//public class BreadthFirstSearch {
//
//    public void search(Board startBoard, Board goalBoard, int maxDepth) {
//        Queue<Solusi> queue = new LinkedList<>();
//        Solusi solusiStart = new Solusi();
//        solusiStart.addToPath(startBoard);
//        queue.offer(solusiStart);
//
//        while (!queue.isEmpty()) {
//            Solusi eval = queue.poll();
//            Board currentBoard = eval.getPath().get(eval.getPath().size() - 1);
//
//            if (currentBoard.isGoal()) {
//                System.out.println("Solusi ditemukan!");
//                // Cetak jalur langkah di sini
//                for (Board board : eval.getPath()) {
//                    board.printBoard();
//                    System.out.println();
//                }
//                return;
//            } else if (eval.getPath().size() < maxDepth) {
//                for (Board neighbor : currentBoard.getNeighbors()) {
//                    if (neighbor != null && !eval.getPath().contains(neighbor)) {
//                        Solusi solusiSuksesor = new Solusi();
//                        solusiSuksesor.setPath(new ArrayList<>(eval.getPath()));
//                        solusiSuksesor.addToPath(neighbor);
//                        queue.offer(solusiSuksesor);
//                    }
//                }
//            }
//        }
//
//        System.out.println("Tidak ada solusi yang ditemukan.");
//    }
//}
