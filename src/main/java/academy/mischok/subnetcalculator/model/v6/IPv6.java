package academy.mischok.subnetcalculator.model.v6;

import academy.mischok.subnetcalculator.exception.InvalidIp6Address;
import academy.mischok.subnetcalculator.model.IPAddress;

public class IPv6 extends IPAddress {
    public IPv6(String address) throws InvalidIp6Address {
        super(address);
    }
}
