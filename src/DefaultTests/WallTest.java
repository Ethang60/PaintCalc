package DefaultTests;
import org.junit.Test;
import com.company.Wall;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.RepeatedTest;

public class WallTest {

    Wall wallTest = new Wall(4, 5, false);


    @Test
    @DisplayName("Testing That Wall Width Are Set Correctly")
    public void wallTestWidth() { assertEquals(4, wallTest.getWidth(), 0.1); }

    @Test
    @DisplayName("Testing That Wall Height Are Set Correctly")
    public void wallTestHeight() { assertEquals(5, wallTest.getHeight(), 0.1); }

    @Test
    @DisplayName("Testing That Wall Area Is Calculated Correctly")
    public void wallTestArea() { assertEquals(20, wallTest.getArea(), 0.1); }

    @Test
    @DisplayName("Creating A Blank Wall And Appending To It")
    public void createTest() {
        Wall wallTest = new Wall();
        wallTest.setHeight(10);
        wallTest.setWidth(5);
        wallTest.setArea(wallTest.getWidth()* wallTest.getHeight());
        assertEquals(50, wallTest.getArea(), 0.1);

    }

}