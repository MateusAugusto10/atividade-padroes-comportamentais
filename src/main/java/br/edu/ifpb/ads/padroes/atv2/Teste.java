package br.edu.ifpb.ads.padroes.atv2;

public class Teste {
    public static void main(String[] args) {

        Item produto =
                new ProdutoFisico(
                        "Notebook",
                        5000
                );

        Item servico =
                new Servico(
                        "Consultoria",
                        2000
                );

        Visitor impostoVisitor =
                new RelatorioImpostoVisitor();

        Visitor impressaoVisitor =
                new ImpressaoVisitor();

        produto.aceitar(impostoVisitor);
        servico.aceitar(impostoVisitor);

        produto.aceitar(impressaoVisitor);
        servico.aceitar(impressaoVisitor);
    }
}

