package lesson16;

import java.io.*;

public class CopyWithStreams implements CopyUtils {
    @Override
    public void copy(String from, String to) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(from);
            os = new FileOutputStream(to);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                is.close();
                os.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }
}
