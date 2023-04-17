package display;

public abstract class FoldableDisplay extends Display {

    private double unfoldedInches;
    private double foldedInches;
    private boolean isFolded = false;

    public FoldableDisplay(double unfoldedInches, double foldedInches) {
        super(unfoldedInches);
        this.unfoldedInches = unfoldedInches;
        this.foldedInches = foldedInches;
    }

    public void fold() {
        this.isFolded = !this.isFolded;

        if (isFolded)
            this.inches = this.foldedInches;
        else
            this.inches = this.unfoldedInches;
    }

}
