package lt.vtmc.ks.test;

import lt.itakademija.exam.TruckManager;
import lt.itakademija.exam.test.BaseTest;
import lt.vtmc.ks.logic.MyTruckManager;

public class MyBaseTest extends BaseTest {
    @Override
    protected TruckManager createTransportManager() {
        return new MyTruckManager();
    }
}
