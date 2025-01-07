package dominio;

import java.time.LocalDateTime;

public class Mentoria {

    private String tema;
    private LocalDateTime dataDaRealizacao;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDateTime getDataDaRealizacao() {
        return dataDaRealizacao;
    }

    public void setDataDaRealizacao(LocalDateTime dataDaRealizacao) {
        this.dataDaRealizacao = dataDaRealizacao;
    }
}
