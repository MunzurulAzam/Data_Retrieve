package munzurul.azam.data_retrive;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiinterface {
    @GET("GetProductList")
    Call<ResponseModel> getUser();

}
