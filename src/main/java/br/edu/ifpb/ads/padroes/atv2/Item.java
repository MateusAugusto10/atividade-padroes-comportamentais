package br.edu.ifpb.ads.padroes.atv2;

public interface Item {
    void aceitar(Visitor visitor);
    double getValor();
}
