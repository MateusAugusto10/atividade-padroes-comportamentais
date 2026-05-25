package br.edu.ifpb.ads.padroes.atv2;

public class RelatorioImpostoVisitor implements Visitor {

    @Override
    public void visitar(ProdutoFisico produto) {

        double imposto = produto.getValor() * 0.10;

        System.out.println(
                "Produto: "
                        + produto.getNome()
                        + " | Imposto: "
                        + imposto
        );
    }

    @Override
    public void visitar(Servico servico) {

        double imposto = servico.getValor() * 0.15;

        System.out.println(
                "Servico: "
                        + servico.getDescricao()
                        + " | Imposto: "
                        + imposto
        );
    }
}