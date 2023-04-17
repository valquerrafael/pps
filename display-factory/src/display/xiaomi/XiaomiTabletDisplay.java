package display.xiaomi;

import display.TabletDisplay;

public class XiaomiTabletDisplay extends TabletDisplay {

    public XiaomiTabletDisplay(double inches) {
        super(inches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um TABLET Xiaomi");
        features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for Redmi POCO X8";
    }

}
