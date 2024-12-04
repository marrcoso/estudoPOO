package ContaCorrenteEspecial;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repositorio {
	private List<ContaCorrente> contas = new ArrayList<>();
	
	public void salvar(ContaCorrente conta) {
		contas.add(conta);
	}
	 
	public Optional<ContaCorrente> buscarPorNumero(String numero) {
		return contas.stream().filter(c -> c.getNumero() == numero).findFirst();
	}
}
