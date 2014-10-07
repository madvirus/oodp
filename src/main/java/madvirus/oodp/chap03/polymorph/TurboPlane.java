package madvirus.oodp.chap03.polymorph;

public class TurboPlane extends Plane implements Turbo {
    public void boost() {
        System.out.println("TurboPlane 가속");
    }
}
