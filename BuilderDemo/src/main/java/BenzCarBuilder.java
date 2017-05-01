/**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

public class BenzCarBuilder extends CarBuilder {
    private Car benzCar = new BenzCar();

    @Override
    public void buildEngine() {
        benzCar.setEngine();
    }

    @Override
    public void buildSystem() {
        benzCar.setSystem();
    }

    @Override
    public void buildBrand() {
        benzCar.setBrand();
    }

    @Override
    public void buildWheel(String wheel) {
        benzCar.setWheel(wheel);
    }

    @Override
    public Car build() {
        return benzCar;
    }
}
