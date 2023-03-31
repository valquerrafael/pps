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
        return this.nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        this.dvdsAlugados.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");

        Iterator<Aluguel> alugueis = this.dvdsAlugados.iterator();
        String extrato = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while(alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            extrato += "\t" + aluguel.getAlugavel().getTitulo() + "\t R$ " + aluguel.getValorDeAluguel() + fimDeLinha;
        }

        extrato += "Valor total pago: R$ " + this.getValorTotal() + fimDeLinha +
                    " Voce acumulou " + this.getPontosTotaisDeAlugadorFrequente() +
                    " pontos de alugador frequente";

        return extrato;
    }

    public String extratoHTML() {
        final String fimDeLinha = System.getProperty("line.separator");

        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" + getNome() + "</EM></H1><P>" + fimDeLinha;

        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            resultado += cada.getAlugavel().getTitulo() + ": R$ " +
                    cada.getValorDeAluguel() + "<BR>"+ fimDeLinha;
        }

        resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() +
                "</EM>"+ fimDeLinha + "<P>Voce acumulou <EM>" +
                getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";

        return resultado;
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
