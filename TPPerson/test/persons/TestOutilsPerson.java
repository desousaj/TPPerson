/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author p1305728
 */
public class TestOutilsPerson {
       protected List<IPerson> persons;
       protected OutilsPerson outil;
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        persons = new ArrayList<>();
        IPerson p =  new Person("Michel", "Barruque", 2000, 1, 1);       
        IPerson p2 =  new Person("Michel", "Barruque", 2020, 2, 2);       
        IPerson p3 =  new Person("Michel", "Barruque", 2030, 1, 1);       
        IPerson p4 =  new Person("Michel", "Barruque", 2050, 1, 1);  
        persons.add(p);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        
        outil = new OutilsPerson();
    }
    
    @After
    public void tearDown() {
    }

     @Test(expected = IllegalArgumentException.class)
     public void testGetPersonIntervalException() {   
        outil.getPersonIntervalleAge(persons, new GregorianCalendar(2030, GregorianCalendar.JANUARY, 1), 50, 30);
    }
     
}
