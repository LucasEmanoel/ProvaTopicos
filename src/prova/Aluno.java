package prova;

public class Aluno {

	private String nome;
	private String matricula;
	
	public Aluno() {
		
	}
	public Aluno(String nome, String mat) {
		this.nome = nome;
		this.matricula = mat;
	}
	
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "Aluno [Nome=" + nome + ", Matricula=" + matricula + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null) {
				return false;
			}
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		return true;
	}	
	

	
	

}
