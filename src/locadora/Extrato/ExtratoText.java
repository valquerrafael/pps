package locadora.Extrato;

import locadora.Aluguel;
import locadora.Cliente;

public class ExtratoText extends Extrato {

    public ExtratoText(Cliente cliente) {
        super(cliente);
    }

    String primeiraLinhaExtrato() {
        return "Registro de Alugueis de " + this.cliente.getNome() + this.fimDeLinha;
    }

    String linhaAluguelExtrato(Aluguel aluguel) {
        return "\t" + aluguel.getAlugavel().getTitulo() + "\t R$ " + aluguel.getValorDeAluguel() + this.fimDeLinha;
    }

    String linhaValorTotalExtrato() {
        return "Valor total pago: R$ " + this.cliente.getValorTotal() + this.fimDeLinha;
    }

    String linhaPontosTotaisDeAlugadorFrequenteExtrato() {
        return "Voce acumulou " + this.cliente.getPontosTotaisDeAlugadorFrequente() + " pontos de alugador frequente";
    }
}
