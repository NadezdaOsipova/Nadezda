package com.home.service;

import com.home.model.Car;

import com.home.model.Engine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //подключили конструктор
public class CarServiceImpl implements CarService {
    private final Car car; //создали машину
    private final EngineService engineService;
    private final GasTankService gasTankService;


    //машина едет
    @Override
    public void go() {
        if (engineService.isRuning()) {
            car.setMoving(true);
            System.out.println("Машина поехала!");
        } else {
            System.out.println("Запустите двигатель!");
        }
    }

    //машина остановилась
    @Override
    public void stop() {
        if (isMoving()) {
            car.setMoving(false);
        }
    }


    //двигатель запущен
    @Override
    public void startEngine() {
        if (!engineService.isRuning() && !gasTankService.emptyGasTank()) {
            engineService.start();
            System.out.println("Можно ехать!Доброго пути!");
        } else if (engineService.isRuning()) {
            System.out.println("Двигатель уже запущен!");
        } else if (gasTankService.emptyGasTank()) {
            System.out.println("Проверьте уровень бензина. Дозаправьте бак!");
        }
    }

    //двигатель заглушен
    @Override
    public void stopEngine() {
        if (engineService.isRuning() && !car.isMoving()) {
            engineService.stop();
            System.out.println("Заглушите двигатель!");
        } else if (!engineService.isRuning()) {
            System.out.println("Двигатель не работает!");
        } else if (car.isMoving()) {
            System.out.println("Остановитесь и заглушите двигатель!");
        }
    }
//машина движется
        @Override
        public boolean isMoving () {
            return car.isMoving();
        }

    @Override
    public void refuelСar() {
        refuelСar.
    }
}


