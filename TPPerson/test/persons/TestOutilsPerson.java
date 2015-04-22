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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;

/**
 *
 * @author p1305728
 */
public class TestOutilsPerson {
       protected List<IPerson> persons;
       protected OutilsPerson outil;
       
       @Mock 
       private IPerson p1; 
       @Mock 
       private IPerson p2;      
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        persons = new ArrayList<>();        
        p1 = mock(IPerson.class);
        p2 = mock(IPerson.class);
        //On créer un mock de IPersone telle que son age vaut 15.
        Mockito.when(p1.getAge(new GregorianCalendar())).thenReturn(15);
        Mockito.when(p2.getAge(new GregorianCalendar())).thenReturn(5);
        persons.add(p1);
        persons.add(p2);
        
        outil = new OutilsPerson();
    }
    
    @After
    public void tearDown() {
    }

     @Test(expected = IllegalArgumentException.class)
     public void testGetPersonIntervalException() {           
        outil.getPersonIntervalleAge(persons, new GregorianCalendar(2030, GregorianCalendar.JANUARY, 1), 50, 30);
    }
     
     public void testGetPersonInterval(){
        outil.getPersonIntervalleAge(persons, new GregorianCalendar(), 0, 30);
     }
     
     public void testGetAgePlusVieux(){
         assertEquals(outil.getAgePlusVieux(persons, new GregorianCalendar()),15);
     }
     
     public void testAnonyme(){
         //On test que la méthode getName() n'a jamais été appelé sur le mock p1
         Mockito.verify(p1, never()).getName();
         Mockito.verify(p2, never()).getName();
         Mockito.verify(p1, never()).getFirstName();
         Mockito.verify(p2, never()).getFirstName();
     }
     
}
