
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new curso();
        curso1.setTitulo(" curso de java ");
        curso1.setDescricao(" descrição do curso ");
        curso1.setCargaHOraria(8);

        Curso curso2 = new curso();
        curso2.setTitulo(" curso de javascript ");
        curso2.setDescricao(" descrição do curso ");
        curso2.setCargaHOraria(16);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria sobre java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);
    }
}
