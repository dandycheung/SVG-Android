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
public class ic_unfold_more extends SVGRenderer {

    public ic_unfold_more(Context context) {
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
        
        mPath.moveTo(12.0f, 5.83f);
        mPath.lineTo(15.17f, 9.0f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.lineTo(12.0f, 3.0f);
        mPath.lineTo(7.41f, 7.59f);
        mPath.lineTo(8.83f, 9.0f);
        mPath.lineTo(12.0f, 5.83f);
        mPath.close();
        mPath.moveTo(12.0f, 5.83f);
        mPath.rMoveTo(0.0f, 12.34f);
        mPath.lineTo(8.83f, 15.0f);
        mPath.rLineTo(-1.41f, 1.41f);
        mPath.lineTo(12.0f, 21.0f);
        mPath.rLineTo(4.59f, -4.59f);
        mPath.lineTo(15.17f, 15.0f);
        mPath.lineTo(12.0f, 18.17f);
        mPath.close();
        mPath.moveTo(12.0f, 18.17f);
        
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