import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62);
    }
    @Test
    public void hasName(){
//        Bear bear = new Bear("Baloo", 25, 95.62); // here we are assigning, and running method underneath
        assertEquals("Baloo", bear.getName());
    }
    @Test
    public void hasAge(){
//        Bear bear = new Bear("Baloo", 25, 95.62);
        assertEquals(25, bear.getAge());
    }
    @Test
    public void hasWeight(){
//        Bear bear = new Bear("Baloo", 25, 95.62);
        assertEquals(95.62, bear.getWeight(), 0.01);
    }
    @Test
    public void readyToHibernateIfHeavierThan95(){
        assertEquals(true, bear.readyToHibernate());
    }
    @Test
    public void notReadyToHibernateIfLighterThan95(){
        Bear thinBear = new Bear("Jogi", 22, 70.20);
        assertEquals(false, thinBear.readyToHibernate());
    }
}
