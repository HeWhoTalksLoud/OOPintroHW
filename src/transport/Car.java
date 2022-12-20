package transport;

public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    public String getBrand() {
        return brand;
    }

    public Car(String brand, String model, float engineVolume, String color,
               int productionYear, String productionCountry) {
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
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год производства: " + productionYear +
                ", страна сборки: " + productionCountry;
    }
} // transport.Car
