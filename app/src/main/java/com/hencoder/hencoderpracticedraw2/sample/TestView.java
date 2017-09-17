package com.hencoder.hencoderpracticedraw2.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

/**
 * Created by developerHaoz on 2017/9/16.
 */

public class TestView extends View {

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        LinearGradient  linearGradient = new LinearGradient(100, 100, 500, 500
                , getResources().getColor(R.color.colorPrimary), getResources().getColor(R.color.colorAccent)
                , Shader.TileMode.REPEAT);

        Shader shader = new SweepGradient(300, 300, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));

        ComposeShader composeShader = new ComposeShader(linearGradient, shader, PorterDuff.Mode.SRC);

        paint.setShader(composeShader);



        canvas.drawCircle(200, 200, 100, paint);
    }
}
