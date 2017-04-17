package ru.fedosov.sapper.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceView;

import java.util.ArrayList;
import java.util.LinkedList;

import ru.fedosov.sapper.model.Cell;

/**
 * Created by fedosov on 4/17/17.
 */

public class GameView extends SurfaceView {

    private ArrayList<LinkedList<Cell>> mCells;
    private int mCellCount;
    private Paint mSeparatorPaint;

    public GameView(Context context, int cellCount) {
        super(context);
        mCellCount = cellCount;
        mSeparatorPaint = new Paint();
        int separatorColor = context.getResources().getColor(android.R.color.black);
        mSeparatorPaint.setColor(separatorColor);
        mSeparatorPaint.set
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
