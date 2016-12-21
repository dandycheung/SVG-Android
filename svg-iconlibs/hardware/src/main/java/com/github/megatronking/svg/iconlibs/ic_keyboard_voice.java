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
public class ic_keyboard_voice extends SVGRenderer {

    public ic_keyboard_voice(Context context) {
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
        
        mPath.moveTo(12.0f, 15.0f);
        mPath.rCubicTo(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        mPath.lineTo(15.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.cubicTo(10.34f, 3.0f, 9.0f, 4.34f, 9.0f, 6.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rCubicTo(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        mPath.close();
        mPath.moveTo(12.0f, 15.0f);
        mPath.rMoveTo(5.3f, -3.0f);
        mPath.rCubicTo(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
        mPath.cubicTo(9.239999f, 17.1f, 6.7f, 15.0f, 6.7f, 12.0f);
        mPath.lineTo(5.0f, 12.0f);
        mPath.rCubicTo(0.0f, 3.42f, 2.72f, 6.23f, 6.0f, 6.72f);
        mPath.lineTo(11.0f, 22.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -3.28f);
        mPath.rCubicTo(3.28f, -0.48f, 6.0f, -3.3f, 6.0f, -6.72f);
        mPath.rLineTo(-1.7f, 0f);
        mPath.close();
        mPath.moveTo(17.3f, 12.0f);
        
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