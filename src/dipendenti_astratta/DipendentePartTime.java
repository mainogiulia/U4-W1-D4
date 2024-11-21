package dipendenti_astratta;

import dipendente.TipoDipartimento;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(String matricola, double stipendio) {
        super(matricola, stipendio, TipoDipartimento.PRODUZIONE);
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio()+200;
    }
}