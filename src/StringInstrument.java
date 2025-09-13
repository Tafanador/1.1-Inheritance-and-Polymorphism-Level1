public class StringInstrument extends MusicalInstrument {

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public String play() {
        return "a string instrument is playing";


    }
}