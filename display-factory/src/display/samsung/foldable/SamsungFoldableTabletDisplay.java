package display.samsung.foldable;

import display.FoldableTabletDisplay;

public class SamsungFoldableTabletDisplay extends FoldableTabletDisplay {

    public SamsungFoldableTabletDisplay(double unfoldedInches, double foldedInches) {
        super(unfoldedInches, foldedInches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um TABLET Samsung");
        features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for Galaxy Z Fold 4";
    }

}
