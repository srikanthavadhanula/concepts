package com.lowleveldesign.concepts.lowleveldesign.designpatterns.facade;

public class NonFacade {

    static class Vegitables {
        public String getTomatos() {
            return "2kgs Tomatos";
        }

        public String getOnions() {
            return "2kgs onions";
        }
    }

    static class Groceries {
        public String getMilk() {
            return "2packets of milk";
        }

        public String getCookingOil() {
            return "5packets of oil";
        }
    }

    /*
    * Here the Planner is of client code, Client needs to know what all
    * subsystems that are responsible to completing the tasks
    * Also client need to understand the flow in which we need to trigger
    * those tasks
    * */

    /*
    * In future if there is a new subsystem coming into picture like
    * getting gas cylinder, client code needs to change accordingly
    * And add those in the Planner
    * */

    static class Planner {
        Vegitables veg = new Vegitables();
        Groceries gro = new Groceries();

        public StringBuilder getItems() {
            StringBuilder response = new StringBuilder();
            response.append("List of Items\n");
            response.append(veg.getOnions()).append("\n");
            response.append(veg.getTomatos()).append("\n");
            response.append(gro.getMilk()).append("\n");
            response.append(gro.getCookingOil()).append("\n");
            return response;
        }
    }

    public static void main(String[] args) {
        Planner plan = new Planner();
        StringBuilder items = plan.getItems();
        System.out.println(items);
    }
}
