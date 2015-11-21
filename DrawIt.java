package com.example.proto.drawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawIt extends View{

    Bitmap blueBall;
    int x, y;

    public DrawIt(Context context){
        super(context);
        blueBall = BitmapFactory.decodeResource(getResources(), R.drawable.blueball);
        x = 0;
        y = 0;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Rect rectangle = new Rect();
        rectangle.set(0, 0, canvas.getWidth(), canvas.getHeight() / 2);

        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);

        canvas.drawRect(rectangle, blue);
        if(x < canvas.getWidth()) {
            x += 1;
        } else{
            x = 0;
        }
        if(y < canvas.getHeight()) {
            y += 1;
        }else{
            y = 0;
        }
        canvas.drawBitmap(blueBall, x, y, new Paint());
        invalidate();
    }
}
