package locadora.Alugavel;

public abstract class Classificacao {
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;
    public static final int ONLINE = 3;

    public abstract int getCodigoDePreco();

    public abstract double getValorDoAluguel(int diasAlugado);

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return 1;
    }

}
