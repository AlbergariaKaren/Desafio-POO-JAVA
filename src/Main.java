import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descricao curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKaren = new Dev();
        devKaren.setNome("Karen");
        devKaren.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Karen:" + devKaren.getConteudoInscritos());

        devKaren.progredir();
        devKaren.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Karen:" + devKaren.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Karen:" + devKaren.getConteudosConcluidos());
        System.out.println("XP:" + devKaren.calcularTotalXp());

        System.out.println("-----");


        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Pedro:" + devPedro.getConteudoInscritos());

        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");

        System.out.println("Conteudo Inscritos Pedro:" + devPedro.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());





    }
}