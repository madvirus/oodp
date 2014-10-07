package madvirus.oodp.chap04.composition;

public class Storage {
    private Compressor compressor = new Compressor();
    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }
    public void save(FileData fileData) {
        byte[] compressedByte = compressor.compress(fileData.getInputStream());
        // ...
    }

}
