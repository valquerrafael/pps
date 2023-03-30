package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;

        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while(alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            double valorCorrente = this.valorDeAluguel(aluguel);
            pontosDeAlugadorFrequente += this.pontosDeAlugadorFrequente(aluguel);

            resultado += this.extratoAluguel(aluguel);
            valorTotal += valorCorrente;
        }

        resultado += this.extratoTotal(valorTotal, pontosDeAlugadorFrequente);

        return resultado;
    }

    private double valorDeAluguel(Aluguel aluguel) {
        double valor = 0;

        switch (aluguel.getDVD().getCodigoDePreco()) {
            case DVD.NORMAL -> {
                valor += 2.0;
                if (aluguel.getDiasAlugado() > 2) {
                    valor += (aluguel.getDiasAlugado() - 2) * 1.5;
                }
            }
            case DVD.LANCAMENTO -> valor += aluguel.getDiasAlugado() * 3.00;
            case DVD.INFANTIL -> {
                valor += 1.5;
                if (aluguel.getDiasAlugado() > 3) {
                    valor += (aluguel.getDiasAlugado() - 3) * 1.5;
                }
            }
        }

        return valor;
    }

    private int pontosDeAlugadorFrequente(Aluguel aluguel) {
        int paf = 1;

        if (
            aluguel.getDVD().getCodigoDePreco() == DVD.LANCAMENTO &&
            aluguel.getDiasAlugado() > 1
        )
            paf++;

        return paf;
    }

    private String extratoAluguel(Aluguel aluguel) {
        final String fimDeLinha = System.getProperty("line.separator");

        return "\t" + aluguel.getDVD().getTitulo() + "\t R$ " + this.valorDeAluguel(aluguel) + fimDeLinha;
    }

    private String extratoTotal(double valorTotal, int pontosDeAlugadorFrequente) {
        final String fimDeLinha = System.getProperty("line.separator");

        return "Valor total pago: R$ " + valorTotal + fimDeLinha +
                " Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
    }
}