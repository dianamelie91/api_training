package fr.esiea.ex4A;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    static final List<UserInfo> users = List.of(
        new UserInfo("Pauline", "pauline@email.com", "twitterDePauline", "France", "F", "M", 21),
        new UserInfo("Valentin", "valentin@email.com", "twitterDeValentin", "France", "M", "F", 22),
        new UserInfo("Zoé", "zoe@email.com", "twitterDeZoe", "France", "F", "F", 21),
        new UserInfo("Quentin", "quentin@email.com", "twitterDeQuentin", "France", "M", "M", 22)
    );


    public static List<Matches> getUserMatches(String userName) {

        List<Matches> matches = new ArrayList<Matches>();

        for ( UserInfo userInfo : users){
            matches.add(new Matches(userInfo.userName, userInfo.userTwitter));
        }

        return matches;
    }



}
