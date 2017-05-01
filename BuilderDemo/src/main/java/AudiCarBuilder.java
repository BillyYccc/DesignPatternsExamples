/**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

public class AudiCarBuilder {
    private AudiCar audiCar = new AudiCar();

    public AudiCarBuilder buildEngine() {
        audiCar.setEngine();
        return this;
    }

    public AudiCarBuilder buildSystem() {
        audiCar.setSystem();
        return this;
    }

    public AudiCarBuilder buildBrand() {
        audiCar.setBrand();
        return this;
    }

    public AudiCarBuilder buildWheel(String wheel) {
        audiCar.wheel = wheel;
        return this;
    }

    public AudiCar build() {
        return audiCar;
    }

}
