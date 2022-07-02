import java.io.File;

public class fileList {

    public static void main(String[] args) {
        // Creates an array in which we will store the names of files and directories
        String[] fileList;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("D:/jenkins_java");

        // Populates the array with names of files and directories
        fileList = f.list();

        // For each pathname in the pathnames array
        for (String pathname : fileList) {
            // Print the names of files and directories
            System.out.println(pathname);
        }
    }
}