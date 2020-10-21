package com.example.adabtivelayoutsample;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Product[]products;
    public ProductAdapter(Product[]products){
        this.products=products;



    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item,parent,false);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.textName.setText(products[position].getName());
        holder.textDescription.setText(products[position].getDescription());
    }

    @Override
    public int getItemCount() {
        return products.length;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{


        final public TextView textName;
        final  public TextView textDescription;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            textName=itemView.findViewById(R.id.item_name);
            textDescription=itemView.findViewById(R.id.item_description);

        }
    }




}
