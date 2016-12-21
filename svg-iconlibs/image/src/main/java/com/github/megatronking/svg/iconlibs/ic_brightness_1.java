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
public class ic_brightness_1 extends SVGRenderer {

    public ic_brightness_1(Context context) {
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
        
        mPath.moveTo(12.0f, 12.0f);
        mPath.rMoveTo(-10.0f, 0.0f);
        mPath.cubicTo(2.0f, 9.348852f, 3.0542877f, 6.803577f, 4.928932f, 4.928932f);
        mPath.cubicTo(6.803577f, 3.0542877f, 9.348852f, 2.0f, 12.0f, 2.0f);
        mPath.cubicTo(14.651148f, 2.0f, 17.196423f, 3.0542877f, 19.071068f, 4.928932f);
        mPath.cubicTo(20.945713f, 6.803577f, 22.0f, 9.348852f, 22.0f, 12.0f);
        mPath.cubicTo(22.0f, 14.651148f, 20.945713f, 17.196423f, 19.071068f, 19.071068f);
        mPath.cubicTo(17.196423f, 20.945713f, 14.651148f, 22.0f, 12.0f, 22.0f);
        mPath.cubicTo(9.348852f, 22.0f, 6.803577f, 20.945713f, 4.928932f, 19.071068f);
        mPath.cubicTo(3.0542877f, 17.196423f, 2.0f, 14.651148f, 2.0f, 12.0f);
        
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