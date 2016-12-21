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
public class ic_autorenew extends SVGRenderer {

    public ic_autorenew(Context context) {
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
        
        mPath.moveTo(12.0f, 6.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rLineTo(4.0f, -4.0f);
        mPath.rLineTo(-4.0f, -4.0f);
        mPath.rLineTo(0f, 3.0f);
        mPath.rCubicTo(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        mPath.rCubicTo(0.0f, 1.57f, 0.46f, 3.03f, 1.24f, 4.26f);
        mPath.lineTo(6.7f, 14.8f);
        mPath.rCubicTo(-0.45f, -0.83f, -0.7f, -1.79f, -0.7f, -2.8f);
        mPath.rCubicTo(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        mPath.close();
        mPath.moveTo(12.0f, 6.0f);
        mPath.rMoveTo(6.76f, 1.74f);
        mPath.lineTo(17.3f, 9.2f);
        mPath.rCubicTo(0.44f, 0.84f, 0.7f, 1.79f, 0.7f, 2.8f);
        mPath.rCubicTo(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        mPath.rLineTo(0f, -3.0f);
        mPath.rLineTo(-4.0f, 4.0f);
        mPath.rLineTo(4.0f, 4.0f);
        mPath.rLineTo(0f, -3.0f);
        mPath.rCubicTo(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        mPath.rCubicTo(0.0f, -1.57f, -0.46f, -3.03f, -1.24f, -4.26f);
        mPath.close();
        mPath.moveTo(18.76f, 7.74f);
        
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