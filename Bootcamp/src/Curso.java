
public class Curso extends Conteudo {
    // atributos

    private int cargaHOraria;

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
        return "Curso titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHOraria=" + cargaHOraria + "]";
    }// metodo get e set que será utilizado na hora que instancia e chama os objetos

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHOraria;
    }

}
