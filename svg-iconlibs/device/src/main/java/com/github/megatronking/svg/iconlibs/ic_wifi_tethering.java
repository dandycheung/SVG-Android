package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_wifi_tethering extends SVGRenderer {

    public ic_wifi_tethering(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 11.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 1.1000004f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rCubicTo(1.1000004f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.1000004f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 11.0f);
        mPath.rMoveTo(6.0f, 2.0f);
        mPath.rCubicTo(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        mPath.rCubicTo(-3.3099995f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        mPath.rCubicTo(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        mPath.rLineTo(1.0f, -1.74f);
        mPath.rCubicTo(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        mPath.rCubicTo(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        mPath.rCubicTo(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        mPath.rCubicTo(0.0f, 1.48f, -0.81f, 2.75f, -2.0f, 3.45f);
        mPath.rLineTo(1.0f, 1.74f);
        mPath.rCubicTo(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f);
        mPath.close();
        mPath.moveTo(18.0f, 13.0f);
        mPath.moveTo(12.0f, 3.0f);
        mPath.cubicTo(6.48f, 3.0f, 2.0f, 7.48f, 2.0f, 13.0f);
        mPath.rCubicTo(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        mPath.rLineTo(1.0f, -1.73f);
        mPath.cubicTo(5.61f, 18.53f, 4.0f, 15.96f, 4.0f, 13.0f);
        mPath.rCubicTo(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        mPath.rCubicTo(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        mPath.rCubicTo(0.0f, 2.96f, -1.61f, 5.53f, -4.0f, 6.92f);
        mPath.rLineTo(1.0f, 1.73f);
        mPath.rCubicTo(2.99f, -1.73f, 5.0f, -4.95f, 5.0f, -8.65f);
        mPath.rCubicTo(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        mPath.close();
        mPath.moveTo(12.0f, 3.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}