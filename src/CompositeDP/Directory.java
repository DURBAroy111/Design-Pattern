package CompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{
    private List<FileSystemElement> elements;

    public Directory() {
        elements = new ArrayList<>();
    }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemElement element : elements) {
            totalSize += element.getSize();
        }
        return totalSize;
    }
}
