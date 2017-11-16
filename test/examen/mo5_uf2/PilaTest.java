package examen.mo5_uf2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Artur
 */
public class PilaTest {

    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    //correcte
    public void testAfegir() {
        System.out.println("Afegir primer element normal");
        int el = 12;
        Pila instance = new Pila();
        int expResult = 12;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    @Test
    //correcte
    public void testAfegir0() {
        System.out.println("Afegir un element amb valor 0");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    @Test
    //correcte
    public void testAfegirNegatiu() {
        System.out.println("Afegir un número negatiu, hauría de retornar 0");
        int el = -10;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    @Test
    //correcte
    public void testAfegir100numeros() {
        System.out.println("Afegir 100 números, sense sortir del rang que especifica");
        int el;
        Pila instance = new Pila();
        int expResult = 100;
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            el = i;
        result = instance.afegir(el);   
        }
        assertEquals(expResult, result);
    }
    @Test
    //correcte
    public void testAfegir1000numeros() {
        System.out.println("Afegir 1000 números, sortint de rang, hauría de retornar 0");
        int el;
        Pila instance = new Pila();
        int expResult = 0;
        int result = 0;
        for (int i = 0; i <= 1000; i++) {
            el = i;
        result = instance.afegir(el);   
        }
        assertEquals(expResult, result);
    }
     @Test
    //correcte
    public void testAfegirNull() {
        System.out.println("Afegir una variable buida, hauría de retornar 0");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = 0;
        result = instance.afegir(el);   
        assertEquals(expResult, result);
    }
    /**
     * Test of treure method, of class Pila.
     */
    @Test
    //correcte
    public void testTreure() {
        System.out.println("Treure un valor normalment");
        Pila instance = new Pila();
        int expResult = 5;
        instance.afegir(5);
        int result = instance.treure();
        assertEquals(expResult, result);
    }
    @Test
    //correcte
    public void testTreureNull() {
        System.out.println("Treure un valor quan no hi han valors a la pila");
        Pila instance = new Pila();
        int expResult = -1;
        int result = instance.treure();
        assertEquals(expResult, result);
    }
    
}
