package fr.esiea.ex4A;

import fr.esiea.ex4A.Matches;
import fr.esiea.ex4A.UserRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class UserRepositoryIT {

    @ParameterizedTest
    @CsvSource({
        "hectorine",
        "JANINE",
        "Gert rude",

    })
    void behavior_of_getUserMatches(String userName){
        UserRepository userRepository = new UserRepository();
        List<Matches> listMatches = userRepository.getUserMatches(userName);

        for (Matches matches : listMatches){
            if(matches.name==null ){
                fail("name is empty");
            }
            if(matches.twitter==null){
                fail("twitter is empty");
            }
        }


    }
}
