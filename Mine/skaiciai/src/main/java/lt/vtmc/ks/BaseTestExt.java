package lt.vtmc.ks;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.test.BaseTest;

public class BaseTestExt extends BaseTest {
    @Override
    protected Exercises createExercises() {
        return new ExercisesImpl();
    }
}
