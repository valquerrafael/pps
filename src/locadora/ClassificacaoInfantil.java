package locadora;

public class ClassificacaoInfantil extends Classificacao {

    @Override
    int getCodigoDePreco() {
        return 2;
    }

    @Override
    double getValorDoAluguel(int diasAlugado) {
        double valor = 1.5;

        if (diasAlugado > 3) {
            valor += (diasAlugado - 3) * 1.5;
        }

        return valor;
    }

}
