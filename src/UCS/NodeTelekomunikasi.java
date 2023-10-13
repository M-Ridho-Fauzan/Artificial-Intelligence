/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UCS;

/**
 *
 * @author ridho
 */
import java.util.ArrayList;
import java.util.List;

public class NodeTelekomunikasi {

    String nama;
    int biayaPemasangan;
    List<NodeTelekomunikasi> tetangga;

    public NodeTelekomunikasi(String nama, int biayaPemasangan) {
        this.nama = nama;
        this.biayaPemasangan = biayaPemasangan;
        this.tetangga = new ArrayList<>();
    }

    public void addTetangga(NodeTelekomunikasi nodeTetangga) {
        tetangga.add(nodeTetangga);
        nodeTetangga.tetangga.add(this); // Menghubungkan kembali, karena ini adalah jaringan dua arah.
    }

    public static void main(String[] args) {
        NodeTelekomunikasi arad = new NodeTelekomunikasi("Arad", 500);
        NodeTelekomunikasi bucharest = new NodeTelekomunikasi("Bucharest", 0);
        NodeTelekomunikasi craiova = new NodeTelekomunikasi("Craiova", 600);
        NodeTelekomunikasi dobreta = new NodeTelekomunikasi("Dobreta", 300);
        NodeTelekomunikasi eforie = new NodeTelekomunikasi("eforie", 161);
        NodeTelekomunikasi fagaras = new NodeTelekomunikasi("Fagaras", 350);
        NodeTelekomunikasi giurgiu = new NodeTelekomunikasi("Giurgiu", 90);
        NodeTelekomunikasi hirsova = new NodeTelekomunikasi("Hirsova", 200);
        NodeTelekomunikasi iasi = new NodeTelekomunikasi("Iasi", 450);
        NodeTelekomunikasi lugoj = new NodeTelekomunikasi("Lugoj", 400);
        NodeTelekomunikasi mehadia = new NodeTelekomunikasi("Mehadia", 250);
        NodeTelekomunikasi neamt = new NodeTelekomunikasi("Neamt", 350);
        NodeTelekomunikasi oradea = new NodeTelekomunikasi("Oradea", 600);
        NodeTelekomunikasi pitesti = new NodeTelekomunikasi("Pitesti", 100);
        NodeTelekomunikasi rimnicuVilcea = new NodeTelekomunikasi("Rimnicu Vilcea", 200);
        NodeTelekomunikasi sibiu = new NodeTelekomunikasi("Sibiu", 300);
        NodeTelekomunikasi timisoara = new NodeTelekomunikasi("Timisoara", 400);
        NodeTelekomunikasi urziceni = new NodeTelekomunikasi("Urziceni", 250);
        NodeTelekomunikasi vaslui = new NodeTelekomunikasi("Vaslui", 300);
        NodeTelekomunikasi zerind = new NodeTelekomunikasi("Zerind", 450);

        arad.addTetangga(zerind);
        arad.addTetangga(sibiu);
        arad.addTetangga(timisoara);

        bucharest.addTetangga(fagaras);
        bucharest.addTetangga(pitesti);
        bucharest.addTetangga(giurgiu);
        bucharest.addTetangga(urziceni);

        craiova.addTetangga(dobreta);
        craiova.addTetangga(rimnicuVilcea);
        craiova.addTetangga(pitesti);

        dobreta.addTetangga(mehadia);
        dobreta.addTetangga(craiova);

        fagaras.addTetangga(sibiu);
        fagaras.addTetangga(bucharest);

        giurgiu.addTetangga(bucharest);

        hirsova.addTetangga(urziceni);
        hirsova.addTetangga(eforie);

        iasi.addTetangga(neamt);
        iasi.addTetangga(vaslui);

        lugoj.addTetangga(timisoara);
        lugoj.addTetangga(mehadia);

        mehadia.addTetangga(lugoj);
        mehadia.addTetangga(dobreta);

        neamt.addTetangga(iasi);

        oradea.addTetangga(zerind);
        oradea.addTetangga(sibiu);

        pitesti.addTetangga(rimnicuVilcea);
        pitesti.addTetangga(craiova);
        pitesti.addTetangga(bucharest);

        rimnicuVilcea.addTetangga(sibiu);
        rimnicuVilcea.addTetangga(craiova);
        rimnicuVilcea.addTetangga(pitesti);

        sibiu.addTetangga(arad);
        sibiu.addTetangga(oradea);
        sibiu.addTetangga(fagaras);
        sibiu.addTetangga(rimnicuVilcea);

        timisoara.addTetangga(arad);
        timisoara.addTetangga(lugoj);

        urziceni.addTetangga(bucharest);
        urziceni.addTetangga(vaslui);
        urziceni.addTetangga(hirsova);

        vaslui.addTetangga(iasi);
        vaslui.addTetangga(urziceni);

        zerind.addTetangga(arad);
        zerind.addTetangga(oradea);

    }
}
