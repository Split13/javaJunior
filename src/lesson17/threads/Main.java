package lesson17.threads;

import lesson16.CopyWithOneByte;

public class Main {
    public static void main(String[] args) {
        CopyFileTask task1 = new CopyFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\junit-4.12.jar", "C:\\Copy\\1.jar");
        CopyFileTask task2 = new CopyFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\Контрольный_тест_после_1го_модуля_курса_Java (1).pdf", "C:\\Copy\\2.pdf");
        CopyFileTask task3 = new CopyFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\pet.py", "C:\\Copy\\3.jar");
        CopyFileTask task4 = new CopyFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\Занятие 11 ДЗ2.docx", "C:\\Copy\\4.docx");
        task1.setFileCopyUtils(new CopyWithOneByte());
        task1.setFileCopyUtils(new CopyWithOneByte());
        task1.setFileCopyUtils(new CopyWithOneByte());
        task1.setFileCopyUtils(new CopyWithOneByte());

        Task task5 = new FindFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\", "java", System.out);
        Task task6 = new FindFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\", "docx", System.out);
        Task task7 = new FindFileTaskImpl("C:\\Users\\Avenue-6\\Downloads\\", "zip", System.out);
        Task task8 = new FindFileTaskImpl("C:\\Users\\Avenue-6\\Downloadwwwws\\", "java", System.out);

        TasksStorage storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task7);
        storage.add(task4);
        storage.add(task2);

        storage.add(task3);
        storage.add(task5);
        storage.add(task8);
        storage.add(task6);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();
        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();

    }
}
