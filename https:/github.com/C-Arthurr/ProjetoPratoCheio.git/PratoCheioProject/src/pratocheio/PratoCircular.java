package pratocheio;

public class PratoCircular extends Prato {
	private double raio;
	
	public PratoCircular(double precoBase, String personalizacao, double raio) {
		super(precoBase, personalizacao);
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}
