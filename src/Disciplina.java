public class Disciplina {

    private ICalcMedia CalcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;



    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        Media = media;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }



    public void CalcularMedia(){
        this.Media = CalcMedia.CalculaMedia(this.P1, this.P2);
        this.Situacao = CalcMedia.Situacao(this.Media);
    }

    public Disciplina() {

    }

    public Disciplina(ICalcMedia strategy) {
        this.CalcMedia = strategy;
    }

}
