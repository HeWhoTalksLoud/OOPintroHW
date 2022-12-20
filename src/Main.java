public class Main {
    public static void main(String[] args) {

        Car carGranta = new Car("Lada", "Granta", 1.7f,
                "yellow", 2015, "Russia");
        Car carAudiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                "black", 2015, "Germany");
        Car carBMWZ8 = new Car("BMW", "Z8", 3.0f, "black",
                2021, "Germany");
        Car carKiaSportage = new Car("Kia", "Sportage", 2.4f,
                "red", 2018, "South Korea");
        Car carHyundaiAvante = new Car("Hyundai", "Avante", 1.6f,
                "orange", 2016, "South Korea");


        System.out.println(carGranta);
        System.out.println(carAudiA8);
        System.out.println(carBMWZ8);
        System.out.println(carKiaSportage);
        System.out.println(carHyundaiAvante);
    }
}