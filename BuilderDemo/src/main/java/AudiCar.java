/**
 * Created by Billy Yuan on 2017/5/1.
 * Email: billy112487983@gmail.com
 */

/**
 * 具体的AudiCar类，继承自Car
 */
public class AudiCar extends Car {
    protected AudiCar() {

    }

    @Override
    public void setBrand() {
        this.brand = "Audi";
    }

    @Override
    public void setEngine() {
        this.engine = "Audi Engine";
    }

    @Override
    public void setSystem() {
        this.system = "Audi System";
    }
}
