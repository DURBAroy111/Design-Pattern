package CompositeDP;

public class FileLeaf implements FileSystemElement{
    private int size;

    public FileLeaf(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
