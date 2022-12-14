package lt.vtmc;

import lt.vtvpmc.java.imperial.AbstractCubeTest;
import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class CubeTest extends AbstractCubeTest {

    @Override
    protected MetricCube adapt(ImperialCube imperialCube) {
        return new MyMetricCube(imperialCube);
    }
}
