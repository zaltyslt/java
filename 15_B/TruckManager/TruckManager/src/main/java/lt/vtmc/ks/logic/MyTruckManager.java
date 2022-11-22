package lt.vtmc.ks.logic;

import lt.itakademija.exam.Packet;
import lt.itakademija.exam.Truck;
import lt.itakademija.exam.TruckManager;

import java.util.ArrayList;
import java.util.List;

public class MyTruckManager implements TruckManager {
    private List<Truck> trucks;
    private List<Packet> packets;

    public MyTruckManager() {
        this.trucks = new ArrayList<>();
        this.packets = new ArrayList<>();
    }

    @Override
    public Truck registerTruck(String id, int capacity) {
        if( (id != null ) && (!id.isEmpty()) ){
             if( (capacity  > 0) ){
                return new Truck(id, capacity);
             }
        }

        return null;
    }

    @Override
    public List<Truck> getTrucks() {
        return this.trucks;
    }

    @Override
    public Truck getTruckById(String truckId) {
        System.out.println(truckId);
        System.out.println(trucks.stream().filter(t -> t.getId().equalsIgnoreCase(truckId))
//                .findFirst()   .get()
             );

        return trucks.stream().filter(t -> t.getId().equalsIgnoreCase(truckId))
                .findFirst()
                .get();
    }

    @Override
    public Packet registerPacket(String packetId, int volume) {
        return new Packet(packetId, volume);
    }

    @Override
    public void assignTruck(Truck truck, Packet packet) {
        packet.assignTruck(truck);
    }

    @Override
    public List<Packet> getPackets(String truckId) {
        return packets;
    }

    @Override
    public int getTotalTruckCapacity() {
//        return accounts.stream().map(Account::getBalance).reduce(BigDecimal.ZERO,BigDecimal::add);
        return trucks.stream().map(Truck::getCapacity).reduce(0,Integer::sum);
    }
}
