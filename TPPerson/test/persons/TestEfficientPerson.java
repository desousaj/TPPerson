/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persons;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import people.EfficientPerson;
import people.Personne;
import people.SimplePerson;

/**
 *
 * @author p1305728
 */
public class TestEfficientPerson extends TestPerson {
    
    @Before
    public void setUp() {
        super.p =  new EfficientPerson("Michel", "Barruque", 12);       
    }
}
