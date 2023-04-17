package display.xiaomi.foldable;

import display.FoldableTabletDisplay;

public class XiaomiFoldableTabletDisplay extends FoldableTabletDisplay {

    public XiaomiFoldableTabletDisplay(double unfoldedInches, double foldedInches) {
        super(unfoldedInches, foldedInches);
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um TABLET Xiaomi");
        features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for Redmi POCO Fold X2";
    }

}
