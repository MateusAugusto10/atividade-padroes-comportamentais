package br.edu.ifpb.ads.padroes.atv2;

public class ImpressaoVisitor implements Visitor {

    @Override
    public void visitar(ProdutoFisico produto) {

        System.out.println(
                "Produto: "
                        + produto.getNome()
                        + " | Valor: "
                        + produto.getValor()
        );
    }

    @Override
    public void visitar(Servico servico) {

        System.out.println(
                "Servico: "
                        + servico.getDescricao()
                        + " | Valor: "
                        + servico.getValor()
        );
    }
}
