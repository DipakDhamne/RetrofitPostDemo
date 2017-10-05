package aquil.retrofitpostdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import aquil.retrofitpostdemo.Data.model.LoginRequest;
import aquil.retrofitpostdemo.Data.model.LoginResponse;
import aquil.retrofitpostdemo.Data.remote.ApiUtils;
import aquil.retrofitpostdemo.Data.remote.SoServices;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private EditText etPass, etUser;
    private Button btnLogin;
    private SoServices mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVar();



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginRequest loginRequest = new LoginRequest();
                loginRequest.setEmail(etUser.getText().toString());
                loginRequest.setPassword(etPass.getText().toString());

                mService = ApiUtils.getSoService();

                login(loginRequest);
            }
        });
    }

    public void initVar(){
        etPass= (EditText)findViewById(R.id.etUserPass);
        etUser = (EditText)findViewById(R.id.etUserId);
        btnLogin = (Button)findViewById(R.id.btnClick);
    }

    public void login(LoginRequest loginRequest){

        Call<LoginResponse> loginRep = mService.sendLogin(loginRequest);

        loginRep.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful())
                {
                    String res1 = new Gson().toJson(response.body());
                    System.out.println("Response is : "+res1);
                    LoginResponse res = response.body();
                    Toast.makeText(MainActivity.this,res.getMsg(),Toast.LENGTH_SHORT).show();
                    System.out.println("UseId : "+res.getUserId()+" , useName "+res.getFirstName()+" "+res.getLastName()+" Email "+res.getEmail()+ " outLet Id : "+res.getOutletId());
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });

    }
}
