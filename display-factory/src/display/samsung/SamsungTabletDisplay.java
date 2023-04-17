package display.samsung;

import display.TabletDisplay;

public class SamsungTabletDisplay extends TabletDisplay {

    public SamsungTabletDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um TABLET Samsung");
        features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for Galaxy S8 Pro";
    }

}
