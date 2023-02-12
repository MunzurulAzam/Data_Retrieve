package munzurul.azam.data_retrive;

import java.util.ArrayList;

public class ResponseModel {

    int Success;
    boolean error;
    ArrayList<productList> ProductList;



    public ResponseModel(int success, boolean error, ArrayList<productList> productList) {
        Success = success;
        this.error = error;
        ProductList = productList;
    }
}
