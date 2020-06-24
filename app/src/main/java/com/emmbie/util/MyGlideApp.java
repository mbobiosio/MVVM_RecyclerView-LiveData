package com.emmbie.util;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

/**
 * MVVM RecyclerView - LiveData
 * Created by Mbuodile Obiosio on Jun 22, 2020
 * https://twitter.com/cazewonder
 * Nigeria.
 */
@GlideModule
public class MyGlideApp extends AppGlideModule {

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}