package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public List<Aluguel> getAlugueis() {
        return this.alugueis;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        this.alugueis.add(aluguel);
    }

    public double getValorTotal() {
        Iterator<Aluguel> alugueis = this.alugueis.iterator();
        double valorTotal = 0;

        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();

            valorTotal += aluguel.getValorDeAluguel();
        }

        return valorTotal;
    }

    public int getPontosTotaisDeAlugadorFrequente() {
        Iterator<Aluguel> alugueis = this.alugueis.iterator();
        int pontosTotaisDeAlugadorFrequente = 0;

        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();

            pontosTotaisDeAlugadorFrequente += aluguel.getPontosDeAlugadorFrequente();
        }

        return pontosTotaisDeAlugadorFrequente;
    }
}
