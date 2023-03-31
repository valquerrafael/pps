package locadora.Alugavel;

import locadora.Alugavel.Classificacao;

public class ClassificacaoLancamento extends Classificacao {

    @Override
    public int getCodigoDePreco() {
        return Classificacao.LANCAMENTO;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3.00;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return super.getPontosDeAlugadorFrequente(diasAlugado) + 1;
    }

}
