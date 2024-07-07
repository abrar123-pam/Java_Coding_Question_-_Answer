package SWIGGY;

import javax.crypto.SecretKey;
import java.io.Serializable;

public class Delivery implements Serializable {

    private String deliveryName;
    private String deliveryPhoneNumber;
    private String deliveryAddress;
    private String bikeNumber;
    private String licenseNumber;

    public Delivery(String deliveryName, String deliveryPhoneNumber, String deliveryAddress, String bikeNumber, String licenseNumber){
        this.deliveryName = deliveryName;
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.bikeNumber = bikeNumber;
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }
}
