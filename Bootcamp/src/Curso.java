
public class Curso {
    // atributos
    private String titulo;
    private String descricao;
    private int cargaHOraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHOraria() {
        return cargaHOraria;
    }

    public void setCargaHOraria(int cargaHOraria) {
        this.cargaHOraria = cargaHOraria;
    }// metodos getter e setter

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHOraria=" + cargaHOraria + "]";
    }// metodo get e set que será utilizado na hora que instancia e chama os objetos

}
