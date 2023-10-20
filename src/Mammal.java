public class Mammal extends Animal {
    protected int maxSpeed;
    protected MammalsOrder order = null;
    private String specialFeatures = null;

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public MammalsOrder getOrder() {
        return order;
    }

    public void setOrder(MammalsOrder order) {
        this.order = order;
        if (this.order == MammalsOrder.BATS ||
                this.order == MammalsOrder.INSECTIVORES ||
                this.order == MammalsOrder.CARNIVORES ||
                this.order == MammalsOrder.PINNIPEDS ||
                this.order == MammalsOrder.CETACEANS) {
            this.isPredator = true;
        } else {
            this.isPredator = false;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws Exception {
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new Exception("invalid input");
        }
    }

    public Mammal() {
        super();
        this.animalClass = AnimalClass.MAMMALS;
        this.limbsNumber = 4;
        this.maxSpeed = 1;

    }

    @Override
    public void setAnimalClass(AnimalClass animalClass) {
        System.out.println("This field can't be changed");
    }

    @Override
    public void setLimbsNumber(int limbs_number) {
        System.out.println("This field can't be changed");
    }

    @Override
    public void Show() {
        super.Show();
        System.out.print("Order: ");
        if (this.order != null) {
            System.out.println(this.order.getDescription());
        } else {
            System.out.println("undefined");
        }
        System.out.println("its maximal speed: " + this.maxSpeed);
        if (this.specialFeatures != null) {
            System.out.println("its special features: " + this.specialFeatures);
        }
    }
}
