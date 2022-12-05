package lt.vtmc.ks;

import lt.itakademija.exam.*;
import lt.itakademija.exam.Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyWarehouse extends Warehouse {
    private int totalSpace;
    private int spaceReservedByClients;
    private int spaceInUseByClients;
    Map<Integer, Client> clients;

    public MyWarehouse(IdGenerator clientIdGenerator, IdGenerator packageIdGenerator, int totalSpace) {
        super(clientIdGenerator, packageIdGenerator, totalSpace);
        this.totalSpace = totalSpace;
        this.spaceReservedByClients = 0;
        this.spaceInUseByClients = 0;
         clients = new HashMap<>();

        if (totalSpace <= 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int getTotalSpace() {
//  Returns a total space that this warehouse has.
        return this.totalSpace;
    }

    @Override
    public int getAvailableSpace() {
    //totalSpace = totalSpace - reservedSpace;
        return getTotalSpace() - getReservedSpace();
    }

    @Override
    public int getTotalAvailableSpace() {
//   Total available space is computed counting all clients' packages' spaces and subtracting it from total space. That is:
//   totalAvailableSpace = totalSpace - sum(for each client sum(for each package space));
     return getTotalSpace() - this.spaceInUseByClients;
    }
    @Override
    public int getReservedSpace() {
    //Returns a number that represents a total reserved space by clients.
        return this.spaceReservedByClients;
    }

    @Override
    public Client registerClient(String name, int reservedSpace) {

        if(reservedSpace > 0) {
            if(reservedSpace > this.getAvailableSpace()){
                throw new InsufficientSpaceException("Not enough space");
            }
            this.spaceReservedByClients += reservedSpace;
            Client newClient = new Client(getClientIdGenerator().generateId(), name, reservedSpace);
            clients.put(newClient.getId(), newClient);
            return newClient;
        }else{
            throw new IllegalArgumentException();
        }

    }

    @Override
    public Package createPackage(String name, int space) {
        if (space <= 0) {
            throw new IllegalArgumentException();
        }
        return new Package(getPackageIdGenerator().generateId(), name, space);
    }

    @Override
    public void storePackage(Client client, Package aPackage) {
        if(aPackage.getSpace() <= client.getAvailableSpace() &&
                getTotalAvailableSpace() >= aPackage.getSpace()
            ){
            this.spaceInUseByClients += aPackage.getSpace();
            client.addPackage(aPackage);
        }else{
            throw new InsufficientSpaceException("Not enough space");
        }
    }

    @Override
    public Client getClientById(int id) {
        if(hasClientById(id)){
        return this.clients.get(id);
        }

        return null;
    }

    @Override
    public boolean hasClientById(int id) {
        return this.clients.containsKey(id);
    }

    @Override
    public List<Client> findClientsBy(ClientPredicate clientPredicate) {

        return this.clients.values().stream().filter(x->clientPredicate.test(x)).toList();
    }
}
