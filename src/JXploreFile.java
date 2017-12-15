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
        //Not sure this is 100% correct - John
        JXploreFile[] subFiles = new JXploreFile[5];

        subFiles[0] = new JXploreFile();
        subFiles[1] = new JXploreFile();
        subFiles[2] = new JXploreFile();
        subFiles[3] = new JXploreFile();
        subFiles[4] = new JXploreFile();

        return subFiles;
    }

    public JXploreFile[] getSubFolders() {
        //TODO not tomoz
        return null;
    }

}
