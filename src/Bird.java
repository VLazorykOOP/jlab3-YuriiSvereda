public class Bird extends Animal {
    private String breed;
    private boolean ifFlying;

    public Bird() {
        new Animal();
        this.animalClass=AnimalClass.BIRDS;
        this.limbsNumber = 4;
    }

    /*@Override
    public void setType(String type) {
        System.out.println("This field can't be changed");
    }*/

    @Override
    public void setLimbsNumber(int limbs_number) {
        System.out.println("This field can't be changed");
    }


}
