package CompositeDP;

public class Main {
    public static void main(String[] args) {

        FileLeaf[] files = new FileLeaf[12];
        for (int i = 0; i < files.length; i++) {
            files[i] = new FileLeaf((i + 1) * 40);
        }


        Directory directory = new Directory();
        for (FileLeaf file : files) {
            directory.addElement(file);
        }

        int totalSize = directory.getSize();

        System.out.println("Total size of directory: " + totalSize + " bytes");
    }
}
