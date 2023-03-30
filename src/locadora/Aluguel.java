package locadora;

public class Aluguel {
    private DVD dvd;
    private int diasAlugado;

    public Aluguel(DVD dvd, int diasAlugado) {
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
    }

    public DVD getDVD() {
        return dvd;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public double getValorDeAluguel() {
        double valor = 0;

        switch (this.dvd.getCodigoDePreco()) {
            case DVD.NORMAL -> {
                valor += 2.0;
                if (this.diasAlugado > 2) {
                    valor += (this.diasAlugado - 2) * 1.5;
                }
            }
            case DVD.LANCAMENTO -> valor += this.diasAlugado * 3.00;
            case DVD.INFANTIL -> {
                valor += 1.5;
                if (this.diasAlugado > 3) {
                    valor += (this.diasAlugado - 3) * 1.5;
                }
            }
        }

        return valor;
    }

    public int getPontosDeAlugadorFrequente() {
        int pontosDeAlugadorFrequente = 1;

        if (
            this.dvd.getCodigoDePreco() == DVD.LANCAMENTO &&
            this.diasAlugado > 1
        )
            pontosDeAlugadorFrequente++;

        return pontosDeAlugadorFrequente;
    }
}
