
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

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria1);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("Conteudos inscritos " + devEduardo.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularXp());

        System.out.println("--------------------------------");

        Dev devDudu = new Dev();
        devDudu.setNome("Dudu");
        devDudu.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devDudu.getConteudosInscritos());
        devDudu.progredir();
        devDudu.progredir();
        devDudu.progredir();
        devDudu.progredir();
        System.out.println("Conteudos inscritos " + devDudu.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devDudu.getConteudosConcluidos());
        System.out.println("XP:" + devDudu.calcularXp());

    }
}
