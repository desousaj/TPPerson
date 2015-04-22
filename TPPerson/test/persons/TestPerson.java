/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persons;

import java.time.Instant;
import static java.time.Instant.now;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import people.EfficientPerson;

/**
 *
 * @author p1305728
 */
public class TestPerson {
    
    IPerson p;
    
    public TestPerson(){
        p =  new Person("Michel", "Barruque", 1999, 1, 1);  
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

        
    }
    
    @After
    public void tearDown() {
    }


     @Test(expected = IllegalArgumentException.class)
     public void testGetAge() {   
        GregorianCalendar date = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        
        this.p = new Person("Michel", "Barruque", 2300, 1, 1);
        assertEquals(p.getAge(date), 1);
        this.p = new Person("Michel", "Barruque", 2300, 1, 1);
        assertNull(p.getAge(date));
        this.p = new Person("Michel", "Barruque", 2012, 31, 2);
        assertNull(p.getAge(date));
        this.p = new Person("Michel", "Barruque", 2000, 1, 1); 
        assertEquals(p.getAge(date), 0);    
    }
     
     @Test(expected = java.lang.IllegalArgumentException.class)
     public void testWasBorn() {
        GregorianCalendar currentDate = (GregorianCalendar) Calendar.getInstance();
         
        //Test personne 1 ans
        this.p = new Person("Michel", "Barruque", 1999, 1, 1);  
        assertTrue(p.wasBorn(currentDate));
        //Test personne pas née
        this.p = new Person("Michel", "Barruque", 2300, 1, 1);
        assertFalse(p.wasBorn(currentDate));

        //Test personne née sur une date inexistante
        this.p = new Person("Michel", "Barruque", 2012, 31, 2);
        assertFalse(p.wasBorn(currentDate));

        //Test personne -1ans
        IPerson p3 = new Person("Michel", "Barruque" , 1999, 3, 1);
        assertFalse(p.wasBorn(currentDate));
        
        //Test personne est le même jour
        this.p = new Person("Michel", "Barruque", 2000, 1, 1);        
        assertTrue(p.wasBorn(currentDate)); 
     }
}
