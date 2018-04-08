package refugeescode.at.piratesOfTheCursedBean.PiratesOftheCodeBean;

import org.springframework.stereotype.Component;

public class JackSparrow {
    private Compass compass = new Compass();


    public void search() {

        if (compass.findDirectionOfCoursedCoin().equalsIgnoreCase("coursedCoin")){
            System.out.println("Got It!!!!!!");
        }
        else
        System.out.println(("the compass is not working !!!"));

    }

}
