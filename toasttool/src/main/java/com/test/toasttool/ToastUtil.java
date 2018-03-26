package com.test.toasttool;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zdj on 2018/3/26.
 */

public class ToastUtil {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
