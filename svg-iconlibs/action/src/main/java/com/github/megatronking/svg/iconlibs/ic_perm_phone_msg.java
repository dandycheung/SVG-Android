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
public class ic_perm_phone_msg extends SVGRenderer {

    public ic_perm_phone_msg(Context context) {
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
        
        mPath.moveTo(20.0f, 15.5f);
        mPath.rCubicTo(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        mPath.rCubicTo(-0.35f, -0.11f, -0.74f, -0.03f, -1.02f, 0.24f);
        mPath.rLineTo(-2.2f, 2.2f);
        mPath.rCubicTo(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.58f);
        mPath.rLineTo(2.2f, -2.21f);
        mPath.rCubicTo(0.28f, -0.27f, 0.36f, -0.66f, 0.25f, -1.01f);
        mPath.cubicTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.lineTo(4.0f, 3.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.rLineTo(0f, -3.5f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(20.0f, 15.5f);
        mPath.moveTo(12.0f, 3.0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.rLineTo(3.0f, -3.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.lineTo(21.0f, 3.0f);
        mPath.rLineTo(-9.0f, 0f);
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