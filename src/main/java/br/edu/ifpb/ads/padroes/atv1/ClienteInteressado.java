package br.edu.ifpb.ads.padroes.atv1;

public class ClienteInteressado implements Interessado {

    private String nome;
    private String interesse;
    private CanalNotificacao canal;

    public ClienteInteressado(
            String nome,
            String interesse,
            CanalNotificacao canal
    ) {

        this.nome = nome;
        this.interesse = interesse;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {

        canal.enviar(
                "Novo disco encontrado: " + disco.getTitulo(),
                nome
        );
    }

    @Override
    public boolean possuiInteresse(Disco disco) {

        return disco.getTitulo().equalsIgnoreCase(interesse)
                || disco.getArtista().equalsIgnoreCase(interesse)
                || disco.getGenero().equalsIgnoreCase(interesse);
    }
}