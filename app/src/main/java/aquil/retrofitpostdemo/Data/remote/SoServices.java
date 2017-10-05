package aquil.retrofitpostdemo.Data.remote;

import aquil.retrofitpostdemo.Data.model.LoginRequest;
import aquil.retrofitpostdemo.Data.model.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by aquil on 10/5/2017.
 */
public interface SoServices {

    @POST("login")
    Call<LoginResponse> sendLogin(@Body LoginRequest loginRequest);

}
