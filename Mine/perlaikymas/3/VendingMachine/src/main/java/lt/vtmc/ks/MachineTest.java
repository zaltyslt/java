/**
 * Unit testai
 */
package lt.vtmc.ks;

import lt.vtvpmc.vending.machine.BaseVendingMachineTest;
import lt.vtvpmc.vending.machine.VendingMachine;

/**
 * programos "vidinių" testų paleidimas
 */
public class MachineTest extends BaseVendingMachineTest {

    @Override
    /**
     * Sukuria NewVendingMachine objektą testavimui
     * @return NewVendingMachine objektas
     */
    protected VendingMachine getNewVendingMachine() {
        return new NewVendingMachine();
    }
}
