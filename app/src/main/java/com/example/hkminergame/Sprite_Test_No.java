package com.example.hkminergame;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Sprite_Test_No {

    private static final String TAG = Sprite_Test_No.class.getSimpleName();

    private Bitmap bitmap;		// La sequenza animata
    private Rect sourceRect;	// il rettangolo da disegnare
    private int frameNr;		// il numero di frame nell'animazione
    private int currentFrame;	// il frame corrente
    private long frameTicker;	// il tempo passato dall'ultimo frame aggiornato
    private int framePeriod;	// ms tra ogni frame (1000/fps)

    private int spriteWidth;	// la larghezza della Sprite_Test_No
    private int spriteHeight;	// l'altezza della Sprite_Test_No

    private int x;				// la coordinata X dell'oggetto
    private int y;				// la coordinata Y dell'oggetto

    public Sprite_Test_No(Bitmap bitmap, int x, int y, int width, int height, int fps, int frameCount) {
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
        currentFrame = 0;
        frameNr = frameCount;
        spriteWidth = bitmap.getWidth() / frameCount;
        spriteHeight = bitmap.getHeight();
        sourceRect = new Rect(0, 0, spriteWidth, spriteHeight);
        framePeriod = 1000 / fps;
        frameTicker = 0l;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    public Rect getSourceRect() {
        return sourceRect;
    }
    public void setSourceRect(Rect sourceRect) {
        this.sourceRect = sourceRect;
    }
    public int getFrameNr() {
        return frameNr;
    }
    public void setFrameNr(int frameNr) {
        this.frameNr = frameNr;
    }
    public int getCurrentFrame() {
        return currentFrame;
    }
    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }
    public int getFramePeriod() {
        return framePeriod;
    }
    public void setFramePeriod(int framePeriod) {
        this.framePeriod = framePeriod;
    }
    public int getSpriteWidth() {
        return spriteWidth;
    }
    public void setSpriteWidth(int spriteWidth) {
        this.spriteWidth = spriteWidth;
    }
    public int getSpriteHeight() {
        return spriteHeight;
    }
    public void setSpriteHeight(int spriteHeight) {
        this.spriteHeight = spriteHeight;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Il metodo update per Elaine
    public void update(long gameTime) {
        if (gameTime > frameTicker + framePeriod) {
            frameTicker = gameTime;
            // incremento del frame
            currentFrame++;
            if (currentFrame >= frameNr) {
                currentFrame = 0;
            }
        }
        // definiamo l'area rettangolare da tagliare
        this.sourceRect.left = currentFrame * spriteWidth;
        this.sourceRect.right = this.sourceRect.left + spriteWidth;
    }

    // il metodo che disegna il corrispondente frame
    public void draw(Canvas canvas) {
        // dove disegnare la sprite
        Rect destRect = new Rect(getX(), getY(), getX() + spriteWidth, getY() + spriteHeight);
        canvas.drawBitmap(bitmap, sourceRect, destRect, null);
        canvas.drawBitmap(bitmap, 20, 150, null);
        Paint paint = new Paint();
        paint.setARGB(50, 0, 255, 0);
        canvas.drawRect(20 + (currentFrame * destRect.width()), 150, 20 + (currentFrame * destRect.width()) + destRect.width(), 150 + destRect.height(),  paint);
    }
}

