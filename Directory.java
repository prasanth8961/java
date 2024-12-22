import java.io.File;

public class Directory {
    public static void main(String[] args) {
        String rootPath = "D:/java/";
        String dirName = "Leo";
        String path = rootPath + dirName;
        File file = new File(path);
        Boolean isCreated = file.mkdir();
        if(isCreated) {
            System.out.println("Folder created at " + path);
        }else{
            System.out.println("Something gets wrong");
        }
    }    
}
