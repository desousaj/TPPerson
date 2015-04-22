/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persons;

import org.junit.Before;
import people.SimplePerson;

/**
 *
 * @author p1305728
 */
public class TestSimplePerson extends TestPerson {
    
    @Before
    public void setUp() {
        super.p =  new SimplePerson("Michel", "Barruque", 2000, 1, 1);       
    }
}
