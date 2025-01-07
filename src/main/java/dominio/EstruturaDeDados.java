package dominio;

public class EstruturaDeDados extends Conteudo {

    public int pegarPontuacao() {
        return pontuacao;
    }

    private void setPontuacao() {
        pontuacao = 75 + XP_PADRAO;
    }

    public void controlarVelocidade() {
        velocidadeDoConteudo = 1.0;
    }

    public void lerConteudo(){

        controlarVelocidade();

        String leitura = "As estruturas de dados são fundamentais em qualquer projeto de programação. " +
                "Elas servem como a base para organizar e armazenar os dados que serão manipulados pelos objetos. " +
                "Uma escolha adequada pode significar a diferença entre um código eficiente e um código lento e difícil de manter. " +
                "As principais estruturas são: arrays, listas ligadas, pilhas, filas, árvores e grafos. ";

        leitura.lines().forEach(System.out::println);

        setPontuacao();
    }

}