import java.util.Arrays;

public class JXplorer {

    private JXploreFile currentFile;

    public JXplorer() {
        this.currentFile = new JXploreFile();
    }

    public JXplorer(JXploreFile file) {
        this.currentFile = file;
    }

    public JXploreFile getCurrentFile() {
        return this.currentFile;
    }

    public void setCurrentFile(JXploreFile file) {
        this.currentFile = file;
    }

    public void printName(JXploreFile file) {
        System.out.println(file.getName());
    }

    public void printSubFiles(JXploreFile file) {
        System.out.println(Arrays.toString(file.getSubFiles()));
    }

    public void printSubFolders(JXploreFile file) {
        System.out.println(Arrays.toString(file.getSubFiles()));
    }

    public static void main(String[] args) {
        new JXplorer();
    }
}
