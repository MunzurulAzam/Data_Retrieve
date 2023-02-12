package munzurul.azam.data_retrive;



import static munzurul.azam.data_retrive.MainActivity.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static RetrofitInstance  instance;
    Apiinterface apiinterface;

    OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request newRequest  = chain.request().newBuilder()
                    .addHeader("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiI3OCIsIkN1cnJlbnRDb21JZCI6IjEiLCJuYmYiOjE2NzU4MzM1NzcsImV4cCI6MTY3NjQzODM3NywiaWF0IjoxNjc1ODMzNTc3fQ.tljt_6FQbmHVF84BQsReAPhinRTl1tqR3YE1vc8O-DQ")
                    .build();
            return chain.proceed(newRequest);
        }
    }).build();
    RetrofitInstance(){
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiinterface = retrofit.create(Apiinterface.class);

    }

    public static RetrofitInstance getInstance(){
        if (instance==null){
            instance = new RetrofitInstance();
        }
        return instance;
    }
}
