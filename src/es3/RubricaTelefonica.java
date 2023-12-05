package es3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica(){
        this.rubrica = new HashMap<>();
    }

    //inserimento coppia chiave-valore
    public void inserisciContatto(String nome, String telefono){
        rubrica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + ", " + telefono);
    }

    //eliminazione coppia chiave-valore, avendo solo il nome
    public void cancellaContatto(String nome){
        if(rubrica.containsKey(nome)){
            String telefono = rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome + ", " + telefono);
        }else{
            System.out.println("Contatto non trovato per nome: " + nome);
        }
    }

    //ricerca di una persona avendo solo il numero
    public void cercaPersonaPerNumero(String telefono){
        for(Map.Entry<String, String> entry : rubrica.entrySet()){
            if(entry.getValue().equals(telefono)){
                System.out.println("Persona trovata: " + entry.getKey() + ", " + telefono);
                return;
            }
        }
        System.out.println("Persona non trovata per il numero: " + telefono);
    }

    //ricerca numero di una persona avendo solo il nome
    public void cercaNumeroPerNome(String nome){
        if(rubrica.containsKey(nome)){
            String telefono = rubrica.get(nome);
            System.out.println("Numero di telefono per " + nome + ": " + telefono);
        }else{
            System.out.println("Contatto non trovato per il nome: " + nome);
        }
    }

    //stampa i contatti
    public void stampaContatti(){
        if(rubrica.isEmpty()){
            System.out.println("Rubrica vuota. Nessun contatto disponibile.");
        }else{
            System.out.println("Elenco dei contatti: ");
            for(Map.Entry<String, String> entry : rubrica.entrySet()){
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }
        }
    }
}
