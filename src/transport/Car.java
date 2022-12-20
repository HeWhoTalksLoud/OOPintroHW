package transport;

import java.time.LocalDate;

public class Car {

    public class Key {
        private final boolean hasKeylessAccess;
        private final boolean hasRemoteStart;

        public Key(boolean hasKeylessAccess, boolean hasRemoteStart) {
            this.hasKeylessAccess = hasKeylessAccess;
            this.hasRemoteStart = hasRemoteStart;
        }

        @Override
        public String toString() {
            return "Бесключевой доступ: " + (hasKeylessAccess ? "да" : "нет") +
                    ", удаленный запуск: " + (hasRemoteStart ? "да" : "нет");
        }
    } // Car.Key

    public class Insurance {

        private final LocalDate validDate;
        private final int price;
        private final String number;

        public Insurance(LocalDate validDate, int price, String number) {
            if (validDate == null) {
                this.validDate = LocalDate.now().plusYears(2);
            }
            else this.validDate = validDate;

            if (price <= 0) this.price = 10_000;
            else this.price = price;

            if (number == null || number.equals("")) this.number = "123456789";
            else this.number = number;
        }

        public boolean isValid() {
            return LocalDate.now().isBefore(validDate);
        }

        public boolean isNumberCorrect() {
            return number.length() == 9;
        }

        @Override
        public String toString() {
            return "Действительна до: " + validDate +
                    ", стоимость: " + price +
                    ", номер:" + number;
        }
    } // Car.Insurance

    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearbox;
    private final String bodyType;
    private String licensePlate;
    private final int seatsNumber;
    private boolean areWinterTires;



    public Car(String brand, String model, float engineVolume, String color, int productionYear,
               String productionCountry, String gearbox, String bodyType, String licensePlate,
               int seatsNumber, boolean areWinterTires) {
        if (brand == null || brand.equals("")) this.brand = "default";
        else this.brand = brand;

        if (model == null || model.equals("")) this.model = "default";
        else this.model = model;

        if (productionCountry == null || productionCountry.equals("")) {
            this.productionCountry = "default";
        }
        else this.productionCountry = productionCountry;

        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;

        if (color == null || color.equals("")) this.color = "white";
        else this.color = color;

        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;

        if (gearbox == null || gearbox.equals("")) this.gearbox = "manual";
        else this.gearbox = gearbox;

        if (bodyType == null || bodyType.equals("")) this.bodyType = "sedan";
        else this.bodyType = bodyType;

        if (licensePlate == null || licensePlate.equals("")) this.licensePlate = "default";
        else this.licensePlate = licensePlate;

        if (seatsNumber <= 0) this.seatsNumber = 4;
        else this.seatsNumber = seatsNumber;

        this.areWinterTires = areWinterTires;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) this.color = "white";
        else this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }

    public void changeTires() {
        setAreWinterTires(LocalDate.now().getMonthValue() > 11 ||
                LocalDate.now().getMonthValue() < 3);
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        if (gearbox == null || gearbox.equals("")) this.gearbox = "manual";
        else this.gearbox = gearbox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if (licensePlate == null || licensePlate.equals("")) this.licensePlate = "default";
        else this.licensePlate = licensePlate;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isAreWinterTires() {
        return areWinterTires;
    }

    public void setAreWinterTires(boolean areWinterTires) {
        this.areWinterTires = areWinterTires;
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год производства: " + productionYear +
                ", страна сборки: " + productionCountry + "\n" +
                "коробка передач: " + gearbox +
                ", тип кузова: " + bodyType +
                ", рег. номер: " + licensePlate +
                ", кол-во мест: " + seatsNumber + "\n" +
                "зимняя резина: " + (areWinterTires ? "да":"нет");
    }
} //  transport.Car
