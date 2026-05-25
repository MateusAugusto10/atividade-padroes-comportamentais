package br.edu.ifpb.ads.padroes.atv2;

public interface Visitor {
    void visitar(ProdutoFisico produto);
    void visitar(Servico servico);
}