public class animal {


    public class animal {

        public int legs;
        public String eyecolor;
        public Boolean tail;

        @Override
        public String toString() {
            return "animal{" +
                    "legs=" + legs +
                    ", eyecolor='" + eyecolor + '\'' +
                    ", tail=" + tail +
                    '}';
        }

        public animal(int legs, String eyecolor, Boolean tail) {


            this.legs = legs;
            this.eyecolor = eyecolor;
            this.tail = tail;
        }

        public String printAnimal () {
            return "This animal has " + this.legs + " legs";


        }
    }



}
