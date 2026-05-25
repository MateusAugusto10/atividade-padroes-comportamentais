package br.edu.ifpb.ads.padroes.atv1;

public class Teste {

    public static void main(String[] args) {

        RepositorioDiscos repo = new RepositorioDiscos();

        Interessado i1 =
                new ClienteInteressado(
                        "Vanessa",
                        "Pop",
                        new EmailNotificacao()
                );

        Interessado i2 =
                new ClienteInteressado(
                        "Carlos",
                        "Metallica",
                        new SmsNotificacao()
                );

        Interessado i3 =
                new ClienteInteressado(
                        "Ana",
                        "Rock",
                        new PushNotificacao()
                );

        repo.adicionarInteressado(i1);
        repo.adicionarInteressado(i2);
        repo.adicionarInteressado(i3);

        Disco disco =
                new Disco(
                        "Metallica",
                        "Black Album",
                        "Rock",
                        1991
                );

        repo.addDisco(disco);

        repo.addDisco(
                new Disco(
                        "Tate McRae",
                        "Run For The Hills",
                        "Pop",
                        2011
                )
        );
    }
}