/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsProblemSolving;

/**
 *
 * @author ridho
 */
import java.util.ArrayList;
import java.util.List;
import tgsProblemSolving.Board;

public class Solusi {

    private List<Board> path;

    public Solusi() {
        path = new ArrayList<>();
    }

    public void setPath(List<Board> path) {
        this.path = new ArrayList<>(path);
    }

    public List<Board> getPath() {
        return path;
    }

    public void addToPath(Board board) {
        path.add(board);
    }
}
