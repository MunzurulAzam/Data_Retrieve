package munzurul.azam.data_retrive;

import static androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static String api = "https://pqstec.com/invoiceapps/Values/";
    List<productList>productLists;
    RecyclerView rec;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(this.getResources().getColor(R.color.white));

        txt1 = findViewById(R.id.successCode);
        txt2 = findViewById(R.id.errorCode);


        rec = findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));

        RetrofitInstance.getInstance().apiinterface.getUser().enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel>response) {

                txt1.setText(String.valueOf(response.body().Success));
                txt2.setText(String.valueOf(response.body().error));
                 productLists= response.body().ProductList;
////
//                for (int i = 0 ;i<productLists.size();i++){
//                    Log.e("api","onSuccess:"+productLists.get(i).Id);
//                    Log.e("api","onSuccess:"+productLists.get(i).CategoryName);
//                    Log.e("api","onSuccess:"+productLists.get(i).UnitName);
//                    Log.e("api","onSuccess:"+productLists.get(i).Name);
//                    Log.e("api","onSuccess:"+productLists.get(i).Code);
//                    Log.e("api","onSuccess:"+productLists.get(i).ParentCode);
//                }
                rec.setAdapter(new ProductAdapter(MainActivity.this,productLists));
                System.out.println(response.body().Success);
                System.out.println(response.body().error);
                System.out.println(response.body().ProductList.toString());
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Log.e("api","onFailure" +t.getLocalizedMessage());
            }
        });

    }
}