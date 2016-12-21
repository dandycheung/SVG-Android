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
public class ic_timeline extends SVGRenderer {

    public ic_timeline(Context context) {
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
        
        mPath.moveTo(23.0f, 8.0f);
        mPath.rCubicTo(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        mPath.rCubicTo(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        mPath.rLineTo(-3.56f, 3.55f);
        mPath.rCubicTo(0.05f, 0.16f, 0.07f, 0.34f, 0.07f, 0.52f);
        mPath.rCubicTo(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        mPath.rCubicTo(-1.1000004f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        mPath.rLineTo(-2.55f, -2.55f);
        mPath.rCubicTo(-0.16f, 0.05f, -0.34f, 0.07f, -0.52f, 0.07f);
        mPath.rCubicTo(-0.17999935f, 0.0f, -0.36f, -0.02f, -0.52f, -0.07f);
        mPath.rLineTo(-4.55f, 4.56f);
        mPath.rCubicTo(0.05f, 0.16f, 0.07f, 0.33f, 0.07f, 0.51f);
        mPath.rCubicTo(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        mPath.rCubicTo(-1.0999999f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.1000004f, 0.9f, -2.0f, 2.0f, -2.0f);
        mPath.rCubicTo(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        mPath.rLineTo(4.56f, -4.55f);
        mPath.cubicTo(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        mPath.rCubicTo(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        mPath.rCubicTo(1.1000004f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        mPath.rLineTo(2.55f, 2.55f);
        mPath.rCubicTo(0.16f, -0.05f, 0.34f, -0.07f, 0.52f, -0.07f);
        mPath.rCubicTo(0.17999935f, 0.0f, 0.36f, 0.02f, 0.52f, 0.07f);
        mPath.rLineTo(3.55f, -3.56f);
        mPath.cubicTo(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        mPath.rCubicTo(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        mPath.rCubicTo(1.1000004f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(23.0f, 8.0f);
        
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