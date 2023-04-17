package display.apple;

import display.TabletDisplay;

public class AppleTabletDisplay extends TabletDisplay {

    public AppleTabletDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um TABLET Apple");
        features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for iPad PRO Antireflective";
    }

}
