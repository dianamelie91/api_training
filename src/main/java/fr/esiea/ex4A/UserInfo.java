package fr.esiea.ex4A;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

    public final String userName;
    public final String userEmail;
    public final String userTwitter;
    public final String userCountry;
    public final String userGender;
    public final String userWantedGender;
    public final int userAge;

    public UserInfo(@JsonProperty("userName") String userName, @JsonProperty("userEmail") String userEmail, @JsonProperty("userTweeter") String userTwitter, @JsonProperty("userCountry") String userCountry, @JsonProperty("userSex") String userGender, @JsonProperty("userSexPref") String userWantedGender, int userAge){

        this.userName = userName;
        this.userEmail = userEmail;
        this.userTwitter= userTwitter;
        this.userCountry = userCountry;
        this.userGender= userGender;
        this.userWantedGender = userWantedGender;
        this.userAge = userAge;
    }
}
