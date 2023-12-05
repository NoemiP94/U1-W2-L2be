package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi: ");
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci " + n + " parole: ");
        for(int i = 0; i < n; i++){
            String parola = scanner.nextLine();

            if(!paroleDistinte.add(parola)){
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: ");
        for(String parola : paroleDuplicate){
            System.out.println(parola);
        }

        System.out.println("Numero parole distinte; " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: ");
        for(String parola : paroleDistinte){
            System.out.println(parola);
        }

        scanner.close();


    }
}