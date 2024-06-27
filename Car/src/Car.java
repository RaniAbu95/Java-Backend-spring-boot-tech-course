

public class Car {
    private String plateNumber; //public / default
    private float height;
    private String engineType;
    private String carType;
    private boolean isAuthorized;

    public Car(String newCarType, String newPlateNumber)
    {
        this.setCarType(newCarType);
        setPlateNumber(newPlateNumber);
        System.out.println("Calling CTOR 1");
    }
    public Car (String newCarType, String newPlateNumber, float height)
    {
        /*this.setCarType(newCarType);
        this.setPlateNumber(newPlateNumber); */
        this(newCarType,newPlateNumber);
        this.setHeight(height);
        System.out.println("Calling CTOR 2");

    }

    public void drive(){
        System.out.println(plateNumber+" car is driving");
    }
    public void park()
    {
        System.out.println(plateNumber+" parked now");
    }

    public void stop()
    {
        System.out.println(plateNumber+" stopped");
    }

    public void grantAccess()
    {
        if(carType.equals("Fuel")) {
            isAuthorized = true;
        }
        else {
            isAuthorized = false;
        }
    }

    public void disableAccess()
    {
        isAuthorized = false;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    private void setPlateNumber(String plateNumber) {

        if(plateNumber.length()<=9 && plateNumber.length()>=7) {
            this.plateNumber = plateNumber;
        }

    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height<=0)
        {
            return;
        }
        this.height = height;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}