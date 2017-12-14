import java.util.ArrayList;
import java.util.Arrays;

public class JXplorer {

    //TODO this is a good start, but remember, the syntax for a variable is Type name. 
    //What do you think would be a good name for the file (folder) being looked at?
    //Hint: look at the getters and setters. 
    private JXploreFile;
    
    //TODO 'linking private and public' isn't a thing. The fields are characteristics of the class, like a car has a colour. 
    //Does a JXplorer need a JXplorer? 
    //It may be possible, a person has two parents, who are both persons again. 
    //'private Human parent' would make sense for drawing up a family tree. 
    //Tip: think of what it's relation is before you assign a class (type) to it. 
    private JXplorer;

    public JXplorer() {
        //TODO
    }

    public JXplorer(JXploreFile file) {
        //TODO
    }

    public JXploreFile getCurrentFile() {
        //TODO
        return null;
    }

    public void setCurrentFile(JXploreFile file) {
        //TODO
    }

    public void printName(JXploreFile file) {
        //TODO BITCHES

    }

    public void printSubFiles(JXploreFile file) {
        System.out.println(Arrays.toString(file.getSubFiles()));
    }

      public void printSubFolders(JXploreFile file) {
        //TODO GENJI
    }

    public static void main(String[] args) {
        JXploreFile file = new JXploreFile();
        System.out.println(file.getPath());
    }
}
