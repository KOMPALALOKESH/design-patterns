package CompositeDesignPattern;

public class Driver {

    public static void main(String[] args) {
        // Create files
        IFileSystemComponent file1 = new File("file1.txt", 10);
        IFileSystemComponent file2 = new File("file2.txt", 20);
        IFileSystemComponent file3 = new File("file3.txt", 30);
        IFileSystemComponent file4 = new File("file4.txt", 40);

        // Create directories
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        // Add files to directories
        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(file3);

        // Create a root directory and add subdirectories
        Directory rootDir = new Directory("root");
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);
        rootDir.addComponent(file4);

        // Show details of the entire file system structure
        rootDir.showDetails();
    }

}
