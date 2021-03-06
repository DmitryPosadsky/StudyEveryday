package dev.posadskiy.springdi.performers;

import dev.posadskiy.springdi.poems.Poem;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws IllegalArgumentException {
        super.perform();
        System.out.println("Waiting for speech...");
        poem.recite();
    }
}
