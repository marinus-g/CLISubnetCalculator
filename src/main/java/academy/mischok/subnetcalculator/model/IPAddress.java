package academy.mischok.subnetcalculator.model;

public abstract class IPAddress {

    private final String address;

    protected IPAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
