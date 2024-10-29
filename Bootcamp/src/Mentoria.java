
import java.time.LocalDate;

public class Mentoria extends Conteudo { // mentoria é filha de mentoria

    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }

}

// modificadores de acesso: private, public, default e protected
