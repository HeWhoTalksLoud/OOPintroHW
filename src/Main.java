public class Main {
    public static void main(String[] args) {

        Car carGranta = new Car("Lada", "Granta", 1.7f,
                "yellow", 2015, "Russia");
        Car carAudiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                "black", 2015, "Germany");
        Car carBMWZ8 = new Car("BMW", "Z8", 3.0f, "black",
                2021, "Germany");
        Car carKiaSportage = new Car();
        Car carHyundaiAvante = new Car();



        carKiaSportage.setBrand("Kia");
        carKiaSportage.setModel("Sportage");
        carKiaSportage.setProductionYear(2018);
        carKiaSportage.setProductionCountry("South Korea");
        carKiaSportage.setColor("red");
        carKiaSportage.setEngineVolume(2.4f);

        carHyundaiAvante.setBrand("Hyundai");
        carHyundaiAvante.setModel("Avante");
        carHyundaiAvante.setProductionYear(2016);
        carHyundaiAvante.setProductionCountry("South Korea");
        carHyundaiAvante.setColor("orange");
        carHyundaiAvante.setEngineVolume(1.6f);


        System.out.println(carGranta);
        System.out.println(carAudiA8);
        System.out.println(carBMWZ8);
        System.out.println(carKiaSportage);
        System.out.println(carHyundaiAvante);
    }
}