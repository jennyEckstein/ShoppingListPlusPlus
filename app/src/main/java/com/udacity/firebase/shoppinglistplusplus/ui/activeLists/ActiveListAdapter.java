package com.udacity.firebase.shoppinglistplusplus.ui.activeLists;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.firebase.client.Query;
import com.firebase.ui.FirebaseListAdapter;
import com.udacity.firebase.shoppinglistplusplus.R;
import com.udacity.firebase.shoppinglistplusplus.model.ShoppingList;

/**
 * Created by Jenny on 6/27/2016.
 */
public class ActiveListAdapter extends FirebaseListAdapter<ShoppingList>{

    private static final String LOG_TAG = ActiveListAdapter.class.getSimpleName();

    public ActiveListAdapter(Activity activity, Class<ShoppingList> modelClass, int modelLayout, Query ref){
        super(activity, modelClass, modelLayout, ref);
        this.mActivity = activity;
    }

    @Override
    protected void populateView(View v, ShoppingList model) {
        TextView textViewListName = (TextView) v.findViewById(R.id.text_view_list_name);
        TextView textViewCreatedByUser = (TextView) v.findViewById(R.id.text_view_created_by_user);
        textViewListName.setText(model.getListName());
        textViewCreatedByUser.setText(model.getOwner());
    }
}

