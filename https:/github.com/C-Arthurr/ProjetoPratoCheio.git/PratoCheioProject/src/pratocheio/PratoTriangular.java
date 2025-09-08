package pratocheio;

public class PratoTriangular extends Prato {
	private double base;
	private double altura;
	
	public PratoTriangular(double precoBase, String personalizacao, double base, double altura) {
		super(precoBase, personalizacao);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calculaArea() {
		return (this.base * this.altura)/2;
	}
}
