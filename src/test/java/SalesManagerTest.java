import org.junit.jupiter.api.*;

@DisplayName("Test SalesManager")
public class SalesManagerTest {
    private SalesManager manager;

    @BeforeEach
    @DisplayName("Start test")
    void setUP(){
        manager = new SalesManager(new long[]{2,10,30});
        System.out.println("Start test!");
    }

    @Test
    @DisplayName("Test maximum")
    void testMaximum(){
        Assertions.assertEquals(30,manager.max());
        System.out.println("Test maximum!");
    }

    @Test
    @DisplayName("Test minimum")
    void testMinimum(){
        Assertions.assertEquals(2,manager.min());
        System.out.println("Test minimum!");
    }

    @Test
    @DisplayName("Test medium")
    void testMedium(){
        Assertions.assertEquals(10,manager.medium());
        System.out.println("Test medium!");
    }

    @AfterEach
    @DisplayName("Test complete!")
    void setComplete(){
        System.out.println("Test completed!");
    }



}