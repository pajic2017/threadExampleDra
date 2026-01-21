import java.util.logging.Logger;


public class Main {

    private static final Logger log=Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        SliderThread sliderThread=new SliderThread();
        log.info("Inside main() method");
        sliderThread.start();
    }
}
