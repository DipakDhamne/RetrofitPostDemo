package aquil.retrofitpostdemo.Data.remote;

/**
 * Created by aquil on 10/5/2017.
 */
public class ApiUtils {

    private ApiUtils(){}

    public static final String BASE_URL = "http://52.74.77.52/proptors/jsons/";
    public static SoServices getSoService(){
        return RetrofitClient.getClient(BASE_URL).create(SoServices.class);
    }

}
