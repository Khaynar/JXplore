import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.util.ArrayList;

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
        File[] files = this.file.listFiles();
        JXploreFile[] subFiles = new JXploreFile[files.length];

        for (int i = 0; i < files.length; i++) {
            subFiles[i] = new JXploreFile(files[i]);
        }

        return subFiles;
    }

    public JXploreFile[] getSubFolders() {
        File[] files = this.file.listFiles();
        ArrayList<JXploreFile> subFiles = new ArrayList<JXploreFile>();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subFiles.add(new JXploreFile(files[i]));
            }
        }

        //TODO not tomoz
        return subFiles.toArray(new JXploreFile[subFiles.size()]);
    }

}
