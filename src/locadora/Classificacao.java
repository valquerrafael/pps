package locadora;

public abstract class Classificacao {

    abstract int getCodigoDePreco();

    abstract double getValorDoAluguel(int diasAlugado);

    int getPontosDeAlugadorFrequente(int diasAlugado) {
        return 1;
    }

}
