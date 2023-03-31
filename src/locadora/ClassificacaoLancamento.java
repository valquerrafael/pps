package locadora;

public class ClassificacaoLancamento extends Classificacao {

    @Override
    int getCodigoDePreco() {
        return 1;
    }

    @Override
    double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3.00;
    }

    @Override
    int getPontosDeAlugadorFrequente(int diasAlugado) {
        return super.getPontosDeAlugadorFrequente(diasAlugado) + 1;
    }

}
