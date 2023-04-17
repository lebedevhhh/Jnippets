import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args){
        //remember that the arraylist collection is non-concurrent
        ArrayList<String> list=new ArrayList<>();
        list.add("null");
        list.add("another null");
        //stream
        list.removeIf(w -> w.equals("null"));
    }
}
