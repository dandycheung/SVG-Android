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
public class ic_flight_takeoff extends SVGRenderer {

    public ic_flight_takeoff(Context context) {
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
        
        mPath.moveTo(2.5f, 19.0f);
        mPath.rLineTo(19.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(-19.0f, 0f);
        mPath.close();
        mPath.moveTo(2.5f, 19.0f);
        mPath.rMoveTo(19.57f, -9.36f);
        mPath.rCubicTo(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f);
        mPath.lineTo(14.92f, 10.0f);
        mPath.rLineTo(-6.9f, -6.43f);
        mPath.rLineTo(-1.93f, 0.51f);
        mPath.rLineTo(4.14f, 7.17f);
        mPath.rLineTo(-4.97f, 1.33f);
        mPath.rLineTo(-1.97f, -1.54f);
        mPath.rLineTo(-1.45f, 0.39f);
        mPath.rLineTo(1.82f, 3.16f);
        mPath.rLineTo(0.77f, 1.33f);
        mPath.rLineTo(1.6f, -0.43f);
        mPath.rLineTo(5.31f, -1.42f);
        mPath.rLineTo(4.35f, -1.16f);
        mPath.lineTo(21.0f, 11.49f);
        mPath.rCubicTo(0.81f, -0.23f, 1.28f, -1.05f, 1.07f, -1.85f);
        mPath.close();
        mPath.moveTo(22.07f, 9.64f);
        
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