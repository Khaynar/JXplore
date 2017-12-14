import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class JXploreFile {

    private File file;

    public JXploreFile() {
        this.file = new File("C:\\");
    }

    public JXploreFile(String pathname) {
        this.file = new File(pathname);
    }

    public JXploreFile(File file) {
        this.file = file;
    }

    public String getName() {
        return this.file.getName();
    }

    public String getPath() {
        return this.file.getPath();
    }

    public Icon getIcon() {
        return FileSystemView.getFileSystemView().getSystemIcon(this.file);
    }

    public JXploreFile[] getSubFiles() {
        //TODO not tomoz
        return null;
    }

    public JXploreFile[] getSubFolders() {
        //TODO not tomoz
        return null;
    }

}
