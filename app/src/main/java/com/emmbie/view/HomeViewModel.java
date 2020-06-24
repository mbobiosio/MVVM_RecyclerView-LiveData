package com.emmbie.view;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.emmbie.model.HomeItems;

import java.util.ArrayList;

/**
 * MVVM RecyclerView - LiveData
 * Created by Mbuodile Obiosio on Jun 22, 2020
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class HomeViewModel extends ViewModel {

    MutableLiveData<ArrayList<HomeItems>> mLiveData;
    ArrayList<HomeItems> mItemsArrayList;

    public HomeViewModel() {
        mLiveData = new MutableLiveData<>();

        init();
    }

    public MutableLiveData<ArrayList<HomeItems>> getLiveData() {
        return mLiveData;
    }

    public void init() {
        populateList();
        mLiveData.setValue(mItemsArrayList);
    }

    public void populateList() {
        mItemsArrayList = new ArrayList<>();
        mItemsArrayList.add(new HomeItems("Sermons", "https://cdn-blogs.tribune.com.pk/2017/09/57702-gsjpg-1506592124-281-640x480.jpg"));
        mItemsArrayList.add(new HomeItems("Daily Verse", "https://cdn-blogs.tribune.com.pk/2017/09/57702-gsjpg-1506592124-281-640x480.jpg"));
        mItemsArrayList.add(new HomeItems("Favorites", "https://cdn-blogs.tribune.com.pk/2017/09/57702-gsjpg-1506592124-281-640x480.jpg"));
        mItemsArrayList.add(new HomeItems("About Us", "https://cdn-blogs.tribune.com.pk/2017/09/57702-gsjpg-1506592124-281-640x480.jpg"));
        mItemsArrayList.add(new HomeItems("Find Us", "https://cdn-blogs.tribune.com.pk/2017/09/57702-gsjpg-1506592124-281-640x480.jpg"));
        mItemsArrayList.add(new HomeItems("Give", "https://cdn-blogs.tribune.com.pk/2017/09/57702-gsjpg-1506592124-281-640x480.jpg"));
    }
}
