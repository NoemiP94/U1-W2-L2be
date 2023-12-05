package es3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();

        rubricaTelefonica.inserisciContatto("Mario", "123456789");
        rubricaTelefonica.inserisciContatto("Luigi", "987654321");
        rubricaTelefonica.inserisciContatto("Peach", "147852369");

        rubricaTelefonica.stampaContatti();

        rubricaTelefonica.cercaNumeroPerNome("Luigi");
        rubricaTelefonica.cercaPersonaPerNumero("123456789");

        rubricaTelefonica.cancellaContatto("Peach");

        rubricaTelefonica.stampaContatti();
    }
}
