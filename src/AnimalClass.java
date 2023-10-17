public enum AnimalClass {
    FISH("fish"), AMPHIBIANS("amphibian"), REPTILES("reptile"), BIRDS("bird"), MAMMALS("mammal"),
    MOLLUSKS("mollusk"), WORMS("worm"), ARTHROPODS("arthropod"), STINGING("stinfing"), NEEDLE_LIKE("needle-like"), SPONGES("sponge");
    private final String description;

    AnimalClass(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
