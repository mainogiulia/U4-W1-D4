package dipendenti_astratta;

import dipendente.TipoDipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(String matricola, double stipendio) {
        super(matricola, stipendio, TipoDipartimento.AMMINISTRAZIONE);
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio()+500;
    }
}