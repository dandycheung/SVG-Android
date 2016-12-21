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
public class ic_access_alarms extends SVGRenderer {

    public ic_access_alarms(Context context) {
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
        
        mPath.moveTo(22.0f, 5.7f);
        mPath.rLineTo(-4.6f, -3.9f);
        mPath.rLineTo(-1.3f, 1.5f);
        mPath.rLineTo(4.6f, 3.9f);
        mPath.lineTo(22.0f, 5.7f);
        mPath.close();
        mPath.moveTo(22.0f, 5.7f);
        mPath.moveTo(7.9f, 3.4f);
        mPath.lineTo(6.6f, 1.9f);
        mPath.lineTo(2.0f, 5.7f);
        mPath.rLineTo(1.3f, 1.5f);
        mPath.rLineTo(4.6f, -3.8f);
        mPath.close();
        mPath.moveTo(7.9f, 3.4f);
        mPath.moveTo(12.5f, 8.0f);
        mPath.lineTo(11.0f, 8.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(4.7f, 2.9f);
        mPath.rLineTo(0.8f, -1.2f);
        mPath.rLineTo(-4.0f, -2.4f);
        mPath.lineTo(12.5f, 8.0f);
        mPath.close();
        mPath.moveTo(12.5f, 8.0f);
        mPath.moveTo(12.0f, 4.0f);
        mPath.rCubicTo(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f);
        mPath.rCubicTo(0.0f, 5.0f, 4.0f, 9.0f, 9.0f, 9.0f);
        mPath.rCubicTo(5.0f, 0.0f, 9.0f, -4.0f, 9.0f, -9.0f);
        mPath.rCubicTo(0.0f, -5.0f, -4.0f, -9.0f, -9.0f, -9.0f);
        mPath.close();
        mPath.moveTo(12.0f, 4.0f);
        mPath.rMoveTo(0.0f, 16.0f);
        mPath.rCubicTo(-3.9f, 0.0f, -7.0f, -3.1f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -3.8999996f, 3.1f, -7.0f, 7.0f, -7.0f);
        mPath.rCubicTo(3.8999996f, 0.0f, 7.0f, 3.1f, 7.0f, 7.0f);
        mPath.rCubicTo(0.0f, 3.8999996f, -3.1f, 7.0f, -7.0f, 7.0f);
        mPath.close();
        mPath.moveTo(12.0f, 20.0f);
        
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