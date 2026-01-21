import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.logging.Logger;

public class SliderThread extends GraphicsProgram {

    private static final Logger log=Logger.getLogger(SliderThread.class.getName());

    @Override
    public void run() {
        add(new JButton("Push"),SOUTH);
        addActionListeners();
    }

    // Called whenever an action is performed
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        if(cmd.equals("Push")){
            // create a new slider
            Slider slider=new Slider(SIZE, rgen.nextColor());
            log.info("Inside Action Performed for Slider: "+slider);
            add(slider,0,rgen.nextInt(0,300));

            // run the slider on a new thread
            Thread thread=new Thread(slider);
            log.info("Inside Action Performed for Thread: "+thread);
            thread.start();
        }
    }

    /*constants*/
    private static final int SIZE=40;

    /*private instance variable*/
    private RandomGenerator rgen=RandomGenerator.getInstance();
}
