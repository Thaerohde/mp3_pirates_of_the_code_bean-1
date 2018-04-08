package refugeescode.at.piratesOfTheCursedBean.PiratesOftheCodeBean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    private Compass compass = new Compass();
    private CoursedCoin coursedCoin = new CoursedCoin();


    @Test
    void findDirectionOfCoursedCointest() {
        String result = compass.findDirectionOfCoursedCoin();
        Assertions.assertEquals(result ,"coursedCoin");

        Assertions.assertEquals(coursedCoin.isTheCoursedCoin(),true);

    }

}