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
        for (int i = 0; i < cellCount; i++) {
            for (int j = 0; j < cellCount; j++) {
                if (j == 0) {
                    mCells.add(new LinkedList<Cell>());
                }
                LinkedList<Cell> stroke = mCells.get(i);
                stroke.add(new Cell(i, j, Math.random() > 0.5f));

            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float cellSizeHorizontal = getWidth() / mCellCount / 2;
        float cellSizeVertical = getHeight() / mCellCount / 2;



    }
}
