import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedInputStream;

public class Tests {
    public static void task1() {
        Animal gargon = new Animal();
        Bird chijik = new Bird();
        Mammal mursik = new Mammal();
        ClovenHoofed abraham = new ClovenHoofed();
        gargon.setAnimalClass(AnimalClass.STINGING);
        try {
            gargon.setAge(1);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        try {
            gargon.setLimbsNumber(7);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        gargon.setHabitat(Habitat.UNDERWATER);
        gargon.setColoring(AnimalColoring.TRANSPARENT);
        gargon.setAreaOfLiving(Area.SOULT_WATER);

        try {
            chijik.setAge(3);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        chijik.setBreed("Crow");
        chijik.setHabitat(Habitat.TREES);
        try {
            chijik.setMaxSpeed(42);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        try {
            chijik.setWingspan(133);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        chijik.setAreaOfLiving(Area.CITY);
        chijik.setPredator(true);

        try {
            mursik.setAge(8);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        try {
            mursik.setMaxSpeed(31);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        mursik.setColoring(AnimalColoring.CAMOUFLAGE);
        mursik.setHabitat(Habitat.HOUSE);
        mursik.setPredator(true);
        mursik.setOrder(MammalsOrder.CARNIVORES);
        mursik.setAreaOfLiving(Area.CITY);
        mursik.setIfCanSwim(false);

        try {
            abraham.setAge(28);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        abraham.setColoring(AnimalColoring.MONOCHROME);
        abraham.setHorned(false);
        try {
            abraham.setTailLength(49);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        abraham.setAreaOfLiving(Area.DESERT);
        abraham.setHabitat(Habitat.GROUND);
        abraham.setPredator(false);
        abraham.setIfCanSwim(false);
        try {
            abraham.setMaxSpeed(67);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        List<Animal> zoo = new ArrayList<>();
        zoo.add(gargon);
        zoo.add(chijik);
        zoo.add(mursik);
        zoo.add(abraham);
        for (Animal an :
                zoo) {
            an.Show();
            System.out.println();
        }
    }
}
