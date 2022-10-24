package com.ljd.designmode.creator.build.phone;

import lombok.Data;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/24 14:10
 * @Version 1.0
 */
@Data
public class Phone {
    private String name;
    private String cpu;
    private String master;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.name = builder.name;
        this.master = builder.master;
    }

    public static class Builder {

        private String name;
        private String cpu;
        private String master;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder master(String master) {
            this.master = master;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
