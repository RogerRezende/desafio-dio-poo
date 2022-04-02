import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Bootcamp bootcamp1 = new Bootcamp();
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do Curso de Python");
        curso2.setCargaHoraria(4);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Bootcamp dos Java Tops");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        dev1.setNome("Roger");
        System.out.println("Conteúdos inscritos " + dev1.getNome() + dev1.getConteudosInscritos());
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos " + dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev1.getNome() + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos " + dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev1.getNome() + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos " + dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev1.getNome() + dev1.getConteudosConcluidos());
        System.out.println("XP do " + dev1.getNome() + ": " + dev1.calcularTotalXp());

        dev2.setNome("Jean");
        System.out.println("Conteúdos inscritos " + dev2.getNome() + dev2.getConteudosInscritos());
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos " + dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev2.getNome() + dev2.getConteudosConcluidos());
        dev2.progredir();
        System.out.println("Conteúdos inscritos " + dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println("XP da " + dev2.getNome() + ": " + dev2.calcularTotalXp());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
    }
}
