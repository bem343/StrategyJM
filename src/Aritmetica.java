public class Aritmetica implements ICalcMedia {

    @Override
    public double CalculaMedia(double P1, double P2) {
        return (P1 + P2) / 2;
    }

    @Override
    public String Situacao(double media) {
        return (media >= 5)? "Aprovado" : "Reprovado";
    }

}
