package omicron.mss;



import android.util.Log;

import com.parse.*;

import java.util.List;



/**
 * Created by Ian on 5/4/2015.
 */
public class ScheduleCreator {

    public ScheduleCreator() {
        //can't finish yet
    }

    public void findClass() throws ParseException {
        ParseQuery<ParseObject> query = ParseQuery.getQuery("ClassDB");
        List<ParseObject> classList;
        query.whereEqualTo("classNum", "4393");
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> classList, ParseException e) {
                if (e == null) {
                    Log.d("class", "retrieved " + classList.size() + " scores");
                } else {
                    Log.d("class", "Error: " + e.getMessage());
                }
            }
        });
        System.out.println(query.get("CziY9WboXS"));
    }

    void compare(String time1, String time2){

    }
}
