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
public class ic_brightness_2 extends SVGRenderer {

    public ic_brightness_2(Context context) {
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
        
        mPath.moveTo(10.0f, 2.0f);
        mPath.rCubicTo(-1.82f, 0.0f, -3.53f, 0.5f, -5.0f, 1.35f);
        mPath.cubicTo(7.99f, 5.08f, 10.0f, 8.3f, 10.0f, 12.0f);
        mPath.rCubicTo(0.0f, 3.6999998f, -2.01f, 6.92f, -5.0f, 8.65f);
        mPath.cubicTo(6.47f, 21.5f, 8.18f, 22.0f, 10.0f, 22.0f);
        mPath.rCubicTo(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        mPath.cubicTo(20.0f, 6.4799995f, 15.52f, 2.0f, 10.0f, 2.0f);
        mPath.close();
        mPath.moveTo(10.0f, 2.0f);
        
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