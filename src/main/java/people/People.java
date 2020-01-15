package people;

import behaviour.IBuy;
import cars.Car;

import java.util.HashMap;
import java.util.Map;

public abstract class People implements IBuy {
    public String name;
    public int money;
    public HashMap<String, Integer> carCollections;

    public People(String name, int money) {
        this.name = name;
        this.money = money;
        this.carCollections = new HashMap<String, Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public HashMap<String, Integer> getCarCollections() {
        return carCollections;
    }

    public void setCarCollections(HashMap<String, Integer> carCollections) {
        this.carCollections = carCollections;
    }

    public void add(Car car) {

        if (carCollections.containsKey(car.getName())) {
            int count = carCollections.get(car.getName());
            carCollections.put(car.getName(), count + 1);
        } else {
        carCollections.put(car.getName(), 1);
        }
    }

    public int countCar(){
        int count = 0;
        for (Map.Entry<String, Integer> car : carCollections.entrySet()) {
            count += car.getValue();
        }
        return count;
    }

    public void buy(Car car){

        this.add(car);
        int carPrice = car.getValue() - car.getDamage();
        this.money -= carPrice;

    }



}