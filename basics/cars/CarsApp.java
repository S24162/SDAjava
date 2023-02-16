package pl.sdacademy.java.basics.cars;

public class CarsApp {
    public static void main(String[] args) {
        System.out.println();

        CarDealer vintageCarDealer = new CarDealer("Vintage");
        vintageCarDealer.setMaxProductionYear(1990);
        vintageCarDealer.setMinProductionYear(1910);
        vintageCarDealer.setMaxMileage(Integer.MAX_VALUE);

        CarDealer newCarDealer = new CarDealer("New");

        newCarDealer.addCar("BMW", "F 650 CS",
                2004, 34200, "7MI-4050");
        newCarDealer.addCar("Yamaha", "XT 660 Z",
                2014, 98500, "1BR-3411");
        newCarDealer.addCar("Aprilia", "Pegaso 650 Factory",
                2007, 45700, "3RZ-3327");
        newCarDealer.addCar("Honda", "VFR 800 V-tec",
                2004, 112000, "5ZA-2454");

        vintageCarDealer.addCar("Husqvarna", "TE 610",
                2006, 28300, "7RE-3334");
        vintageCarDealer.addCar("Beta", "300RR",
                2020,700,"2KR-6992");
        vintageCarDealer.addCar("MZ","ETZ250",
                1998,101500 ,"4WW-1767");
        vintageCarDealer.addCar("Dniepr" , "K650",
                1985, 11290, "МБ 1765");

        newCarDealer.printArrayOfCars();
        vintageCarDealer.printArrayOfCars();


//        vintageCarDealer.printArrayOfCars(vintageCarDealer.findCarsByMileage(10000,30000));
//        newCarDealer.printArrayOfCars(newCarDealer.findCarsByProductionYear(2000,2010));
//        newCarDealer.printArrayOfCars(newCarDealer.findCarsByBrandOrModel("xt"));
//        newCarDealer.printArrayOfCars(newCarDealer.findCarsByRegistrationNumber("33"));

    }
}
