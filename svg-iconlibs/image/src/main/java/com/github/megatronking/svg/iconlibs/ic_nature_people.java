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
public class ic_nature_people extends SVGRenderer {

    public ic_nature_people(Context context) {
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
        
        mPath.moveTo(22.17f, 9.17f);
        mPath.rCubicTo(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        mPath.rCubicTo(-3.8700008f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        mPath.rCubicTo(0.0f, 3.47f, 2.52f, 6.34f, 5.83f, 6.89f);
        mPath.lineTo(14.0f, 20.0f);
        mPath.lineTo(6.0f, 20.0f);
        mPath.rLineTo(0f, -3.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.lineTo(3.0f, 12.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rLineTo(0f, -3.88f);
        mPath.rCubicTo(3.47f, -0.41f, 6.17f, -3.36f, 6.17f, -6.95f);
        mPath.close();
        mPath.moveTo(22.17f, 9.17f);
        mPath.moveTo(4.5f, 11.0f);
        mPath.rCubicTo(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        mPath.cubicTo(6.0f, 8.67f, 5.33f, 8.0f, 4.5f, 8.0f);
        mPath.cubicTo(3.67f, 8.0f, 3.0f, 8.67f, 3.0f, 9.5f);
        mPath.cubicTo(3.0f, 10.33f, 3.67f, 11.0f, 4.5f, 11.0f);
        mPath.close();
        mPath.moveTo(4.5f, 11.0f);
        
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