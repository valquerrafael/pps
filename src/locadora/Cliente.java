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

        Iterator<Aluguel> alugueis = this.dvdsAlugados.iterator();
        String extrato = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while(alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();

            extrato += this.extratoAluguel(aluguel);
        }

        extrato += this.extratoTotal(this.getValorTotal(), this.getPontosTotaisDeAlugadorFrequente());

        return extrato;
    }

    private String extratoAluguel(Aluguel aluguel) {
        final String fimDeLinha = System.getProperty("line.separator");

        return "\t" + aluguel.getDVD().getTitulo() + "\t R$ " + aluguel.getValorDeAluguel() + fimDeLinha;
    }

    private String extratoTotal(double valorTotal, int pontosDeAlugadorFrequente) {
        final String fimDeLinha = System.getProperty("line.separator");

        return "Valor total pago: R$ " + valorTotal + fimDeLinha +
                " Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
    }

    private double getValorTotal() {
        Iterator<Aluguel> alugueis = this.dvdsAlugados.iterator();
        double valorTotal = 0;

        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();

            valorTotal += aluguel.getValorDeAluguel();
        }

        return valorTotal;
    }

    private int getPontosTotaisDeAlugadorFrequente() {
        Iterator<Aluguel> alugueis = this.dvdsAlugados.iterator();
        int pontosTotaisDeAlugadorFrequente = 0;

        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();

            pontosTotaisDeAlugadorFrequente += aluguel.getPontosDeAlugadorFrequente();
        }

        return pontosTotaisDeAlugadorFrequente;
    }
}