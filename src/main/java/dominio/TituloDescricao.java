package dominio;

public enum TituloDescricao {

    JAVA_SPRING("Desenvolvimento de aplicações JAVA para web com Spring Framework e Spring Boot"),
    DOTNET_PLATFORM(".NET Platform para desenvolvimento de aplicações web"),
    PYTHON_DATA_SCIENCE("Python para análise de dados e ciência de dados"),
    JAVA_IA("Desenvolvimento de aplicações de inteligência artificial com Java"),
    DOTNET_IA("Desenvolvimento de aplicações de inteligência artificial com .NET");

    private final String descricao;

    TituloDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    public String getTitulo(){
        return String.valueOf(this);
    }
}
