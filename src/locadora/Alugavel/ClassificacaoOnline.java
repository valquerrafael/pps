package locadora.Alugavel;

public class ClassificacaoOnline extends Classificacao {

    @Override
    public int getCodigoDePreco() {
        return Classificacao.ONLINE;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        if (diasAlugado > 3)
            return 3.00 * diasAlugado;

        return 4.00 * diasAlugado;
    }

}
