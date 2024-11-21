package dipendenti_astratta;

public class Volontario implements ICheckIn{
    private String nome;
    private String eta;
    private String CV;

    public Volontario(String nome, String CV, String eta) {
        this.nome = nome;
        this.CV = CV;
        this.eta = eta;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario ha iniziato il turno di servizio");
    }
}
