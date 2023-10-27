package lesson17.threads;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl extends AbstractTask implements FindFilesTask{
    private String directory;
    private String searchString;
    private PrintStream out;

    public FindFileTaskImpl(String directory, String searchString, PrintStream out) {
        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if(directory == null){
            throw new NullPointerException("directory == null");
        }

        File startDIr = new File(directory);
        if(!startDIr.exists()){
            throw new FileNotFoundException("directory not exists");
        }

        if(!startDIr.isDirectory()){
            throw new FileNotFoundException("directory is not directory");
        }

        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null){
        throw new IllegalArgumentException("searchString == null");
        }

        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        if(directory == null){
            throw new TaskExecutionFailedException("directory == null");
        }

        File startDIr = new File(directory);
        if(!startDIr.exists()){
            throw new TaskExecutionFailedException("directory not exists");
        }

        if(!startDIr.isDirectory()){
            throw new TaskExecutionFailedException("directory is not directory");
        }


        // �������� ��� �����, ����� ������� ����� searchString
        File[] files = startDIr.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }

                if(pathname.getName().contains(searchString)){
                    return true;
                }

                return false;
            }
        });

        for(File file: files) {
            out.println(file.getAbsolutePath());
        }

    }

    @Override
    public String toString() {
        return "FindFileTaskImpl{" +
                "directory='" + directory + '\'' +
                ", searchString='" + searchString + '\'' +
                ", out=" + out +
                '}';
    }
}
