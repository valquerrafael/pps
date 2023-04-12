package locadora.Alugavel;

public class Game implements Alugavel {
    private String titulo;

    private Classificacao classificacao;

    public Game(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.setCodigoDePreco(codigoDePreco);
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    public void setCodigoDePreco(int codigoDePreco) {
        switch (codigoDePreco) {
            case 0 -> this.classificacao = new ClassificacaoNormal();
            case 1 -> this.classificacao = new ClassificacaoLancamento();
            case 2 -> this.classificacao = new ClassificacaoOnline();
        }
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return this.classificacao.getValorDoAluguel(diasAlugado);
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return this.classificacao.getPontosDeAlugadorFrequente(diasAlugado);
    }
}
