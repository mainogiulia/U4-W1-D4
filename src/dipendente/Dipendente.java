package dipendente;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private TipoDipartimento dipartimento;

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public TipoDipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(TipoDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, double stipendio, TipoDipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
}
