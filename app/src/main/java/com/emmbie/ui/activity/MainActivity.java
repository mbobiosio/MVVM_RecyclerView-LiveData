package com.emmbie.ui.activity;

import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.emmbie.R;
import com.emmbie.model.HomeItems;
import com.emmbie.ui.adapter.HomeAdapter;
import com.emmbie.ui.base.BaseActivity;
import com.emmbie.view.HomeViewModel;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.menu)
    RecyclerView mMenuList;

    HomeAdapter mHomeAdapter;
    HomeViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        mViewModel.getLiveData().observe(this, updateList);

    }

    Observer<ArrayList<HomeItems>> updateList = new Observer<ArrayList<HomeItems>>() {
        @Override
        public void onChanged(ArrayList<HomeItems> homeItems) {
            mHomeAdapter = new HomeAdapter(homeItems, MainActivity.this);
            mMenuList.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
            mMenuList.setAdapter(mHomeAdapter);
        }
    };

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }
}