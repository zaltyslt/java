package lt.vtvpmc.municipality;

import org.junit.jupiter.api.Assertions;
import java.time.LocalDate;


public class AppMain {


    public static void main(String[] args) throws IllegalCitizenException {
        MyMunicipality municipality = new MyMunicipality();

        final Person peter = new Person("Peter", "VA", LocalDate.of(1990, 12, 5), 20000.0);
        final Person random = new Person("this.randomString()", "this.randomString()", LocalDate.of(2010, 2, 4), 20000.0);
//        final Person peter1 = new Person("Peter", "VA", LocalDate.of(1990, 12, 5), 25000.0);
        try {
            municipality.registerCitizen(peter);
            municipality.registerCitizen(random);
           // municipality.registerCitizen(peter1);
        }
        catch (IllegalCitizenException e) {
            Assertions.fail("should not fail when registering a legal citizen");
        }
        Assertions.assertTrue(municipality.isRegisteredCitizen(peter), "registered citizen should be reported as citizen in municipality");
        Assertions.assertTrue(municipality.isRegisteredCitizen(random), "registered citizen should be reported as citizen in municipality");
        Assertions.assertTrue(municipality.isRegisteredCitizen(new Person("Peter", "VA", LocalDate.of(1990, 12, 5), 25000.0)),
                "registered citizen should be reported as registered even if his income has changed");

        System.out.println("dd");
    }
}
