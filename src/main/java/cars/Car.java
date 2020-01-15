package cars;


public abstract class Car {
    public String name;
    public String colour;
    public int engine;
    public CarType carType;
    public int value;
    public int damage;

    public Car(String name,String colour,int engine,CarType carType,int value, int damage){
        this.name = name;
        this.colour = colour;
        this.engine = engine;
        this.carType = carType;
        this.value = value;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
