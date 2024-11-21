package dipendenti_astratta;

import dipendente.TipoDipartimento;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio) {
       super(matricola, stipendio, TipoDipartimento.VENDITE);
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio()+300;
    }
}
