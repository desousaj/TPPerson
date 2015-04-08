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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String nom = "Barruque";
        String prenom = "Michel";
        GregorianCalendar date = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        GregorianCalendar currentDate = (GregorianCalendar) Calendar.getInstance();
         
        //Test personne 1 ans
        IPerson p = new Person("Michel", "Barruque", 1999, 1, 1);  
        
        //Test personne pas née
        IPerson p1 = new Person(prenom, nom, 2300, 1, 1);
         
        //Test personne née sur une date inexistante
        IPerson p2 = new Person(prenom, nom, 2012, 31, 2);
        
        //Test personne -1ans
        IPerson p3 = new Person(prenom, nom , 1999, 3, 1);
        
        //Test personne est le même jour
        IPerson p4 = new Person(prenom, nom, 2000, 1, 1);
        
    }
    
    @After
    public void tearDown() {
    }


     @Test(expected = IllegalArgumentException.class)
     public void testGetAge() {    
        assertEquals(p.getAge(date), 1);
        assertNull(p1.getAge(date));
        assertNull(p2.getAge(date));
        assertEquals(p3.getAge(date), 0);    
    }
     
     @Test
     public void testWasBorn() {
        assertTrue(p4.wasBorn(currentDate));
        assertFalse(p2.wasBorn(currentDate));
        assertTrue(p3.wasBorn(currentDate));      
     }
}
