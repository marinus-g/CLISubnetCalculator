package academy.mischok.subnetcalculator.model;

public abstract class Subnet<T extends IPAddress> {

    private final T subnetMask;
    private final int index;
    private final T networkAddress;
    private final T[] addresses;
    private T[] hostAddresses;
    private final T broadcastAddress;
    private final T firstHostAddress;
    private final T lastHostAddress;

    protected Subnet(T subnetMask, int index, T networkAddress) {
        this.subnetMask = subnetMask;
        this.index = index;
        this.networkAddress = networkAddress;
        this.addresses = this.calculateAddresses();
        this.firstHostAddress = this.addresses[1];
        this.broadcastAddress = this.addresses[this.addresses.length - 1];
        this.lastHostAddress = this.addresses[this.addresses.length - 2];
        System.arraycopy(this.addresses, 1, this.hostAddresses, 0, this.addresses.length - 2);
    }

    public abstract T[] calculateAddresses();

}
