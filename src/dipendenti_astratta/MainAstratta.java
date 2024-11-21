package dipendenti_astratta;

import java.util.ArrayList;

public class MainAstratta {
    public static void main(String[] args) {
        Dipendente dip1 = new DipendenteFullTime("12345", 1900);
        Dipendente dip2 = new DipendentePartTime("67890", 1300);
        Dipendente dip3 = new Dirigente("45678", 2500);

        ArrayList<Dipendente> dipendenti = new ArrayList<>(3);

        dipendenti.add(dip1);
        dipendenti.add(dip2);
        dipendenti.add(dip3);

        for (int i = 0; i < dipendenti.size(); i++) {
            Dipendente current = dipendenti.get(i);
            System.out.println("Stipendio: " + current.calcolaStipendio() + " € - Matricola n°: " + current.getMatricola());
        }

        Volontario dip4 = new Volontario("Luca", "CV n°220", "27");

        ArrayList<ICheckIn> checkedIn = new ArrayList<>();

        checkedIn.add(dip1);
        checkedIn.add(dip4);

        for (int i = 0; i < checkedIn.size(); i++) {
            ICheckIn corrente = checkedIn.get(i);
            corrente.checkIn();
        }
    }
}
