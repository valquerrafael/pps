package locadora.Extrato;

import locadora.Aluguel;
import locadora.Cliente;

public class ExtratoHTML extends Extrato {

    public ExtratoHTML(Cliente cliente) {
        super(cliente);
    }

    @Override
    String primeiraLinhaExtrato() {
        return "<H1>Registro de Alugueis de <EM>" + this.cliente.getNome() + "</EM></H1><P>" + this.fimDeLinha;
    }

    @Override
    String linhaAluguelExtrato(Aluguel aluguel) {
        return aluguel.getAlugavel().getTitulo() + ": R$ " + aluguel.getValorDeAluguel() + "<BR>"+ this.fimDeLinha;
    }

    @Override
    String linhaValorTotalExtrato() {
        return "<P>Valor total pago: <EM>R$ " + this.cliente.getValorTotal() + "</EM>"+ this.fimDeLinha;
    }

    @Override
    String linhaPontosTotaisDeAlugadorFrequenteExtrato() {
        return "<P>Voce acumulou <EM>" + this.cliente.getPontosTotaisDeAlugadorFrequente() + " pontos</EM> de alugador frequente";
    }

}
