package prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList();
		int op = 0;
		String nome = "";
		String matricula = "";
		
		Aluno aluno = null;
		
		do {
			System.out.println("1 - cadastrar\n"+
								"2 - listar\n" + 
								"3 - deletar\n" +
								"0 - sair");
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Digite o nome do aluno");
				nome = sc.next();
				System.out.println("Digite a matricula do aluno");
				matricula = sc.next();
				
				aluno = new Aluno(nome, matricula);
				cadastroCliente(alunos, aluno);

				break;
			case 2:
				ListarAlunos(alunos);
				break;
			case 3:
				System.out.println("Digite a matricula do Aluno");
				matricula = sc.next();
				
				RemoverAluno(alunos, matricula);
				break;
			default:
			}
		}while(op != 0);
	}
	public static void cadastroCliente(List<Aluno> list, Aluno aluno) {
		if(!(list.contains(aluno.getMatricula()))) 
			list.add(aluno);
			
	}
	public static void ListarAlunos(List<Aluno> list) {
		for(Aluno a : list)
			System.out.println(a.toString());
	}
	public static void RemoverAluno(List<Aluno> list, String mat) {
		for(Aluno a : list) {
			if(a.getMatricula().equals(mat)) {
				list.remove(a);
			}
		}
		
	}

}
