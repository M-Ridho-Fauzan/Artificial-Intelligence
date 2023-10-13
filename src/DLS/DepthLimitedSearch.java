/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLS;

/**
 *
 * @author ridho
 */
public class DepthLimitedSearch {

    private int limit;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void search(Node start, Node goal) {
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());
        boolean result = searchRecursive(start, goal, 0);
        if (result) {
            System.out.println("Solusi ditemukan");
        } else {
            System.out.println("Solusi tidak ditemukan");
        }
    }

    private boolean searchRecursive(Node node, Node goal, int depth) {
        System.out.println("Level " + depth + " evaluasi: " + node.getNilai());

        if (node.equals(goal)) {
            return true; // Solusi ditemukan
        }

        if (depth >= limit) {
            return false; // Batas kedalaman tercapai, berhenti pencarian
        }

        for (Node neighbor : node.getTetangga()) {
            if (searchRecursive(neighbor, goal, depth + 1)) {
                return true; // Jika solusi ditemukan pada tingkat yang lebih dalam, kembalikan true
            }
        }

        return false; // Tidak ada solusi pada kedalaman ini
    }

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        Node J = new Node("J");
        Node K = new Node("K");
        Node L = new Node("L");
        Node M = new Node("M");
        Node N = new Node("N");

        A.addTetangga(B);
        A.addTetangga(E);

        B.addTetangga(C);
        B.addTetangga(A);
        B.addTetangga(D);

        C.addTetangga(B);

        D.addTetangga(F);
        D.addTetangga(B);

        E.addTetangga(A);

        F.addTetangga(G);
        F.addTetangga(D);

        G.addTetangga(F);
        G.addTetangga(H);

        H.addTetangga(G);
        H.addTetangga(I);

        I.addTetangga(H);
        I.addTetangga(J);

        J.addTetangga(I);
        J.addTetangga(K);

        K.addTetangga(M);
        K.addTetangga(J);
        K.addTetangga(L);

        L.addTetangga(K);

        M.addTetangga(N);
        M.addTetangga(K);

        N.addTetangga(M);

        System.out.println("================= DLS =================");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(C, L);
        System.out.println();
    }
}
