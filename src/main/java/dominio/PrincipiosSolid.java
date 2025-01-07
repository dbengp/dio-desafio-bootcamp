package dominio;

public class PrincipiosSolid extends Conteudo{

    public int pegarPontuacao() {
        return pontuacao;
    }

    private void setPontuacao() {
        pontuacao = 73 + XP_PADRAO;
    }

    public void controlarVelocidade() {
        velocidadeDoConteudo = 1.25;
    }

    public void lerConteudo(){

        controlarVelocidade();

        String leitura = "Os princípios SOLID são um conjunto de diretrizes que visam guiar o desenvolvimento de software orientado a objetos " +
                "promovendo a criação de sistemas mais flexíveis, manuteníveis e extensíveis. Ao seguir esses princípios, " +
                "os desenvolvedores podem construir códigos mais robustos e fáceis de entender, o que se traduz em menor tempo e custo " +
                "de desenvolvimento e manutenção, forncendo ao código principalmente: coesão, acoplamento, extensibilidade, manutenibilidade, reusabilidade. ";

        leitura.lines().forEach(System.out::println);

        setPontuacao();
    }

}