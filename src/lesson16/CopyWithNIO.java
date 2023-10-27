package lesson16;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyWithNIO implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        Path pathFrom = Paths.get(from);
        Path pathTo = Paths.get(to);
        Files.copy(pathFrom, pathTo);
    }
}