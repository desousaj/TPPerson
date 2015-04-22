/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persons;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author p1305728
 */
public class TestPerson {
    
    protected IPerson p;
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p =  new Person("Michel", "Barruque", 2000, 1, 1);       
    }
    
    @After
    public void tearDown() {
    }

     @Test(expected = IllegalArgumentException.class)
     public void testGetAge() {   
        //Personne pas née
        p.getAge(new GregorianCalendar(1999, GregorianCalendar.JANUARY, 1));    
    }
     
     @Test
     public void testGetAge2() {   
        assertEquals(p.getAge(new GregorianCalendar(2001, GregorianCalendar.JANUARY, 1)), 1);
        assertEquals(p.getAge(new GregorianCalendar(2000, GregorianCalendar.JANUARY, 1)), 0);
    }
     
     @Test
     public void testWasBorn() {    
        //Test personne 1 ans
        assertTrue(p.wasBorn(new GregorianCalendar(2001, GregorianCalendar.JANUARY, 1)));
        //Test personne pas née
        assertFalse(p.wasBorn(new GregorianCalendar(1999, GregorianCalendar.JANUARY, 1)));

        //Test personne -1ans
        assertTrue(p.wasBorn(new GregorianCalendar(2000, GregorianCalendar.APRIL, 1)));
        
        //Test personne est le même jour      
        assertTrue(p.wasBorn(new GregorianCalendar(2000, GregorianCalendar.JANUARY, 1))); 
     }
}
