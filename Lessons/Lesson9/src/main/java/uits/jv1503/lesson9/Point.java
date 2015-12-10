package uits.jv1503.lesson9;

import java.io.Serializable;

public class Point implements Comparable<Point>, Serializable {
    
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "["+x+","+y+"]";
    }

    @Override
    public int compareTo(Point o) {
        return this.x - o.getX();
    }
}


