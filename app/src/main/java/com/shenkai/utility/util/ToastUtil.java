package com.shenkai.utility.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shenkai on 2019/4/28.
 * Describe:
 */
public class ToastUtil {
    private static Toast sToast;

    public static void show(Context context, String text) {
        if (sToast == null) {
            sToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(text);
        }
        sToast.show();
    }
}
