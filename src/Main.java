import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação dos cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        // Criação da mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        // Criação do bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criação do dev Neia
        Dev devFlorineia = new Dev();
        devFlorineia.setNome("Neia");
        devFlorineia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devFlorineia.getConteudosInscritos());
        devFlorineia.progredir();
        devFlorineia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devFlorineia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devFlorineia.getConteudosConcluidos());
        System.out.println("XP:" + devFlorineia.calcularTotalXp());

        System.out.println("-------");

        // Criação do dev Jefferson
        Dev devJefferson = new Dev();
        devJefferson.setNome("Jefferson");
        devJefferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJefferson.getConteudosInscritos());
        devJefferson.progredir();
        devJefferson.progredir();
        devJefferson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJefferson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJefferson.getConteudosConcluidos());
        System.out.println("XP:" + devJefferson.calcularTotalXp());
    }
}
