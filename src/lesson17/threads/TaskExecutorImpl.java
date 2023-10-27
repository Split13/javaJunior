package lesson17.threads;

import org.apache.log4j.Logger;

public class TaskExecutorImpl extends Thread implements TaskExecutor{
    private static final Logger LOGGER = Logger.getLogger(TaskExecutorImpl.class);
    private TasksStorage storage;
    private boolean needStop = false;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        if(storage == null){
            throw new NullPointerException("storage == null");
        }

        this.storage = storage;

    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (!needStop){
            Task task = storage.get(); // вернёт или задачу или null
            LOGGER.debug(Thread.currentThread().getName() + " -- взяли задачу: " + task);
            if(task != null){
                try {
                    LOGGER.debug(Thread.currentThread().getName() + " -- задача выполнена успешно: " + task);
                    task.execute();

                } catch (TaskExecutionFailedException e) {
                    LOGGER.debug(Thread.currentThread().getName() + " -- не смог выполнить задачу: " + task);
                    if(task.getTryCount() < 5){
                        LOGGER.debug(Thread.currentThread().getName() + " -- возвращаю задачу обратно: " + task);
                        task.incTryCount();
                        storage.add(task);
                    }else {
                        LOGGER.debug(Thread.currentThread().getName() + " -- удаляю задачу, она не выполнима: " + task);
                    }

                }

            }else {
                LOGGER.debug(Thread.currentThread().getName() + " -- задачи закончились, иду спать!!!");
                needStop = true;

            }
        }
    }
}
