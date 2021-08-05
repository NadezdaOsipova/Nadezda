package com.home.models;
import com.home.enums.TransportType;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.home.enums.TransportType.FREIGHT;

@Getter
@Setter
@SuperBuilder
public class FleightLandTransport extends LandTransport{ //грузовой траспорт, наследуется от класса LandTransport
    private double carryingCapacity;//грузоподьемность (т)

    public FleightLandTransport(double power, double maxSpeed, double weight, String brand, double carryingCapacity) {
        super(power, maxSpeed, weight, brand);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public TransportType getType() {
        return FREIGHT;
    }

    @Override
    public String toString() {
        return super.toString() +
                " FreightTransport{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }


}
