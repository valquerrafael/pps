package locadora;

public class ClassificacaoNormal extends Classificacao {

    @Override
    int getCodigoDePreco() {
        return 0;
    }

    @Override
    double getValorDoAluguel(int diasAlugado) {
        double valor = 2.0;

        if (diasAlugado > 2) {
            valor += (diasAlugado - 2) * 1.5;
        }

        return valor;
    }

}
