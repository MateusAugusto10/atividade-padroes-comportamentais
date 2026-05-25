package br.edu.ifpb.ads.padroes.atv1;

public class PushNotificacao implements CanalNotificacao {

    @Override
    public void enviar(String mensagem, String destinatario) {

        System.out.println(
                "PUSH para "
                        + destinatario
                        + ": "
                        + mensagem
        );
    }
}
