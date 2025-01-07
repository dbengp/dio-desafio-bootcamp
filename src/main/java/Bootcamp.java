import dominio.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Bootcamp {
    public static void main(String[] args){
        System.out.println("Wellcome to the DIO Cursos!");

        Curso javaBancoDoPovo = new Curso();
        javaBancoDoPovo.setTituloDescricao(TituloDescricao.JAVA_SPRING);
        javaBancoDoPovo.setCargaHoraria(Duration.ofHours(60));
        javaBancoDoPovo.setDataDeInicio(LocalDateTime.now());

        System.out.println(javaBancoDoPovo.getTituloDescricao().getDescricao());

        Conteudo javaPOO = new DesignDeClasses();
        Conteudo javaEstruturaDeDados = new EstruturaDeDados();
        Conteudo javaSolid = new PrincipiosSolid();
        javaBancoDoPovo.setTrilha(List.of(javaPOO, javaEstruturaDeDados, javaSolid));

        Mentoria mentoriaOpenfinance = new Mentoria();
        mentoriaOpenfinance.setTema("Java no mundo financeiro - openfinance no banco do povo");
        mentoriaOpenfinance.setDataDaRealizacao(LocalDateTime.now().plusDays(5));

        Mentoria mentoriaCleanCode = new Mentoria();
        mentoriaCleanCode.setTema("Java com Clean Code - como a boa escrita do código ajuda nas transações do banco do povo");
        mentoriaCleanCode.setDataDaRealizacao(LocalDateTime.now().plusDays(10));

        javaBancoDoPovo.setMentorias(List.of(mentoriaOpenfinance, mentoriaCleanCode));

        javaBancoDoPovo.getTrilha().forEach(c -> c.lerConteudo());

        System.out.println("Parabéns, por escolher o curso de: " + javaBancoDoPovo.getTituloDescricao().getTitulo() +
                " sua pontuação até o momento é de: " + javaBancoDoPovo.calcularXp());
    }
}