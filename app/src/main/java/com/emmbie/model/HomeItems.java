package com.emmbie.model;

/**
 * MVVM RecyclerView - LiveData
 * Created by Mbuodile Obiosio on Jun 22, 2020
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class HomeItems {

    private String title;
    private String icon;

    public HomeItems(String title, String icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
