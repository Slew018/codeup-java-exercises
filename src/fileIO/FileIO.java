package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void main(String[] args) {
        Path path = getPath("src", "fileIO", "files");

        tryCreateDirectory(path);

        path = Paths.get(path.toString(), "text.txt");
        tryCreateFile(path);
    }

    public static void tryCreateDirectory(Path pathToCreate) {

        if (!doesPathExist(pathToCreate)) {
            try {
                Files.createDirectory(pathToCreate);
            } catch (IOException e) {
                System.out.println("Could not create the directory at: ");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        } else {
            System.out.println("The path at: " + pathToCreate.toAbsolutePath() + " already exists");
        }
    }

    public static void tryCreateFile(Path path) {

        if (!doesPathExist(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                System.out.println("Could not create file at: ");
            }
        } else {
            System.out.println("The file at: " + path.toAbsolutePath() + "already exists");
        }
    }

    public static Path getPath(String filename) {
        return Paths.get(filename);
    }

    public static Path getPath(String parentDirectory, String filename) {
        return Paths.get(parentDirectory, filename);
    }

    public static Path getPath(String parentDirectory, String childDirectory, String filename) {
        return Paths.get(parentDirectory, childDirectory, filename);
    }

    public static boolean doesPathExist(Path path) {
        return Files.exists(path);
    }
}
