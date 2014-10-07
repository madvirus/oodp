package madvirus.oodp.chap04.delegation;

public abstract class Figure {
    private int x, y, width, height;
    private Bounds bounds = new Bounds(); // 위임 대상을 조립 형태로 가짐
    // ...
    private void changeSize() {
        // 크기 변경 코드 위치
        bounds.set(x, y, width, height);
    }

    public boolean contains(Point point) {
        // bounds 객체에 처리를 위임함
        return bounds.contains(point.getX(), point.getY());

        /*
        Bounds bounds = new Bounds(x, y, width, height);
        return bounds.contains(point.getX(), point.getY());
         */
    }
}
