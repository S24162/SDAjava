package pl.sdacademy.java.basics.cars;

public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private int mileage;
    private String registrationNumber;

    public static Car addCar(String brand, String model, int productionYear, int mileage, String registrationNumber) {
        return new Car(brand, model, productionYear, mileage, registrationNumber);
    }

    private Car(String brand, String model, int productionYear, int mileage, String registrationNumber) {
        setBrand(brand);
        setModel(model);
        setProductionYear(productionYear);
        setMileage(mileage);
        setRegistrationNumber(registrationNumber);
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }
    private void setModel(String model) {
        this.model = model;
    }
    private void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    private void setMileage(int mileage) {
        this.mileage = mileage;
    }
    private void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public int getMileage() {
        return mileage;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
