package lesson16;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyWithChannels implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        FileChannel channelFrom = null;
        FileChannel channelTo = null;

        channelFrom = new FileInputStream(from).getChannel();
        channelTo = new FileOutputStream(to).getChannel();
        channelTo.transferFrom(channelFrom, 0, channelFrom.size());
        channelFrom.close();
        channelTo.close();

    }
}
