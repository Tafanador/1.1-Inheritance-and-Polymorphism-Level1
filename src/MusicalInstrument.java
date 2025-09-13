public  abstract class MusicalInstrument {

      static {
          System.out.println(" The instrument has been loaded");
      }


            public abstract String play();


            private String name;
            private double price;


    public MusicalInstrument(String name, double price){
                this.name = name;
                this.price = price;



            }

            public String getName () {
                return name;


            }


            public double getPrice () {
                return price;

            }


        }


