package dominio;

public abstract class Conteudo {

    protected static final int XP_PADRAO = 10;

    protected double velocidadeDoConteudo;

    protected int pontuacao;

    public abstract void lerConteudo();

    public abstract int pegarPontuacao();

    public abstract void controlarVelocidade();

}
