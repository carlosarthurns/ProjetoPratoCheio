package pratocheio;

import java.util.*;

public class PratoCheioController {
	private Map<Integer, Prato> pratos;
	
	public PratoCheioController() {
		this.pratos = new HashMap<>();
	}
	
	public int criarPratoTriangular(double precoBase, String personalizacao, double base, double altura) {
		Prato novoPrato = new PratoTriangular(precoBase, personalizacao, base, altura);
		int id = formataId();
		pratos.put(id, novoPrato);
		return id;
	}

	public int criarPratoRetangular(double precoBase, String personalizacao, double base, double altura) {
		Prato novoPrato = new PratoRetangular(precoBase, personalizacao, base, altura);
		int id = formataId();
		pratos.put(id, novoPrato);
		return id;
	}
	
	public int criarPratoCircular(double precoBase, String personalizacao, double raio) {
		Prato novoPrato = new PratoCircular(precoBase, personalizacao, raio);
		int id = formataId();
		pratos.put(id, novoPrato);
		return id;
	}
	
	public String listarPratos() {
		StringBuffer out = new StringBuffer();
		for (Prato p : pratos.values()) {
			out.append(p.toString());
		}
		
		return out.toString();
	}
	
	
	public double calcularPrecoPrato(int idPrato) {
		validaPrato(idPrato);
		return getPrato(idPrato).calculaPreco();
	}
	
	public void removerPrato(int idPrato) {
		validaPrato(idPrato);
		this.pratos.remove(idPrato);
	}
	
	public int contaPratos() {
		return this.pratos.size();
	}
	
	public String recuperarPratoComInteresse(Personalizacao p) {
		for (Prato prato : pratos.values()) {
			if (prato.getPersonalizacao().equals(p)) return prato.toString();
		}
		return "Não tem prato com essa personalização";
	}
	
	public double calculaPrecoTotal() {
		double precoTotal = 0;
		for (Prato prato : pratos.values()) {
			precoTotal += prato.calculaPreco();
		}
		return precoTotal;
	}
	
	private void validaPrato(int idPrato) {
		if(getPrato(idPrato) == null) throw new PratoCheioException("Prato não existe.");
	}

	private Prato getPrato(int idPrato) {
		return this.pratos.get(idPrato);
	}
	private int formataId() {
		return pratos.size() + 1;
	}
}
