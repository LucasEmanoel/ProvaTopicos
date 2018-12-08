import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

import prova.Aluno;
import prova.Principal;

public class testeAluno {
	
	List<Aluno> alunos = null;
	Aluno a = null;
	
	@Before
	public void incializa() {
		a = new Aluno("lucas", "123");
		alunos = new ArrayList();
	}

	@Test
	public void testeCadastro() {		
		Principal.cadastroCliente(alunos, a);
		
		assertEquals(a, alunos.get(0));
	}
	@Test
	public void testeCadastro2Iguais() {
		Aluno e = new Aluno("dsadas", "123");
		
		boolean aluno1 = Principal.cadastroCliente(alunos, a);
		boolean aluno2 = Principal.cadastroCliente(alunos, e);
		
		assertTrue(aluno1);
		assertFalse(aluno2);
	}
	
	@Test
	public void testeRemover() {
		Principal.cadastroCliente(alunos, a);
		
		boolean remove1 = Principal.RemoverAluno(alunos, a.getMatricula());
		
		assertTrue(remove1);
			
	}
	


}
