import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classLaptop.Laptop;

public class FilterLaptop {

        public static void main(String[] args) {
            List<Laptop> laptops = new ArrayList<>();
            laptops.add(new Laptop(8,100,"Windows","red"));
            laptops.add(new Laptop(8,500,"Windows","red"));
            laptops.add(new Laptop(32,1000,"Windows","blue"));
            laptops.add(new Laptop(8,100,"Linux","red"));
            laptops.add(new Laptop(32,300,"Linux","green"));
            laptops.add(new Laptop(16,200,"Mac","red"));


            Showmenu();

            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();

            Boolean flag = true;


            List<Laptop> filteredLaptops = new ArrayList<>();

            while(flag){
                
                flag = false;
                if(choice == 1){
                    System.out.print("Enter minimum ram: ");
                    int minram = scanner.nextInt();
                    System.out.print("Enter maximum ram: ");
                    int maxram = scanner.nextInt();
                    filteredLaptops = filterLaptopsram(laptops, minram, maxram);
                    System.out.println();
                }
                else if(choice == 2){
                    System.out.print("Enter minimum hdd: ");
                    int minhdd = scanner.nextInt();
                    System.out.print("Enter maximum hdd: ");
                    int maxhdd = scanner.nextInt();
                    filteredLaptops = filterLaptopshdd(laptops, minhdd, maxhdd);
                    System.out.println();
                }
                else if(choice == 3){
                    System.out.println("Enter system: Windows, Linux, Mac");
                    String systema = scanner.next();
                    filteredLaptops = filterLaptopsSys(laptops, systema);
                    System.out.println();
                }
                else if(choice == 4){
                    System.out.println("Enter color: red, blue, green");
                    String color = scanner.next();
                    filteredLaptops = filterLaptopsColor(laptops, color);
                    System.out.println();
                }
                else{
                    System.out.println("Yuo error :)");
                    flag = true;
                    Showmenu();
                    choice = scanner.nextInt();
                }
            }


            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }

        }

        public static List<Laptop> filterLaptopsram(List<Laptop> laptops, int minram, int maxram) {
            List<Laptop> filteredLaptops = new ArrayList<>();
            for (Laptop laptop : laptops) {
                if (laptop.getRam() >= minram && laptop.getRam() <= maxram) {
                    filteredLaptops.add(laptop);
                }
            }
            return filteredLaptops;
        }

        public static List<Laptop> filterLaptopshdd(List<Laptop> laptops, int minhdd, int maxhdd) {
            List<Laptop> filteredLaptops = new ArrayList<>();
            for (Laptop laptop : laptops) {
                if (laptop.getHdd() >= minhdd && laptop.getHdd() <= maxhdd) {
                    filteredLaptops.add(laptop);
                }
            }
            return filteredLaptops;
        }

        public static List<Laptop> filterLaptopsSys(List<Laptop> laptops, String sys) {
            List<Laptop> filteredLaptops = new ArrayList<>();
            for (Laptop laptop : laptops) {
                if (laptop.getSystema().equals(sys)) {
                    filteredLaptops.add(laptop);
                }
            }
            return filteredLaptops;
        }

        public static List<Laptop> filterLaptopsColor(List<Laptop> laptops, String color) {
            List<Laptop> filteredLaptops = new ArrayList<>();
            for (Laptop laptop : laptops) {
                if (laptop.getColor().equals(color)) {
                    filteredLaptops.add(laptop);
                }
            }
            return filteredLaptops;
        }

        public static void Showmenu() {
            System.out.print("Serch option menu select number\n");
            System.out.println("1 - Serch by ram");
            System.out.println("2 - Serch by hdd");
            System.out.println("3 - Serch by system");
            System.out.println("4 - Serch by color");
        }


}

