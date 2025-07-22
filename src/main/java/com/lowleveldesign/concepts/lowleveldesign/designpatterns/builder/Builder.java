package com.lowleveldesign.concepts.lowleveldesign.designpatterns.builder;

public class Builder {

    @lombok.Builder
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
    }

    public static void main(String[] args) {
        Builder.Employee srikanth = Employee.builder().name("srikanth").age(25).company("walmart").build();
        System.out.println("Srikanth : "+srikanth);
    }
}
