import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PrintText {
    private static String FOLDER_NAME; // = "/Users/q1yh4/Documents/jaya_work/D4S1";
    private static String FILE_NAME; // = "UpdateBomClient_";
    public static void main(String[] args) {
        FOLDER_NAME = args[0];
        FILE_NAME = args[1];
        try {

        } catch(Exception noSuchFileException) {
            noSuchFileException.printStackTrace();
        }
        printStartAndEndDate();
    }

    private static void printStartAndEndDate() {
        String sortedFile = getSortedFileName();
        System.out.println("sortedFile: " + sortedFile);
        if(sortedFile != null) {
            try {
                List<String> allLines = Files.readAllLines(Paths.get(FOLDER_NAME+"/"+sortedFile));
                System.out.println("First Line: "+printFirstLineDate(allLines));
                System.out.println("Last Line: "+printlastLineDate(allLines));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String printFirstLineDate(List<String> allLines) {
        return allLines.get(0).substring(0, 23);
    }

    private static String printlastLineDate(List<String> allLines) {
        return allLines.get(allLines.size()-1).substring(0, 23);
    }

    private static String getSortedFileName() {
        try (Stream<Path> paths = Files.walk(Paths.get(FOLDER_NAME))) {
            String fN = paths
                .filter(Files::isRegularFile)
                .filter(p->p.getFileName().toFile().getName().contains(FILE_NAME))
                .sorted(Comparator.comparing((file) -> {
                    FileTime fileTime = null;
                    try {
                        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
                        fileTime = attr.lastModifiedTime();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    return fileTime;
                }, Comparator.reverseOrder()))
                .findFirst().get().getFileName().toString();
                return fN;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    
}