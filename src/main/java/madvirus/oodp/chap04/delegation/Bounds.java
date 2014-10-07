package madvirus.oodp.chap04.delegation;

public class Bounds {
    private int x;
    private int y;
    private int width;
    private int height;

    public Bounds() {
    }

    public Bounds(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void set(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean contains(int ox, int oy) {
        return ox > x && ox < x + width && oy > y && oy < y + height;
    }
}
