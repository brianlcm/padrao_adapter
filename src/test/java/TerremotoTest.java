import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerremotoTest {

    @Test
    void deveRetornarMagnitudeTerremoto() {
        Terremoto terremoto = new Terremoto();
        terremoto.setTerremoto(3.4f);

        assertEquals(3.4f, terremoto.getTerremoto());
    }

    @Test
    void deveRetornarEfeitoTerremoto() {
        Terremoto terremoto = new Terremoto();
        terremoto.setTerremoto(3.5f);

        assertEquals("Ouve-se o barulho do tremor", terremoto.getEfeito());
    }

}