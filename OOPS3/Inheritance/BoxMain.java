public class BoxMain {
    public static void main(String[] args) {
        BoxWeight boxWtObj = new BoxWeight(2, 3, 4, 5);
        // Apart from its own properties, it can access only public properties/
        // methods of base class
        // System.out.println(boxWtObj.ht + " " + boxWtObj.wt);

        // private properties are accessible only within the class
        // Parent class can only access its properties.
        // Box boxObj = new Box();
        // boxObj.information()
        // boxObj.l;

        // Box box = new BoxWeight();
        // It is actually the type of reference variable which determinces what members
        // are accessible, not the objects.
        // System.out.println(box.ht);
        // System.out.println(box.wt); // cannot be accessed.
        // System.out.println(box.w);

        // BoxWeight obj3 = new Box();
        // child refering to parent class.
        // Here refernce is of child class, Therefore access of both child and parent
        // members.
        // But calling the constructor of parent class. Then how will you initialise the
        // child class members.
        // Not possible of doing.

        // cast kiya tb chl gya (hack)
        // BoxWeight boxWt = (BoxWeight) new Box();
        // System.out.println(boxWt.ht + " " + boxWt.w);
        // System.out.println(boxWt.wt); // will never be initialise.
        // parent property can also be accesses but you said it depends on the type of
        // reference variable, yes it is boxweight properties only but boxweight extends
        // box know.

    }

}
