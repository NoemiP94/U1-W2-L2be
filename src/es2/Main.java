package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaCasuale = generaListaCasuale(10);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaConInverso = listaConInverso(new ArrayList<>(listaCasuale));
        System.out.println("Lista con inverso: " + listaConInverso);

        stampaPosizione(listaConInverso, true);
        stampaPosizione(listaConInverso, false);
    }

    public static List<Integer> generaListaCasuale(int n){
        List<Integer> listaCasuale = new ArrayList<>();
        Random rndm = new Random();

        for (int i = 0; i < n; i++){
            listaCasuale.add(rndm.nextInt(101)); //numeri casuali da 0 a 100
        }

        Collections.sort(listaCasuale);

        return listaCasuale;
    }

    //funzione che crea una nuova lista con elementi seguiti dall'inverso
    public static List<Integer> listaConInverso(List<Integer> lista){
        List<Integer> nuovaLista = new ArrayList<>(lista);
        Collections.reverse(nuovaLista);
        lista.addAll(nuovaLista);
        return lista;
    }

    //funzione per stampare valori in posizione pari o dispari
    public static void stampaPosizione(List<Integer> lista, boolean pari){
        System.out.println("Valori in posizione " + (pari? "pari: " : "dispari: "));
        for(int i = (pari ? 0 : 1); i < lista.size(); i += 2){
            System.out.println(lista.get(i));
        }
    }
}
