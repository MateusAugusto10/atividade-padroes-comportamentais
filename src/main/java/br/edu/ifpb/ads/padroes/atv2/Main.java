package br.edu.ifpb.ads.padroes.atv2;

public class Main {

    public static void main(String[] args) {

        ProdutoFisico produto =
                new ProdutoFisico(
                        "Notebook",
                        5000
                );

        Servico servico =
                new Servico(
                        "Consultoria",
                        2000
                );

        Visitor impostoVisitor =
                new ImpostoVisitor();

        Visitor impressaoVisitor =
                new ImpressaoVisitor();

        produto.accept(impostoVisitor);
        servico.accept(impostoVisitor);

        produto.accept(impressaoVisitor);
        servico.accept(impressaoVisitor);

    }

}