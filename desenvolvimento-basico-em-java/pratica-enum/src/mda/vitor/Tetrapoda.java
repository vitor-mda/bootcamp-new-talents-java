package mda.vitor;

public enum Tetrapoda {
    AMPHIBIA(0, "Amphibians", 8351),
    MAMMALIA(1, "Mammals", 6495),
    AVES(2, "Birds", 10279),
    REPTILIA(3, "Reptiles", 7750);

    private final int index;
    private final String name;
    private final int speciesNumber;
    private final String[] examples;

    public final int getIndex() {
        return index;
    }

    public final String getName() {
        return name;
    }

    public final int getSpeciesNumber() {
        return speciesNumber;
    }

    public final String[] getExamples() {
        return examples;
    }

    Tetrapoda(final int index, final String name, final int speciesNumber) {
        this.index = index;
        this.name = name;
        this.speciesNumber = speciesNumber;

        final String[][] exampleList = {
                {"Mantella baroni", "Bombina bombina", "Ambystoma maculatum", "Ambystoma mexicanum"},
                {"Desmodus rotundus", "Ailuropoda melanoleuca", "Sarcophilus harrisii", "Megaptera novaeangliae"},
                {"Pavo cristatus", "Balaeniceps rex", "Casuarius casuarius", "Trichoglossus moluccanus"},
                {"Hemidactylus turcicus", "Alligator mississippiensis", "Draco spilonotus", "Varanus komodoensis"}
        };

        examples = exampleList[index];
    }
}
