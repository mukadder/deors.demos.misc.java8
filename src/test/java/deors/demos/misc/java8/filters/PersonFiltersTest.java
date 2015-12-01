package deors.demos.misc.java8.filters;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonFiltersTest {

    @Test
    public void testPersonFilter() {

        PersonFilters.main(null);

        String expected1 = "Person [first=Jorge, last=Hidalgo, birthDate=1974-10-15, gender=MALE, region=EUROPE, salary=25000]"
            + ",Person [first=Angie, last=López, birthDate=1975-05-12, gender=FEMALE, region=LATAM, salary=24500]"
            + ",Person [first=George, last=Harrison, birthDate=1974-02-04, gender=MALE, region=NA, salary=42000]"
            + ",Person [first=Lionel, last=Ramírez, birthDate=1975-05-15, gender=MALE, region=LATAM, salary=23000]"
            + ",Person [first=Scarlett, last=O'Hara, birthDate=1969-06-02, gender=FEMALE, region=NA, salary=45000]"
            + ",Person [first=Priya, last=Krishnan, birthDate=1972-12-05, gender=FEMALE, region=ASIA, salary=12500]"
            + ",Person [first=Karla, last=Rodríguez, birthDate=1975-04-18, gender=FEMALE, region=LATAM, salary=9000]";
        assertEquals(expected1, PersonFilters.result1);

        String expected2 = "Person [first=Jorge, last=Hidalgo, birthDate=1974-10-15, gender=MALE, region=EUROPE, salary=25000]"
            + ",Person [first=John, last=Smith, birthDate=1980-10-08, gender=MALE, region=UKI, salary=50000]";

        assertEquals(expected2, PersonFilters.result2);

        String expected3 = "Person [first=Lionel, last=Ramírez, birthDate=1975-05-15, gender=MALE, region=LATAM, salary=23000]";

        assertEquals(expected3, PersonFilters.result3.get().toString());
    }
}
