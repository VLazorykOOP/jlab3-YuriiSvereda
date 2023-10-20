public class Bird extends Animal {
    private String breed = null;
    private boolean isFlying;
    private int wingspan;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws Exception{
        if(maxSpeed>=0){
            this.maxSpeed = maxSpeed;
        }else{
            throw new Exception("invalid input");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) throws Exception{
        if(wingspan>=0){
            this.maxSpeed = wingspan;
        }else{
            throw new Exception("invalid input");
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Bird() {
        super();
        this.animalClass=AnimalClass.BIRDS;
        this.limbsNumber = 4;
        this.maxSpeed=1;
        this.isFlying=true;
        this.wingspan=1;
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
    public void Show(){
        super.Show();
        System.out.print("its breed: ");
        if(this.breed!=null){
            System.out.println(this.breed);
        }else{
            System.out.println("undefine");
        }
        if(this.isFlying){
            System.out.println("it can fly");
        }else{
            System.out.println("it can't fly");
        }
        System.out.println("its maximal speed: "+this.maxSpeed);
        System.out.println("its wingspan: "+this.wingspan);
    }
}
