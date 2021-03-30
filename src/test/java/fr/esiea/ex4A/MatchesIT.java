package fr.esiea.ex4A;

import fr.esiea.ex4A.Matches;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.fail;

public class MatchesIT {

    @ParameterizedTest
    @CsvSource({
        " mauricette, ViveLaCampagne",
    })
    void matches_behavior(String name, String twitter){
        Matches matches = new Matches(name, twitter);
        if(matches.name==null ){
            fail("name is empty");
        }
        if(matches.twitter==null){
            fail("twitter is empty");
        }
    }
}
