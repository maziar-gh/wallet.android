package com.lambda.wallet.util;

import android.content.Context;
import android.util.TypedValue;


public class DensityUtil {
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context  the context
     * @param dipValue the dip value
     * @return the int
     */
    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     *
     * @param context the context
     * @param pxValue the px value
     * @return the int
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * Px 2 sp float.
     *
     * @param context the context
     * @param pxValue the px value
     * @return the float
     */
    public static float px2sp(Context context, float pxValue){
        return (pxValue / context.getResources().getDisplayMetrics().scaledDensity);
    }

    /**
     * Sp 2 px int.
     *
     * @param context the context
     * @param spValue the sp value
     * @return the int
     */
    public static int sp2px(Context context, int spValue){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spValue, context.getResources().getDisplayMetrics());
    }
    /**
     * 获取导航栏高度
     * @param context
     * @return
     */
    public static int getDaoHangHeight(Context context) {
        int result = 0;
        int resourceId=0;
        int rid = context.getResources().getIdentifier("config_showNavigationBar", "bool", "android");
        if (rid!=0){
            resourceId = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            return context.getResources().getDimensionPixelSize(resourceId);
        }else
            return 0;
    }
}
