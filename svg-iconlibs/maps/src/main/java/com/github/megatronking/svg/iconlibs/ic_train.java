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
public class ic_train extends SVGRenderer {

    public ic_train(Context context) {
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
        
        mPath.moveTo(12.0f, 2.0f);
        mPath.rCubicTo(-4.0f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        mPath.rLineTo(0f, 9.5f);
        mPath.cubicTo(4.0f, 17.43f, 5.57f, 19.0f, 7.5f, 19.0f);
        mPath.lineTo(6.0f, 20.5f);
        mPath.rLineTo(0f, 0.5f);
        mPath.rLineTo(2.23f, 0f);
        mPath.rLineTo(2.0f, -2.0f);
        mPath.lineTo(14.0f, 19.0f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -0.5f);
        mPath.lineTo(16.5f, 19.0f);
        mPath.rCubicTo(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        mPath.lineTo(20.0f, 6.0f);
        mPath.rCubicTo(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        mPath.close();
        mPath.moveTo(12.0f, 2.0f);
        mPath.moveTo(7.5f, 17.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.cubicTo(6.0f, 14.67f, 6.67f, 14.0f, 7.5f, 14.0f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.cubicTo(9.0f, 16.33f, 8.33f, 17.0f, 7.5f, 17.0f);
        mPath.close();
        mPath.moveTo(7.5f, 17.0f);
        mPath.rMoveTo(3.5f, -7.0f);
        mPath.lineTo(6.0f, 10.0f);
        mPath.lineTo(6.0f, 6.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.close();
        mPath.moveTo(11.0f, 10.0f);
        mPath.rMoveTo(2.0f, 0.0f);
        mPath.lineTo(13.0f, 6.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rLineTo(-5.0f, 0f);
        mPath.close();
        mPath.moveTo(13.0f, 10.0f);
        mPath.rMoveTo(3.5f, 7.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(16.5f, 17.0f);
        
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