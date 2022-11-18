package cp2022.tests.pggp_tests.tests;

import cp2022.tests.pggp_tests.utility.SimulationWithBugCheck;
import cp2022.tests.pggp_tests.utility.Test;
import cp2022.tests.pggp_tests.utility.Worker;

public class Test27BigRandom3 extends Test {
    // Jest 100 pracowników, 10 stanowisk i każdy chce zrobić po 100 losowych akcji.
    public Test27BigRandom3() {
        timeOfAuthor = 1257L;
    }

    public boolean run(Boolean verbose) {
        Worker[] workers = new Worker[100];

        for (int i = 0; i < 100; i++) {
            workers[i] = workerRandomActions(i, 100, 10, 30);
        }

        SimulationWithBugCheck wrapper =
                new SimulationWithBugCheck(10, 1, workers, verbose, false);
        return wrapper.start();
    }
}
