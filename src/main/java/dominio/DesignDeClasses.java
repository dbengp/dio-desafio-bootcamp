package dominio;

public class DesignDeClasses extends Conteudo{

    public int pegarPontuacao() {
        return pontuacao;
    }

    private void setPontuacao() {
        pontuacao = 79 + XP_PADRAO;
    }

    public void controlarVelocidade() {
        velocidadeDoConteudo = 1.5;
    }

    public void lerConteudo(){

        controlarVelocidade();

        String leitura = "O Design de Classes é tema fundamental em projetos que seguem o paradigma " +
                "da programação orientada a objetos (POO). Ele define a estrutura e o comportamento dos objetos que " +
                "compõem um sistema, sendo crucial para a organização, reusabilidade, modularidade e manutenibilidade " +
                "do código, tomando como pilares em sua conjuntura a abstração, encapsulamento, herança e polimorfismo. ";

        leitura.lines().forEach(System.out::println);

        setPontuacao();
    }

}
