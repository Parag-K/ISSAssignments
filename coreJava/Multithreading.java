package coreJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedResource {
	// multiple thread access
    volatile int counter = 0;
    private final Object lockObject = new Object();

    public synchronized void synchronizedMethod() {
        // Synchronized method
        counter++;
    }

    public void nonSynchronizedMethod() {
        // Non-synchronized method 
        synchronized (lockObject) {
            counter++;
        }
    }
}

class IncrementTask implements Runnable {
    private final SharedResource sharedResource;

    IncrementTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        // Thread logic to increment the counter
        sharedResource.synchronizedMethod(); // Using synchronized method
        // sharedResource.nonSynchronizedMethod(); // Using synchronized block (alternate)

        System.out.println("Thread " + Thread.currentThread().getId() + " incremented the counter to: " + sharedResource.counter);
    }
}

public class Multithreading{
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        int numberOfThreads = 6;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            // Creating and submitting tasks to the thread pool
            Runnable task = new IncrementTask(sharedResource);
            executor.submit(task);
        }

        // Shutting down the thread pool
        executor.shutdown();
    }
}
