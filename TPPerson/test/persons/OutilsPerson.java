package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import persons.IPerson;
 
public class OutilsPerson {
 
    public List<IPerson> getPersonIntervalleAge(List<IPerson> listePers, GregorianCalendar date, int ageMin, int ageMax) {
        if(ageMax<ageMin){
            throw new IllegalArgumentException();
        }
        
        List<IPerson> listeRes = new ArrayList<>();
        for (IPerson p : listePers) {
            if ((p.getAge(date) >= ageMin) && (p.getAge(date) <= ageMax)) {
                listeRes.add(p);
            }
        }
        return listeRes;
    }
 
    public int getAgePlusVieux(List<IPerson> listePers, GregorianCalendar date) {
        int age = 0;
        for (IPerson p : listePers) {
            if (p.getAge(date) > age) {
                age = p.getAge(date);
            }
        }
        return age;
    }
 
}