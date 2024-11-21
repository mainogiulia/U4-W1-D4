package dipendente;

public class MainDipendente {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente("54321", 1500, TipoDipartimento.PRODUZIONE);
        Dipendente dip2 = new Dipendente("09876", 1900, TipoDipartimento.VENDITE);
        Dipendente dip3 = new Dipendente("45678", 2500, TipoDipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = dip1;
        dipendenti[1] = dip2;
        dipendenti[2] = dip3;

        for (int i = 0; i < dipendenti.length; i++) {
            Dipendente current = dipendenti[i];
            System.out.println("Matricola n°: " + current.getMatricola());
        }
    }
}
