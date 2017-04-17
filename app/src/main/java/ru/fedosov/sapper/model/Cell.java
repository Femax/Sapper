package ru.fedosov.sapper.model;

/**
 * Created by fedosov on 4/17/17.
 */

public class Cell {

    private int x;
    private int y;
    private boolean isMine;

    public Cell(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
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

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
