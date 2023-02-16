package pl.sdacademy.java.workbook.car;

public class Car {
    private String model;
    private int productionYear;
    private String color;
    private boolean used = false;
    private int mileage = 0;

    public int getMileage() {
        return mileage;
    }

    public void drive(int mileage) {
        this.mileage = this.mileage + mileage;
        if (this.mileage > 0)
            used = true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
