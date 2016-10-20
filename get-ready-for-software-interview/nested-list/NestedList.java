import java.util.ArrayList;
import java.util.List;

/**
 * Created by ytw on 10/20/16.
 */
public class NestedList
{
    private int Val;
    public NestedList(int val)
    {
        this.Val = val;
    }
    public List<NestedList> nl;
    public int getVal(){
        return Val;
    }
    public int getDepthSum(){
        int depth = 1;
        return getDepthSum(depth,this);
    }
    private int getDepthSum(int depth, NestedList l){
        int sum = depth * getVal();
        if (l.nl != null){
            for (NestedList i : l.nl){
                sum += i.getDepthSum(depth+1,i);
            }
            return sum;
        }
        return sum;
    }
    public static void main(String[] args){
        //Here’s the test for {1, {2, {3, 4}}} =>  1*1 + 2*2 + 3*3 + 4*3 = 26

        NestedList root = new NestedList(1);
        NestedList i2 = new NestedList(2);
        NestedList i3 = new NestedList(3);
        NestedList i4 = new NestedList(4);

        root.nl = new ArrayList<NestedList>();
        root.nl.add(i2);
        ArrayList<NestedList> list = new ArrayList<NestedList>();
        list.add(i3);
        list.add(i4);
        i2.nl = list;
        int results = root.getDepthSum();
        System.out.println(results == 26);
    }
}
