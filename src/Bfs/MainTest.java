/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bfs;

/**
 *
 * @author ridho
 */
public class MainTest {

    public static void main(String[] args) {

//        Node S = new Node("S");
//        Node A = new Node("A");
//        Node B = new Node("B");
//        Node C = new Node("C");
//        Node D = new Node("D");
//        Node E = new Node("E");
//        Node F = new Node("F");
//        Node G = new Node("G");
//        Node H = new Node("H");
//        Node I = new Node("I");
//        Node J = new Node("J");
//        Node K = new Node("K");
//        Node L = new Node("L");
//        Node M = new Node("M");
//        Node N = new Node("N");
//        Node O = new Node("O");
//        Node P = new Node("P");
//        Node Q = new Node("Q");
//        Node R = new Node("R");
//        Node T = new Node("T");
//        Node U = new Node("U");
//        Node V = new Node("V");
//        Node W = new Node("W");
//        Node X = new Node("X");
//        Node Y = new Node("Y");
//        Node Z = new Node("Z");
//
//        S.addTetangga(A);
//        A.addTetangga(S);
//        A.addTetangga(B);
//
//        B.addTetangga(A);
//        B.addTetangga(C);
//
//        C.addTetangga(B);
//        C.addTetangga(D);
//
//        D.addTetangga(C);
//        D.addTetangga(E);
//
//        E.addTetangga(D);
//        E.addTetangga(F);
//
//        F.addTetangga(E);
//        F.addTetangga(G);
//
//        G.addTetangga(F);
//        G.addTetangga(H);
//
//        H.addTetangga(G);
//        H.addTetangga(I);
//
//        I.addTetangga(H);
//        I.addTetangga(J);
//
//        J.addTetangga(I);
//        J.addTetangga(K);
//
//        K.addTetangga(J);
//        K.addTetangga(L);
//
//        L.addTetangga(K);
//        L.addTetangga(M);
//
//        M.addTetangga(L);
//        M.addTetangga(N);
//
//        N.addTetangga(M);
//        N.addTetangga(O);
//
//        O.addTetangga(N);
//        O.addTetangga(P);
//
//        P.addTetangga(O);
//        P.addTetangga(Q);
//
//        Q.addTetangga(P);
//        Q.addTetangga(R);
//
//        R.addTetangga(Q);
//        R.addTetangga(T);
//
//        T.addTetangga(R);
//        T.addTetangga(U);
//
//        U.addTetangga(T);
//        U.addTetangga(V);
//
//        V.addTetangga(U);
//        V.addTetangga(W);
//
//        W.addTetangga(V);
//        W.addTetangga(X);
//
//        X.addTetangga(W);
//        X.addTetangga(Y);
//
//        Y.addTetangga(X);
//        Y.addTetangga(Z);
//
//        Z.addTetangga(Y);
//        System.out.println("================= BFS =================");
//        BreadthFirstSearch bfs = new BreadthFirstSearch();
//        bfs.search(S, G);
//        System.out.println();
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

        System.out.println("================= BFS =================");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(C, L);
        System.out.println();
    }
}
