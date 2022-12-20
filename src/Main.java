public class Main {
    public static void main(String[] args) {

        Car carGranta = new Car("Lada", "", 1.7f,
                "yellow", -2, "Russia");
        Car carAudiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                null, 2015, "Germany");
        Car carBMWZ8 = new Car("", "Z8", 0, "black",
                2021, "Germany");
        Car carKiaSportage = new Car("Kia", "Sportage", 0,
                "red", 2018, null);
        Car carHyundaiAvante = new Car("Hyundai", "Avante", 1.6f,
                "", 0, "South Korea");


        System.out.println(carGranta);
        System.out.println(carAudiA8);
        System.out.println(carBMWZ8);
        System.out.println(carKiaSportage);
        System.out.println(carHyundaiAvante);
    }
}