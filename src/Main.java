import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHorario(4);






        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
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


        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("--");
        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXP());


        System.out.println("------------------------------------------------------");

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devJessica.getConteudosConcluidos());
        System.out.println("XP: " + devJessica.calcularTotalXP());







    }
}
