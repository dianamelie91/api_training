package fr.esiea.ex4A;

import fr.esiea.ex4A.UserInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class UserInfoIT {

    @ParameterizedTest
    @CsvSource({
    "michael, michael@esiea.com, mickTwitt66, US, M, F, 95",
    "hector, toto@gmail.com, totoTwit, IS, M, M, 55",
    "nadia, nadou@hotmail.com, hellooooo, FR, F, F, 22",
    "Vanessa, vanou@yahou.com, viii, IS, F, M, 35",
    "Hercules, coucou@olympe.com, eclair, FR, O, O, 18",
    })
    void userinfo_behave_as_expected(String userName, String userEmail, String userTwitter, String userCountry, String userGender,String userWantedGender,  int userAge){
       UserInfo userInfo = new UserInfo(userName, userEmail, userTwitter, userCountry, userGender, userWantedGender, userAge);

          if (userCountry.length()!=2){
               fail("country code is incorrect");
           }
           if (!userGender.equals("M") && !userGender.equals("F")  && !userGender.equals("O") ){
               fail("user gender is incorrect");
           }
           if (!userWantedGender.equals("M") && !userWantedGender.equals("F")  && !userWantedGender.equals("O")){
               fail("user wanted gender is incorrect");
           }
           if( userAge<18 || userAge >100 ) {
                fail("age is incorrect");
           }


    }

}
