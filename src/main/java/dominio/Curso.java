package dominio;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Curso {

    private TituloDescricao tituloDescricao;
    private Duration cargaHoraria;
    private LocalDateTime dataDeInicio;
    private List<Conteudo> trilha;
    private List<Mentoria> mentorias;

    public TituloDescricao getTituloDescricao() {
        return tituloDescricao;
    }

    public void setTituloDescricao(TituloDescricao tituloDescricao) {
        this.tituloDescricao = tituloDescricao;
    }

    public Duration getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Duration cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDateTime getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDateTime dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public List<Conteudo> getTrilha() {
        return trilha;
    }

    public void setTrilha(List<Conteudo> trilha) {
        this.trilha = trilha;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public int calcularXp(){
        int total = 0;
        for(Conteudo conteudo : trilha){
            total += conteudo.pegarPontuacao();
        }
        return total;
    }

}
