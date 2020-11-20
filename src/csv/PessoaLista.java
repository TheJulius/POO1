package csv;

import java.util.List;
import java.util.ArrayList;

public class PessoaLista {
	
	protected List<Pessoa> pessoas = new ArrayList<Pessoa>();
	protected Pessoa pessoa;
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	
	public void incluir() {
		
		for(Pessoa pessoa : pessoas) {
			pessoas.add(pessoa);
		}
		
	}
	
	public void excluir() {
		
		for(Pessoa pessoa : pessoas) {
			pessoas.remove(pessoa);
			
		}
				
	}
	
	public void alterar() {
		
		for(Pessoa pessoa : pessoas) {
			
		}
		
	}
	
	public void consultaPorNome() {
		
		for (Pessoa pessoa : pessoas) {
			pessoas.equals(pessoa.getNome());
		}
		
	}
	
	public void consultaPorDominio() {
		
		for (Pessoa pessoa : pessoas) {
			pessoas.equals(pessoa.getEmail());		}
		
	}
	
	public void aniversario() {
		
		for (Pessoa pessoa : pessoas) {
			pessoa.equals(pessoa.getDataNascimento());
		}
		
	}
	
}
