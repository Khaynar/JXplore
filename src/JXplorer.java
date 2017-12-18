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

    public void printSubFiles(JXploreFile mainFile) {
        JXploreFile[] subFiles = mainFile.getSubFiles();
        for (int i = 0; i < subFiles.length; i++) {
            System.out.println(subFiles[i].getName());
        }
    }

    public void printSubFolders(JXploreFile mainFolder) {
        JXploreFile[] subFolders = mainFolder.getSubFolders();
        for (int i = 0; i < subFolders.length; i++) {
            System.out.println(subFolders[i].getName());
        }
    }

    public void buildGUI() {
        new JXAddressView(this);
    }

    public static void main(String[] args) {
        new JXplorer().buildGUI();
    }

}
