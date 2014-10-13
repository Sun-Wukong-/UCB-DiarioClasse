package teste;

import modelo.entidades.Turma;
import persistencia.TurmaDao;

public class TesteAdicionar {
    public static void main(String args[]){
        // pronto para gravar
        Turma turma = new Turma();
        turma.setNome("Marcelo");
        turma.setCurso("Sistemas de Informação");
        turma.setDisciplina("Projeto de Software");
        turma.setPeriodo(6);
        turma.setTurno("Manhã");

        // grave nessa conexão!!!
        TurmaDao dao = new TurmaDao();

        // método elegante
        dao.adicionar(turma);

        System.out.println("Gravado!");
    }
    
}
