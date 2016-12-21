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
public class ic_signal_wifi_3_bar_lock extends SVGRenderer {

    public ic_signal_wifi_3_bar_lock(Context context) {
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
        
        mPath.moveTo(12.0f, 3.0f);
        mPath.cubicTo(5.3f, 3.0f, 0.8f, 6.7f, 0.4f, 7.0f);
        mPath.rLineTo(3.2f, 3.9f);
        mPath.lineTo(12.0f, 21.5f);
        mPath.rLineTo(3.5f, -4.3f);
        mPath.rLineTo(0f, -2.6f);
        mPath.rCubicTo(0.0f, -2.2f, 1.4f, -4.0f, 3.3f, -4.7f);
        mPath.rCubicTo(0.3f, -0.1f, 0.5f, -0.2f, 0.8f, -0.2f);
        mPath.rCubicTo(0.3f, -0.1f, 0.6f, -0.1f, 0.9f, -0.1f);
        mPath.rCubicTo(0.4f, 0.0f, 0.7f, 0.0f, 1.0f, 0.1f);
        mPath.lineTo(23.6f, 7.0f);
        mPath.rCubicTo(-0.4f, -0.3f, -4.9f, -4.0f, -11.6f, -4.0f);
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
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(23.0f, 16.0f);
        mPath.rLineTo(0f, -1.5f);
        mPath.rCubicTo(0.0f, -1.4f, -1.1f, -2.5f, -2.5f, -2.5f);
        mPath.cubicTo(19.1f, 12.0f, 18.0f, 13.1f, 18.0f, 14.5f);
        mPath.lineTo(18.0f, 16.0f);
        mPath.rCubicTo(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rCubicTo(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rCubicTo(0.5f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.rCubicTo(0.0f, -0.5f, -0.5f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(23.0f, 16.0f);
        mPath.rMoveTo(-1.0f, 0.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rLineTo(0f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8f, 0.7f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.79999924f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        mPath.lineTo(22.0f, 16.0f);
        mPath.close();
        mPath.moveTo(22.0f, 16.0f);
        mPath.rMoveTo(-10.0f, 5.5f);
        mPath.rLineTo(3.5f, -4.3f);
        mPath.rLineTo(0f, -2.6f);
        mPath.rCubicTo(0.0f, -2.2f, 1.4f, -4.0f, 3.3f, -4.7f);
        mPath.cubicTo(17.3f, 9.0f, 14.9f, 8.0f, 12.0f, 8.0f);
        mPath.rCubicTo(-4.8f, 0.0f, -8.0f, 2.6f, -8.5f, 2.9f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}