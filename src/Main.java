//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MusicalInstrument saxophone  = new WindInstrument("saxophone", 1000);
        MusicalInstrument guitar = new StringInstrument ("guitar", 400);
        MusicalInstrument drums = new PercussionInstrument ("drums", 890);

        System.out.println(saxophone.play() + ": " + "it is a " + saxophone.getName () +  " and its price is " + saxophone.getPrice() + " euros");
        System.out.println(guitar.play() + ": " + "it is a " + guitar.getName () +  " and its price is " + guitar.getPrice()  + " euros");
        System.out.println (drums.play() + ": " + "it is a " + drums.getName () +  " and its price is " + drums.getPrice() + " euros");


    }
}