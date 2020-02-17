import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaurav on 18/2/20
 **/
public class LEETCODE1282 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l ;
        int count,j;
        for(int i=0;i<groupSizes.length;i++){
            if(groupSizes[i]!=-1){
                l = new ArrayList<Integer>();
                l.add(i);
                count=1;
                j=i+1;
                while(count!=groupSizes[i] && j<groupSizes.length){
                    if(groupSizes[i]==groupSizes[j]){
                        count++;
                        groupSizes[j]=-1;
                        l.add(j);
                    }
                    j++;
                }
                res.add(l);
            }
        }
        return res;
    }
}
