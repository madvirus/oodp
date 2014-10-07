package madvirus.oodp.chap01.after2;

public class Menu3ScreenUI implements ScreenUI {

    public void show() {
        System.out.println("메뉴3 화면으로 전환");
    }

    public void handleButton1Click() {
        System.out.println("메뉴3 화면의 버튼1 처리");
    }

    public void handleButton2Click() {
        System.out.println("메뉴3 화면의 버튼2 처리");
    }
}
