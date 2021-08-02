package com.home.service;

import com.home.model.Car;

import static com.home.utils.EndingComputation.getEndingComputationCurrentLevel;

public class CarServiceImpl implements CarService {
    private final Car car; //создали машину
    private final EngineService engineService;
    private final GasTankService gasTankService;

    //подключаем конструктор
    public CarServiceImpl(Car car) {
        this.car = car;
        this.engineService = new EngineServiceImpl(car.getEngine());//задали двигатель
        this.gasTankService = new GasTankServiceImpl(car.getGasTank());//задали бак
    }

    //информация о машине
    @Override
    public void info() {
        System.out.println(car);
    }

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

    //машина в движении
    @Override
    public boolean isMoving() {
        return car.isMoving();
    }

    //машина остановилась
    @Override
    public void stop() {
        if (isMoving()) {
            car.setMoving(false);
        }
    }

    //двигатель работает
    @Override
    public boolean isEngineRunning() {
        return engineService.isRuning();
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

    //текущий уровень бензина в автомобиле
    @Override
    public void currentFuelLevel() {
        System.out.println("Текущий уровень топлива " + gasTankService.fuelLevel() + "литр" + getEndingComputationCurrentLevel(gasTankService.fuelLevel()));
    }

    //заправить автомобиль
    @Override
    public void refuelСar() {
        double refuelLevel = gasTankService.fuelLevel();
        System.out.println("Текущий уровень топлива " + refuelLevel + "литр" + getEndingComputationCurrentLevel(refuelLevel));
    }

}


