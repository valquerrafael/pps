package display.samsung.foldable;

import display.FoldableSmartphoneDisplay;

public class SamsungFoldableSmartphoneDisplay extends FoldableSmartphoneDisplay {

    public SamsungFoldableSmartphoneDisplay(double unfoldedInches, double foldedInches) {
        super(unfoldedInches, foldedInches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para SMARTPHONE Samsung");
        features = getInches() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for Galaxy Y Fold 5";
    }

}
