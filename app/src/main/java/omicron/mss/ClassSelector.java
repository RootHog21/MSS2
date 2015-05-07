package omicron.mss;

import com.parse.*;

import java.util.List;

/**
 * Created by Ian on 5/6/2015.
 */
public class ClassSelector {

    String dept;
    int classNum;

    public ClassSelector(String dept, int classNum){
        this.dept = dept;
        this.classNum = classNum;
    }
    public ClassSelector(String dept){
        this.dept = dept;
        this.classNum = classNum;
    }
    public ClassSelector(int classNum){
        this.dept = dept;
        this.classNum = classNum;
    }

    public List<ParseObject> get()throws ParseException{
        ParseQuery<ParseObject> query = ParseQuery.getQuery("ClassDB");
        if(dept!=null){
            query.whereEqualTo("department", dept);}
        try {
            classNum =classNum + 0;
            query.whereEqualTo("classNum", classNum);
        }catch(NullPointerException e) {
        }
        return query.find();
    }
}
