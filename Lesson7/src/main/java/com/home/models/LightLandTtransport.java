package com.home.models;
import com.home.enums.TransportType;
import lombok.Getter;
import lombok.Setter;
import static com.home.enums.TransportType.LIGHT;

@Getter
@Setter
public class LightLandTtransport extends LandTransport {    // легковой траспорте, наследуется от класса LandTranspotr
    private String bodyType; //тип кузова
    private String numberPassengers; //количество пассажиров

    public LightLandTtransport(double power, double maxSpeed, double weight, String brand, String bodyType, String numberPassengers) {
        super(power, maxSpeed, weight, brand);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    @Override
    public TransportType getType() {
        return LIGHT;
    }

    @Override
    public String toString() {
        return super.toString() +
                " LightTtransport{" +
                "bodyType='" + bodyType + '\'' +
                ", numberPassengers='" + numberPassengers + '\'' +
                '}';
    }
}
