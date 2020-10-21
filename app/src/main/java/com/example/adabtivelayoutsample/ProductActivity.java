package com.example.adabtivelayoutsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        RecyclerView PrecyclerView=findViewById(R.id.product_recycler);

        PrecyclerView.setAdapter(new ProductAdapter(products));








    }
    Product[]products={
            new Product("HP Pavillion", "HP Laptop"),
            new Product("MacBook Pro 12`", "Apple notebook"),
            new Product("Microsoft Mouse", "Wireless mouse from Microsoft"),
            new Product("Magic Mouse", "Apple magic mouse"),
            new Product("HP Pavillion", "HP Laptop"),
            new Product("MacBook Pro 12`", "Apple notebook"),
            new Product("Microsoft Mouse", "Wireless mouse from Microsoft"),
            new Product("Magic Mouse", "Apple magic mouse"),
            new Product("HP Pavillion", "HP Laptop"),
            new Product("MacBook Pro 12`", "Apple notebook"),
            new Product("Microsoft Mouse", "Wireless mouse from Microsoft"),
            new Product("Magic Mouse", "Apple magic mouse"),
            new Product("HP Pavillion", "HP Laptop"),
            new Product("MacBook Pro 12`", "Apple notebook"),
            new Product("Microsoft Mouse", "Wireless mouse from Microsoft"),
            new Product("Magic Mouse", "Apple magic mouse"),



    };

}
