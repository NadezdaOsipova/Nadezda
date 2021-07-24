public interface Transportable {
    default double detPower(double power) {
        return power * 0.74; //Расчёт мощности в киловаттах
    }
}
