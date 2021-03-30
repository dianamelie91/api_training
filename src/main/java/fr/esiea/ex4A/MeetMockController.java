package fr.esiea.ex4A;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeetMockController {

    @PostMapping(value="/api/inscription", consumes= MediaType.APPLICATION_JSON_VALUE)
    public void inscription(@RequestBody UserInfo userInfo) throws InterruptedException {
        System.out.println("Name = "+userInfo.userName);
        System.out.println("Email = "+userInfo.userEmail);
        System.out.println("Twitter= "+userInfo.userTwitter);
        System.out.println("Country = "+userInfo.userCountry);
        System.out.println("Gender= "+userInfo.userGender);
        System.out.println("Wanted Gender = "+userInfo.userWantedGender);

    }

    @GetMapping(value="/api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Matches> matches (@RequestParam("userName") String userName, @RequestParam("userCountry") String userCountry) {
       List<Matches> listMatches = UserRepository.getUserMatches(userName);
        for (Matches matches : listMatches){
            System.out.println("Name = "+matches.name);
            System.out.println("Twitter= "+matches.twitter);
        }

        return listMatches;

    }


}
