package refugeescode.at.piratesOfTheCursedBean.PiratesOftheCodeBean;

import org.springframework.stereotype.Component;

@Component
public class Compass {
    private CoursedCoin coursedCoin = new CoursedCoin();

     public String findDirectionOfCoursedCoin() {
        if( coursedCoin.isTheCoursedCoin()){
            return "coursedCoin";
        }
        return "Not found";
    }

}
