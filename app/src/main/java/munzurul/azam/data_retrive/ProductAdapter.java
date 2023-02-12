package munzurul.azam.data_retrive;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.userHolder> {
    MainActivity mainActivity;
    List<productList> productLists;
    public ProductAdapter(MainActivity mainActivity, List<productList> productLists) {
        this.mainActivity = mainActivity;
        this.productLists = productLists;
    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(mainActivity).inflate(R.layout.listrow,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull userHolder holder, int position) {
        holder.textView1.setText(String.valueOf(productLists.get(position).getCategoryName()));
        holder.textView2.setText(String.valueOf(productLists.get(position).getUnitName()));
        holder.textView3.setText(String.valueOf(productLists.get(position).getName()));
        holder.textView4.setText(String.valueOf(productLists.get(position).getId()));
        holder.textView5.setText(String.valueOf(productLists.get(position).getCode()));
        holder.textView6.setText(String.valueOf(productLists.get(position).getParentCode()));
        holder.textView7.setText(String.valueOf(productLists.get(position).getProductBarcode()));
        holder.textView8.setText(String.valueOf(productLists.get(position).getDescription()));
        holder.textView9.setText(String.valueOf(productLists.get(position).getBrandName()));
        holder.textView10.setText(String.valueOf(productLists.get(position).getSizeName()));
        holder.textView11.setText(String.valueOf(productLists.get(position).getColorName()));
        holder.textView12.setText(String.valueOf(productLists.get(position).getModelName()));
        holder.textView13.setText(String.valueOf(productLists.get(position).getVariantName()));
        holder.textView14.setText(String.valueOf(productLists.get(position).getOldPrice()));
        holder.textView15.setText(String.valueOf(productLists.get(position).getPrice()));
        holder.textView16.setText(String.valueOf(productLists.get(position).getCostPrice()));
        holder.textView17.setText(String.valueOf(productLists.get(position).getStock()));
        holder.textView18.setText(String.valueOf(productLists.get(position).getTotalPurchase()));
        holder.textView19.setText(String.valueOf(productLists.get(position).getLastPurchaseDate()));
        holder.textView20.setText(String.valueOf(productLists.get(position).getLastPurchaseSupplier()));
        holder.textView21.setText(String.valueOf(productLists.get(position).getTotalSales()));
        holder.textView22.setText(String.valueOf(productLists.get(position).getLastSalesDate()));
        holder.textView23.setText(String.valueOf(productLists.get(position).getLastSalesCustomer()));
        holder.textView24.setText(String.valueOf(productLists.get(position).getImagePath()));
        holder.textView25.setText(String.valueOf(productLists.get(position).getType()));
        holder.textView26.setText(String.valueOf(productLists.get(position).getStatus()));
    }

    @Override
    public int getItemCount() {
        return productLists.size();
    }
    class userHolder extends RecyclerView.ViewHolder{
        TextView textView1, textView2, textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView25,textView26;
        public userHolder(View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.categoryNametxtview);
            textView2 = itemView.findViewById(R.id.unitName_text_view);
            textView3 = itemView.findViewById(R.id.name_text_view);
            textView4 = itemView.findViewById(R.id.id_text_view);
            textView5 = itemView.findViewById(R.id.code_txt_view);
            textView6 = itemView.findViewById(R.id.parentcode_txt_view);
            textView7 = itemView.findViewById(R.id.productbercode_txt_view);
            textView8 = itemView.findViewById(R.id.description_txt_view);
            textView9 = itemView.findViewById(R.id.brand_txt_name);
            textView10 = itemView.findViewById(R.id.size_txt_name);
            textView11 = itemView.findViewById(R.id.colorname_txt_view);
            textView12 = itemView.findViewById(R.id.modelname_txt_view);
            textView13 = itemView.findViewById(R.id.varientname_txt_view);
            textView14 = itemView.findViewById(R.id.old_price_txt_view);
            textView15 = itemView.findViewById(R.id.price_txt_view);
            textView16 = itemView.findViewById(R.id.costprice_txt_view);
            textView17 = itemView.findViewById(R.id.stock_txt_view);
            textView18 = itemView.findViewById(R.id.totalparchase_txt_view);
            textView19 = itemView.findViewById(R.id.lastpurchase_txt_view);
            textView20 = itemView.findViewById(R.id.lastperchasesupplier_txt_view);
            textView21 = itemView.findViewById(R.id.totalsales_txt_view);
            textView22 = itemView.findViewById(R.id.lastsaledate_txt_view);
            textView23 = itemView.findViewById(R.id.lastsalescustomar_txt_view);
            textView24 = itemView.findViewById(R.id.imagepath_txt_view);
            textView25 = itemView.findViewById(R.id.type_txt_view);
            textView26 = itemView.findViewById(R.id.status_txt_view);
        }

    }
}
