package pratocheio;

import java.util.Objects;

public abstract class Prato {
	private Personalizacao personalizacao;
	private double precoBase;

	public Prato(double precoBase, String personalizacao) {
		Personalizacao.validaPersonalizacao(personalizacao);
		this.personalizacao = Personalizacao.valueOf(personalizacao.toUpperCase());
		this.precoBase = precoBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(personalizacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		return personalizacao == other.personalizacao;
	}
	
	public void mudarPersonalizacao(String novaPersonalizacao) {
		Personalizacao.validaPersonalizacao(novaPersonalizacao);
		this.personalizacao = Personalizacao.valueOf(novaPersonalizacao.toUpperCase());
	}

	@Override
	public String toString() {
		return "personalizacao: " + personalizacao + ", precoBase: " + precoBase;
	}
	
	public double calculaPreco() {
		return this.precoBase + calculaArea() * 0.01; 
	}
	
	public abstract double calculaArea();

	public Personalizacao getPersonalizacao() {
		return this.personalizacao;
	}
}
