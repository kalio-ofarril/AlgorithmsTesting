package Utils.Objects;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest extends TestCase {

    private Circle circle;

    //Será ejecutado antes de todos los test
    @Before
    public void setUp() throws Exception {
        circle = new Circle(1.0);
    }

    @Test
    public void compareTo() {
    }

    @Test
    public void testGetRadius() {
        Assert.assertTrue(circle.getRadius() == 1.0);
    }

}