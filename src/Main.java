import Desafio.Bootcamp;
import Desafio.Curso;
import Desafio.Dev;
import Desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIgor = new Dev();
        devIgor.setNome("Igor");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Igor:" + devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Igor:" + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Igor:" + devIgor.getConteudosConcluidos());
        System.out.println("XP:" + devIgor.calcularTotalXp());

        System.out.println("-------");

        Dev devJoaoCarlos = new Dev();
        devJoaoCarlos.setNome("Joao");
        devJoaoCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoaoCarlos.getConteudosInscritos());
        devJoaoCarlos.progredir();
        devJoaoCarlos.progredir();
        devJoaoCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João Carlos:" + devJoaoCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João Carlos:" + devJoaoCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devJoaoCarlos.calcularTotalXp());

    }

}