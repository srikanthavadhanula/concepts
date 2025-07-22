package com.lowleveldesign.concepts.lowleveldesign.designpatterns.builder;

public class NonBuilder {

    static class Employee {
        private String name;
        private int age;
        private String company;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", company='" + company + '\'' +
                    '}';
        }

        /*
        * We should make the Student Constructor private such
        * that no one else can call this constructor
        * */
        private Employee() {}

        private Employee(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.company = builder.company;
        }

        static class Builder{
            private String name;
            private int age;
            private String company;

            Employee Builder() {
                return new Employee();
            }

            Builder name(String name) {
                this.name = name;
                return this;
            }

            Builder age(int age) {
                this.age = age;
                return this;
            }

            Builder company(String company) {
                this.company = company;
                return this;
            }

            Employee build() {
                return new Employee(this);
            }
        }
    }

    public static void main(String[] args) {
        NonBuilder.Employee srikanth = new Employee.Builder().name("srikanth").age(25).company("walmart").build();
        System.out.println("srikanth : "+srikanth.toString());
    }
}
