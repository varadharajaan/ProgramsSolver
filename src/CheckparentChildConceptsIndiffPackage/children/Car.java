package CheckparentChildConceptsIndiffPackage.children;

import CheckparentChildConceptsIndiffPackage.parent.Vechile;

import java.util.Date;


public class Car extends Vechile {

    public Car(int id, String name, String milage, Date date) {
        super(id, name, milage, date);
    }


    public Car() {
    }


    @Override
    public String checkMilage() {
        return "200kmpl";
    }

}
