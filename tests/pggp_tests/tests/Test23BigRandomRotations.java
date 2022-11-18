package cp2022.tests.pggp_tests.tests;

import cp2022.tests.pggp_tests.utility.SimulationWithBugCheck;
import cp2022.tests.pggp_tests.utility.Test;
import cp2022.tests.pggp_tests.utility.Worker;

public class Test23BigRandomRotations extends Test {
    // Jest 100 stanowisk i 100 osób wchodzi i robi po 10 losowych switchy, po czym wychodzi.
    public Test23BigRandomRotations() {
        timeOfAuthor = 125L;
    }

    public boolean run(Boolean verbose) {
        Worker[] workers = new Worker[20];

        for (int i = 0; i < 20; i++) {
            workers[i] = workerRandomSwitches(i, 10, 100);
        }

        SimulationWithBugCheck wrapper =
                new SimulationWithBugCheck(100, 10, workers, verbose, false);
        return wrapper.start();
    }
}
