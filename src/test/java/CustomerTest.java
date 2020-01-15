import cars.Car;
import cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;
import people.Customer;

import static cars.CarType.ELECTRIC;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer Yousef;
    Car tesla;

    @Before
    public void before(){
        Yousef = new Customer("Yousef",10000000);
        tesla = new ElectricCar("Tesla", "black", 250, ELECTRIC, 42000,0);


    }

    @Test
    public void canGetName() {
        assertEquals("Yousef",Yousef.getName());
    }

    @Test
    public void canGetmoney() {
        assertEquals(10000000,Yousef.getMoney());
    }

    @Test
    public void canGetCollection(){
        assertEquals(0,Yousef.getCarCollections().size());
    }

    @Test
    public void canAddCollection(){
        Yousef.add(tesla);
        Yousef.add(tesla);
        assertEquals(2,Yousef.countCar());
    }


    @Test
    public void canBuy(){
        Yousef.buy(tesla);
        Yousef.buy(tesla);
        assertEquals(2,Yousef.countCar());
        assertEquals(9916000, Yousef.getMoney());
    }

}



