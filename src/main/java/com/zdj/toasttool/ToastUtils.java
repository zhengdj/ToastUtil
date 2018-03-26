package com.zdj.toasttool;

/**
 * 吐司工具类
 * Created by zdj on 2018/3/26.
 */

import android.content.Context;
import android.widget.Toast;


public class ToastUtils {

    public static void showToast(Context context, String str) {

        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();

    }

}
