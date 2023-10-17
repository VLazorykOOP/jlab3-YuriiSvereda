public class Animal {
    protected int age;
    protected boolean sex;
    protected AnimalColoring coloring;
    protected AnimalClass animalClass;
    protected int limbsNumber;
    protected Area areaOfLiving;
    protected Habitat habitat;
    protected boolean isPredator;
    protected boolean ifCanSwim;
    private boolean isVertebrate;

    public boolean isIfCanSwim() {
        return ifCanSwim;
    }

    public void setIfCanSwim(boolean ifCanSwim) {
        this.ifCanSwim = ifCanSwim;
    }

    public boolean isVertebrate() {
        return isVertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        isVertebrate = vertebrate;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Area getAreaOfLiving() {
        return areaOfLiving;
    }

    public void setAreaOfLiving(Area areaOfLiving) {
        this.areaOfLiving = areaOfLiving;
    }

    public int getLimbsNumber() {
        return limbsNumber;
    }

    public void setLimbsNumber(int limbsNumber) {
        this.limbsNumber = limbsNumber;
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(AnimalClass animalClass) {
        this.animalClass = animalClass;
    }

    public AnimalColoring getColoring() {
        return coloring;
    }

    public void setColoring(AnimalColoring coloring) {
        this.coloring = coloring;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Animal() {
        this.age = 0;
        this.sex = true;
        this.limbsNumber = 4;
        this.isPredator = false;
        this.ifCanSwim = false;
    }


    public void Show() {
        System.out.println("Class" + this.animalClass.getDescription());
        System.out.println("it live" + this.areaOfLiving.getDescription() + this.habitat.getDescription());
        System.out.println("it has" + this.coloring.getDescription());
        System.out.println("Number of limbs:" + this.limbsNumber);
        if (this.isPredator) {
            System.out.println("it eats meat");
        } else {
            System.out.println("it eats grass");
        }
        if (this.ifCanSwim) {
            System.out.println("it can swim");
        } else {
            System.out.println("it like a piece of metal");
        }
        if (this.sex) {
            System.out.println("Sex: male");
        } else {
            System.out.println("Sex: female");
        }
        System.out.println("Age:" + this.age);
    }
}

