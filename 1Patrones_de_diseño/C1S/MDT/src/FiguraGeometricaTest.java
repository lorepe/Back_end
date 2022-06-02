import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraGeometricaTest {
    FiguraGeometrica figuraGeometrica;
    FiguraGeometrica figuraGeometrica1;
    FiguraGeometrica figuraGeometrica2;

    @BeforeEach
    void doBefore() throws Exception {
        figuraGeometrica = new FiguraGeometrica(10.0);
        figuraGeometrica1= new FiguraGeometrica(15.0);
        figuraGeometrica2= new FiguraGeometrica(12.0);
    }

    @Test
    void calcularArea(){
        assertEquals(figuraGeometrica.calcularArea("CIRCULO"), "El área del CIRCULO es 314 unidades");

    }
}
