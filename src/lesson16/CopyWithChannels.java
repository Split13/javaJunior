package lesson16;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyWithChannels implements CopyUtils {
    @Override
    public void copy(String from, String to) {
       FileChannel channelFrom = null;
       FileChannel channelTo = null;
        try {
            channelFrom = new FileInputStream(from).getChannel();
            channelTo = new FileOutputStream(to).getChannel();
            channelTo.transferFrom(channelFrom, 0, channelFrom.size());
            channelFrom.close();
            channelTo.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                channelFrom.close();
                channelTo.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
