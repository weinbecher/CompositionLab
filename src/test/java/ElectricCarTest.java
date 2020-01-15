import cars.CarType;
import cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.ElementType;

import static cars.CarType.ELECTRIC;
import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar tesla;

    @Before
    public void before(){
        tesla = new ElectricCar("Tesla", "black", 250, ELECTRIC, 42000,0);
    }

    @Test
    public void HasName(){
        assertEquals("Tesla",tesla.getName());
    }

    @Test
    public void HasColour(){
        assertEquals("black",tesla.getColour());
    }

    @Test
    public void HasEngine(){
        assertEquals(250,tesla.getEngine());
    }

    @Test
    public void HasCarType(){
        assertEquals(ELECTRIC,tesla.getCarType());
    }
    @Test
    public void HasValue(){
        assertEquals(42000,tesla.getValue());
    }
    @Test
    public void HasDamage(){
        assertEquals(0,tesla.getDamage());
    }
}
