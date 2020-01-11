import java.io.File;

public class DirectoryTree {
    public static void directoryTree(String path) {
        File dir = new File(path);
        if(dir.exists()){
if(dir.isDirectory()){
    
}
        }else{
            System.out.println("Folder " + path + " does not exist");
        }

    }
}
