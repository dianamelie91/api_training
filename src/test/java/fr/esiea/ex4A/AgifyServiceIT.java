package fr.esiea.ex4A;

import fr.esiea.ex4A.AgifyService;
import okhttp3.Request;
import okio.Timeout;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public abstract class AgifyServiceIT implements AgifyService {



    @Test
    void getAge_behave_as_expected() {
        String userName="michel";
        String userCountry = "FR";
        int age;

        //When
        /*AgifyService agifyService = retrofit.create(AgifyService.class);

        Call<Integer> call = AgifyService.getAge(userName, userCountry);
        call.enqueue(this);


        */

        //Then

    }
}
