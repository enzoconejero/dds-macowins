package solucion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

    Prenda saco_nuevo;
    Prenda camisa_liquidacion;
    Prenda pantalon_promo_50;

    @Before
    public void inicializar() {
        saco_nuevo = new Prenda(200, ETipo.SACO, new Nueva());
        camisa_liquidacion = new Prenda( 300, ETipo.CAMISA, new Liquidacion());
        pantalon_promo_50 = new Prenda(400, ETipo.PANTALON, new Promocion(50));
    }

    @Test
    public void precioVentaSacoNuevoEs200() {
        Assert.assertEquals(saco_nuevo.precioVenta(), 200, 0);
    }

    @Test
    public void precioVentaCamisaLiquidacionEs150() {
        Assert.assertEquals(camisa_liquidacion.precioVenta(), 150, 0);
    }

    @Test
    public void precioVentaPantalonPromo50ES350() {
        Assert.assertEquals(pantalon_promo_50.precioVenta(), 350, 0);
    }

}