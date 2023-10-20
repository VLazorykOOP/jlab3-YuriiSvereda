public class Animal {
    protected int age;
    protected boolean sex;
    protected AnimalColoring coloring = null;
    protected AnimalClass animalClass = null;
    protected int limbsNumber;
    protected Area areaOfLiving;
    protected Habitat habitat = null;
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

    public void setLimbsNumber(int limbsNumber) throws Exception {
        if (limbsNumber >= 0) {
            this.limbsNumber = limbsNumber;
        } else {
            throw new Exception("invalid input");
        }
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(AnimalClass animalClass) {
        this.animalClass = animalClass;
        if (this.animalClass == AnimalClass.AMPHIBIANS ||
                this.animalClass == AnimalClass.REPTILES ||
                this.animalClass == AnimalClass.BIRDS ||
                this.animalClass == AnimalClass.FISH ||
                this.animalClass == AnimalClass.MAMMALS) {
            this.isVertebrate = true;
        } else {
            this.isVertebrate = false;
        }
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

    public void setAge(int age) throws Exception {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new Exception("invalid input");
        }
    }


    public Animal() {
        this.age = 0;
        this.sex = true;
        this.limbsNumber = 4;
        this.isPredator = false;
        this.ifCanSwim = false;
    }


    public void Show() {
        System.out.print("Class: ");
        if (this.animalClass != null) {
            System.out.println(this.animalClass.getDescription());
        } else {
            System.out.println("undefined");
        }
        System.out.print("its place of life ");
        if (this.areaOfLiving != null && this.habitat != null) {
            System.out.println(this.areaOfLiving.getDescription() + this.habitat.getDescription());
        } else if (this.areaOfLiving == null && this.habitat != null) {
            System.out.println(this.habitat);
        } else if (this.habitat == null && this.areaOfLiving != null) {
            System.out.println("undefined");
        }
        System.out.print("it has coloring ");
        if (this.coloring != null) {
            System.out.println(this.coloring.getDescription());
        } else {
            System.out.println("undefined");
        }
        System.out.println("Number of limbs: " + this.limbsNumber);
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

