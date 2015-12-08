
package uits.jv1503.lesson8;

public abstract class Shape {
    
    public abstract void draw();
    public abstract void moveVertically();
    public abstract void drawHorizontally();
    
    public static class Point{

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        
        
    
        
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
    }        
}
