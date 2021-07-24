package com.home.models;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FleightLandTransport extends LandTransport{ //грузовой траспорт, наследуется от класса LandTransport
    private double carryingCapacity;//грузоподьемность (т)

    public FleightLandTransport(double power, double maxSpeed, double weight, String brand, double carryingCapacity) {
        super(power, maxSpeed, weight, brand);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " FreightTransport{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }
}
