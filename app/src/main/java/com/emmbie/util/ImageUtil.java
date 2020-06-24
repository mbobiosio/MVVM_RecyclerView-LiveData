package com.emmbie.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.signature.ObjectKey;
import com.emmbie.R;

/**
 * MVVM RecyclerView - LiveData
 * Created by Mbuodile Obiosio on Jun 22, 2020
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class ImageUtil {

    public static boolean checkStringNotEmpty(String string) {
        return (string != null && !string.equals(""));
    }

    public static void loadGlideImage(Context context, ImageView imageView, String url) {
        if (ImageUtil.checkStringNotEmpty(url)) {
            GlideApp.with(context)
                    .load(url)
                    .signature(new ObjectKey(url))
                    .dontAnimate()
                    .error(R.mipmap.ic_launcher_round)
                    .into(imageView);
        }
    }
}
