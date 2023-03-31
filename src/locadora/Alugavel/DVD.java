package locadora.Alugavel;

public class DVD implements Alugavel {

    private String titulo;

    private Classificacao classificacao;

    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.setCodigoDePreco(codigoDePreco);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setCodigoDePreco(int codigoDePreco) {
        switch (codigoDePreco) {
            case 0 -> this.classificacao = new ClassificacaoNormal();
            case 1 -> this.classificacao = new ClassificacaoLancamento();
            case 2 -> this.classificacao = new ClassificacaoInfantil();
        }
    }

    public double getValorDoAluguel(int diasAlugado) {
        return this.classificacao.getValorDoAluguel(diasAlugado);
    }

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return this.classificacao.getPontosDeAlugadorFrequente(diasAlugado);
    }
}
