package teste;

import modelo.entidades.String;
import persistencia.TurmaDao;

public class TesteAdicionar {
    public static void main(String args[]){
        // pronto para gravar
        String turma = new String();
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
