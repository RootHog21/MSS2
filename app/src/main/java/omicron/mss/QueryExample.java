package omicron.mss;



import android.util.Log;

import com.parse.*;

import java.util.List;



/**
 * Created by Ian on 5/4/2015.
 */
public class QueryExample {

    public QueryExample() {
        //can't finish yet
    }

    public void findClass() throws ParseException {
        int i;
        ParseQuery<ParseObject> query = ParseQuery.getQuery("ClassDB");//Gets the DB it needs to search
        List<ParseObject> classList;//A list that the objects downloaded will go to
        classList = query.find();//Download the objects into the list based on the criteria put into the query
        System.out.println(classList.get(0));//Fist object in the list downloaded
        ParseObject thisObject =classList.get(0);//Find the object downloaded.
        System.out.println(thisObject.get("classNum"));//Find the classNum of the first obejct
        System.out.println(query.get("CziY9WboXS"));//Find the object that has this ID from the query
    }

    void compare(String time1, String time2){

    }
}
