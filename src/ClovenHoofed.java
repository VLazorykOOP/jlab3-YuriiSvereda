public class ClovenHoofed extends Mammal {
    private boolean isHorned = false;
    private int tailLength = 0;
    private String ecosystemFeatures = null;

    public String getEcosystemFeatures() {
        return ecosystemFeatures;
    }

    public void setEcosystemFeatures(String ecosystemFeatures) {
        this.ecosystemFeatures = ecosystemFeatures;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) throws Exception {
        if (tailLength >= 0) {
            this.tailLength = tailLength;
        } else {
            throw new Exception("invalid input");
        }
    }

    public boolean isHorned() {
        return isHorned;
    }

    public void setHorned(boolean horned) {
        isHorned = horned;
    }

    public ClovenHoofed() {
        super();
        this.order = MammalsOrder.CLOVEN_HOOFED;
    }

    @Override
    public void setOrder(MammalsOrder order) {
        System.out.println("This field can't be changed");
    }

    @Override
    public void Show() {
        super.Show();
        if (this.isHorned) {
            System.out.println("it has a horns");
        } else {
            System.out.println("it has not horns");
        }
        if (this.tailLength > 0) {
            System.out.println("length of its tail: " + this.tailLength);
        } else {
            System.out.println("it doesn't have a tail:(");
        }
        if (this.ecosystemFeatures != null) {
            System.out.println("its ecosystem features is " + this.ecosystemFeatures);
        }
    }
}
