import java.util.Arrays;
import java.util.Vector;

public class LabA  {
//Vector
//add one .add()
//add many .addAll()//isWriteable = false; cannot add
    Vector<Integer> vector;
    boolean isWriteable;

    public LabA(){
        this.vector = new Vector<>(10, 10);
        this.isWriteable = true;
    }

    public void makeWritable(){
        this.isWriteable = true;
    }

    public void makeReadOnly(){
        this.isWriteable = false;
    }

    public void addOneElement(int e){
        if(isWriteable){
            vector.add(e);
        }
        else {
            System.out.println("To add an element, make the list writeable.");
        }
    }

    public void addManyElements(Integer[] e){
        if(isWriteable){
            vector.addAll(Arrays.asList(e));
        }
        else {
            System.out.println("To add an element, make the list writeable.");
        }
    }

    public Vector<Integer> getVector() {
        return this.vector;
    }

    public boolean getIsWriteable(){
        return this.isWriteable;
    }
}
