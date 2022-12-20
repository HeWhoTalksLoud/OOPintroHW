public class Main {
    public static void main(String[] args) {

        Car carGranta = new Car();
        Car carAudiA8 = new Car();
        Car carBMWZ8 = new Car();
        Car carKiaSportage = new Car();
        Car carHyundaiAvante = new Car();

        carGranta.setBrand("Lada");
        carGranta.setModel("Granta");
        carGranta.setProductionYear(2015);
        carGranta.setProductionCountry("Russia");
        carGranta.setColor("yellow");
        carGranta.setEngineVolume(1.7f);

        carAudiA8.setBrand("Audi");
        carAudiA8.setModel("A8 50 L TDI quattro");
        carAudiA8.setProductionYear(2020);
        carAudiA8.setProductionCountry("Germany");
        carAudiA8.setColor("black");
        carAudiA8.setEngineVolume(3.0f);

        carBMWZ8.setBrand("BMW");
        carBMWZ8.setModel("Z8");
        carBMWZ8.setProductionYear(2021);
        carBMWZ8.setProductionCountry("Germany");
        carBMWZ8.setColor("black");
        carBMWZ8.setEngineVolume(3.0f);

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