package locadora.Extrato;

import locadora.Aluguel;
import locadora.Cliente;

import java.util.Iterator;

public abstract class Extrato {
    protected Cliente cliente;
    protected final String fimDeLinha = System.getProperty("line.separator");

    public Extrato(Cliente cliente) {
        this.cliente = cliente;
    }

    public String extrato() {
        StringBuilder extrato = new StringBuilder(this.primeiraLinhaExtrato());

        for (Aluguel aluguel : this.cliente.getAlugueis()) {
            extrato.append(this.linhaAluguelExtrato(aluguel));
        }

        extrato.append(this.linhaValorTotalExtrato());
        extrato.append(this.linhaPontosTotaisDeAlugadorFrequenteExtrato());

        return extrato.toString();
    }

    abstract String primeiraLinhaExtrato();

    abstract String linhaAluguelExtrato(Aluguel aluguel);

    abstract String linhaValorTotalExtrato();

    abstract String linhaPontosTotaisDeAlugadorFrequenteExtrato();

}
