import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car carGranta = new Car("Lada", "", 1.7f,
                "yellow", -2, "Russia", "manual",
                "", "34 asd 1235", 5, false);
        Car carAudiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                null, 2015, "Germany", "automatic",
                "coupe", "22 asdf", 2, true);
        Car carBMWZ8 = new Car("", "Z8", -5, "black",
                2021, "Germany", "automatic",
                "van", "456", 8, true);
        Car carKiaSportage = new Car("Kia", "Sportage", 0,
                "red", 2018, null, "manual",
                "limo", "ff 111 ff", 12, false);
        Car carHyundaiAvante = new Car("Hyundai", "Avante", 1.6f,
                "", 0, "South Korea", "manual",
                null, "", 4, false);


        System.out.println(carGranta);
        System.out.println(carAudiA8);
        System.out.println(carBMWZ8);
        System.out.println(carKiaSportage);
        System.out.println(carHyundaiAvante);

        carKiaSportage.setLicensePlate("78 ооо rus");
        carHyundaiAvante.setColor("beige");
        carHyundaiAvante.changeTires();

        System.out.println();
        System.out.println(carKiaSportage);
        System.out.println(carHyundaiAvante);

        Car.Key keyGranta = carGranta.new Key(false, false);
        Car.Key keyZ8 = carBMWZ8.new Key(true, true);

        System.out.println();
        System.out.println(keyGranta);
        System.out.println(keyZ8);
    }
}