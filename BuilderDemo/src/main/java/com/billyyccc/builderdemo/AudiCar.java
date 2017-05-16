package com.billyyccc.builderdemo; /**
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

    /**
     *  省略Director，直接使用Builder
     */
    public static class AudiCarBuilder {
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
}
