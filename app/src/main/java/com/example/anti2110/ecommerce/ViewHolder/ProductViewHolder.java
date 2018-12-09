package com.example.anti2110.ecommerce.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anti2110.ecommerce.Interface.ItemClickListener;
import com.example.anti2110.ecommerce.R;

public class ProductViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {

    public TextView mProductName, mProductDescription, mProductPrice;
    public ImageView mImageVIew;

    public ItemClickListener listener;

    public void setItemClickListener(ItemClickListener listener) {
        this.listener = listener;
    }

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        mImageVIew = itemView.findViewById(R.id.product_image);
        mProductName = itemView.findViewById(R.id.product_name);
        mProductPrice = itemView.findViewById(R.id.product_price);
        mProductDescription = itemView.findViewById(R.id.product_description);
    }

    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition(), false);
    }
}
