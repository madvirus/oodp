package madvirus.oodp.chap03.abstraction;

public class ByteSourceFactory {

    public ByteSource create() { // 객체 생성 기능을 위한 오퍼레이션 정의
        if (useFile())
            return new FileDataReader();
        else
            return new SocketDataReader();
    }

    private boolean useFile() {
        String useFileVal = System.getProperty("useFile");
        return useFileVal != null && Boolean.valueOf(useFileVal);
    }

    // 싱글톤 패턴 적용
    private static ByteSourceFactory instance = new ByteSourceFactory();
    public static ByteSourceFactory getInstance() {
        return instance;
    }

    private ByteSourceFactory() { }
}
