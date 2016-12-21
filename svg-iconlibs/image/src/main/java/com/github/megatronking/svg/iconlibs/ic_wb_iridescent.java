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
public class ic_wb_iridescent extends SVGRenderer {

    public ic_wb_iridescent(Context context) {
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
        
        mPath.moveTo(5.0f, 14.5f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rLineTo(0f, -6.0f);
        mPath.lineTo(5.0f, 8.5f);
        mPath.rLineTo(0f, 6.0f);
        mPath.close();
        mPath.moveTo(5.0f, 14.5f);
        mPath.moveTo(11.0f, 0.55f);
        mPath.lineTo(11.0f, 3.5f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(13.0f, 0.55f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.close();
        mPath.moveTo(11.0f, 0.55f);
        mPath.rMoveTo(8.04f, 2.5f);
        mPath.rLineTo(-1.79f, 1.79f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.rLineTo(1.8f, -1.79f);
        mPath.rLineTo(-1.42f, -1.41f);
        mPath.close();
        mPath.moveTo(19.04f, 3.05f);
        mPath.moveTo(13.0f, 22.45f);
        mPath.lineTo(13.0f, 19.5f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.95f);
        mPath.rLineTo(2.0f, 0f);
        mPath.close();
        mPath.moveTo(13.0f, 22.45f);
        mPath.rMoveTo(7.45f, -3.91f);
        mPath.rLineTo(-1.8f, -1.79f);
        mPath.rLineTo(-1.41f, 1.41f);
        mPath.rLineTo(1.79f, 1.8f);
        mPath.rLineTo(1.42f, -1.42f);
        mPath.close();
        mPath.moveTo(20.45f, 18.54f);
        mPath.moveTo(3.55f, 4.46f);
        mPath.rLineTo(1.79f, 1.79f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.rLineTo(-1.79f, -1.79f);
        mPath.rLineTo(-1.41f, 1.41f);
        mPath.close();
        mPath.moveTo(3.55f, 4.46f);
        mPath.rMoveTo(1.41f, 15.49f);
        mPath.rLineTo(1.79f, -1.8f);
        mPath.rLineTo(-1.41f, -1.41f);
        mPath.rLineTo(-1.79f, 1.79f);
        mPath.rLineTo(1.41f, 1.42f);
        mPath.close();
        mPath.moveTo(4.96f, 19.95f);
        
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