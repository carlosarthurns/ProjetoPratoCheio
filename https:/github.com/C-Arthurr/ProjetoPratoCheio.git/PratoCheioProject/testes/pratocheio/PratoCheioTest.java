package pratocheio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PratoCheioTest {
	private PratoCheioController pcc;
	
	@BeforeEach
	void preparaTeste() {
		this.pcc = new PratoCheioController();
	}
	
	@Test
	void testCalculaPreco() {
		Prato p = new PratoTriangular(15, "foto", 10, 2);
		assertEquals(15 + (0.01 * 10), p.calculaPreco());
	}
}
