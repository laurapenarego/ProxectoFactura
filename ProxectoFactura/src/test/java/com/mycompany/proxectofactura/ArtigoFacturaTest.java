
package com.mycompany.proxectofactura;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Pena
 */
public class ArtigoFacturaTest {
    
    public ArtigoFacturaTest() {
    }
   
   
    /**
     * Test of obterPrezoTotal method, of class ArtigoFactura.
     */
    @Test
    public void testObterPrezoTotal() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura instance = new ArtigoFactura ("Mp14","Rato inarámico", 20,10);
        double expResult = 200.0;
        double result = instance.obterPrezoTotal();
        assertEquals(expResult, result, 0.0);
     
    }
    
}
