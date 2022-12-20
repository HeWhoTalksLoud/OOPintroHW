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
}
