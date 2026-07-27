import java.util.concurrent.Semaphore;

class DiningPhilosophers {
    
    // Array of semaphores representing the 5 forks
    private Semaphore[] forks;

    public DiningPhilosophers() {
        forks = new Semaphore[5];
        // Initialize each fork with 1 permit (meaning only one philosopher can hold it at a time)
        for (int i = 0; i < 5; i++) {
            forks[i] = new Semaphore(1);
        }
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        
        // Define the IDs of the left and right forks for the current philosopher
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;
        
        // Asymmetric Lock Acquisition to prevent deadlock:
        // If all philosophers pick up their left fork simultaneously, they will deadlock waiting for the right.
        // We break this circular wait by making one philosopher (e.g., ID 4) pick up the right fork first.
        if (philosopher == 4) {
            forks[rightFork].acquire();
            forks[leftFork].acquire();
        } else {
            forks[leftFork].acquire();
            forks[rightFork].acquire();
        }
        
        // Critical Section: philosopher has both forks and can eat
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();
        
        // Release both forks so adjacent philosophers can eat
        forks[leftFork].release();
        forks[rightFork].release();
    }
}
