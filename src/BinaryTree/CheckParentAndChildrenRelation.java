package BinaryTree;


import CheckparentChildConceptsIndiffPackage.deriveA.DeriveA;
import CheckparentChildConceptsIndiffPackage.deriveB.DeriveB;
import CheckparentChildConceptsIndiffPackage.deriveC.DeriveC;
import CheckparentChildConceptsIndiffPackage.parent.Base;


public class CheckParentAndChildrenRelation {

    public static void main(String[] args) {

        Base b1 = new DeriveA();
        DeriveB b2 = new DeriveB();
        Base b3 = new DeriveC();

        Base b4 = new Base();
        b4.print();
        b1.print();


    }

}
