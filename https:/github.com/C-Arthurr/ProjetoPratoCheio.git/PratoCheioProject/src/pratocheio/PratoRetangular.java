package pratocheio;

public class PratoRetangular extends Prato {
	private double base;
	private double altura;
	
	public PratoRetangular(double precoBase, String personalizacao, double base, double altura) {
		super(precoBase, personalizacao);
		this.altura = altura;
		this.base = base;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculaArea() {
		return this.base * this.altura;
	}
}
