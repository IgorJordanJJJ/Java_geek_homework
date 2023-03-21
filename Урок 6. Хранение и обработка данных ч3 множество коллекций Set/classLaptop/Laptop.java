package classLaptop;

public class Laptop {

        private int ram;
        private int hdd;
        private String systema;
        private String color;


        public Laptop(int ram, int hdd, String systema, String color){
            this.ram = ram;
            this.hdd = hdd;
            this.systema = systema;
            this.color = color;
        }

        public int getRam() {
            return ram;
        }

        public int getHdd() {
            return hdd;
        }

        public String getColor() {
            return color;
        }

        public String getSystema() {
            return systema;
        }

        public String toString() {
            return "Laptop{" +
                    "RAM='" + ram + '\'' +
                    ", HDD='" + hdd + "Gb"+ '\'' +
                    ", systema=" + systema + '\'' +
                    ", color=" + color +
                    '}';
        }
}
