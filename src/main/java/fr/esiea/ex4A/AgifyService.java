package fr.esiea.ex4A;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface AgifyService {

    @GET("/?name={userName}&country_id={userCountry}")
    Call<Integer> getAge(@Path("userName") String userName, @Path("userCountry") String userCountry);
    
}

