import acm.graphics.GRect;

import java.awt.*;
import java.util.logging.Logger;

public class Slider extends GRect implements Runnable {

    private static final Logger log=Logger.getLogger(Slider.class.getName());

    public Slider(int size, Color color){
        super(size,size);
        setFilled(true);
        setColor(color);
         log.info("Inside Slider constructor");
    }


    @Override
    public void run(){
        // animate a slide across the screen
        for(int i=0;i<1000/STEP;i++){
            pause(40);
            move(STEP,0);
        }
    }

    /*constants*/
    private static double STEP=5.0;
}
