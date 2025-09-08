package pratocheio;

public enum Personalizacao {
	ESTAMPA, FOTO, PINTURA;
	
	public static void validaPersonalizacao(String personalizacao) {
		for (Personalizacao p : Personalizacao.values()) {
			if (p.toString().equalsIgnoreCase(personalizacao.trim())) {
				return;
			}
		}
		throw new PratoCheioException("Personalização inválida");
	}
}
