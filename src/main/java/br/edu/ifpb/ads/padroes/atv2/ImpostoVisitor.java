package br.edu.ifpb.ads.padroes.atv2;

public class ImpostoVisitor implements Visitor {

    @Override
    public void visitProdutoFisico(ProdutoFisico produto) {

        double imposto = produto.getValor() * 0.10;

        System.out.println(
                "Imposto do produto "
                        + produto.getNome()
                        + ": R$ "
                        + imposto
        );

    }

    @Override
    public void visitServico(Servico servico) {

        double imposto = servico.getValor() * 0.15;

        System.out.println(
                "Imposto do serviço: R$ "
                        + imposto
        );

    }

}