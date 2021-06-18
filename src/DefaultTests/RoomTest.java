package DefaultTests;
import org.junit.Test;
import com.company.Room;
import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
//import org.junit.jupiter.api.RepeatedTest;

public class RoomTest {


    @Test
    @DisplayName("Testing That Total Area Is Calculated Correctly")
    public void totalAreaTest() {
        ArrayList<Double> testWallAreas = new ArrayList<>();
        testWallAreas.add(10d);
        testWallAreas.add(15d);
        testWallAreas.add(7d);
        Room roomTest = new Room(testWallAreas,3,2);
        assertEquals(32, roomTest.getTotalArea(), 0.1); }

    @Test
    @DisplayName("Testing That Number Of Walls Is Set Correctly")
    public void wallNumTest() {
            ArrayList<Double> testWallAreas = new ArrayList<>();
            testWallAreas.add(10d);
            testWallAreas.add(15d);
            testWallAreas.add(7d);
            Room roomTest = new Room(testWallAreas,3,2);
        assertEquals(3, roomTest.getNumOfWalls(), 0.1); }

    @Test
    @DisplayName("Testing That Number Of Windows Is Set Correctly")
            public void windowNumTest() {
                ArrayList<Double> testWallAreas = new ArrayList<>();
                testWallAreas.add(10d);
                testWallAreas.add(15d);
                testWallAreas.add(7d);
                Room roomTest = new Room(testWallAreas,3,2);
            assertEquals(2, roomTest.getNumOfWindows(), 0.1);
        }
}