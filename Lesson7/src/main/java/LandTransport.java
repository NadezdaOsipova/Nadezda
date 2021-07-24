
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor

public class LandTransport extends Transport { // наземный транспорт наследуется от транспорта
private int numberWheels; //количество колес
private int consumption; // Расход топлива(л/100км)
 }

