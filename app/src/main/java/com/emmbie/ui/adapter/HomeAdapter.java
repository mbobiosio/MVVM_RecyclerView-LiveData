package com.emmbie.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.emmbie.R;
import com.emmbie.model.HomeItems;
import com.emmbie.util.ImageUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * MVVM RecyclerView - LiveData
 * Created by Mbuodile Obiosio on Jun 22, 2020
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private static final String TAG = HomeAdapter.class.getSimpleName();

    private static Context mContext;
    private ArrayList<HomeItems> mDataList;

    public HomeAdapter(ArrayList<HomeItems> dataList, Context context) {
        this.mDataList = dataList;
        mContext = context;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        mContext = parent.getContext();
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        HomeItems data = mDataList.get(position);
        holder.set(data);
    }

    @Override
    public int getItemCount() {
        if (mDataList == null) {
            return 0;
        }
        return mDataList.size();
    }

    public static class HomeViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.icon)
        ImageView mIcon;
        @BindView(R.id.title)
        TextView mTitle;

        public HomeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void set(HomeItems data) {
            //UI setting code
            mTitle.setText(data.getTitle());
            ImageUtil.loadGlideImage(mContext, mIcon, data.getIcon());
        }
    }
}