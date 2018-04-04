package vishukumar.com.dropdownlistandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String[] allMonths =  {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    ArrayList<String> months = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.MONTH);
        Log.d("tag", "Month index : " + calendar.get(Calendar.MONTH) + " ");
        switch (calendar.get(Calendar.MONTH)) {
            case 0:
                months = populateMonths(0);
                break;
            case 1:
                months = populateMonths(1);
                break;
            case 2:
                months = populateMonths(2);
                break;
            case 3:
                months = populateMonths(3);
                break;
            case 4:
                months = populateMonths(4);
                break;
            case 5:
                months = populateMonths(5);
                break;
            case 6:
                months = populateMonths(6);
                break;
            case 7:
                months = populateMonths(7);
                break;
            case 8:
                months = populateMonths(8);
                break;
            case 9:
                months = populateMonths(9);
                break;
            case 10:
                months = populateMonths(10);
                break;
            case 11:
                months = populateMonths(11);
                break;
        }

        String[] dropDownFilteredMonths = months.toArray(new String[months.size()]);

        spinner = (Spinner) findViewById(R.id.monthsSpinnerId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item, dropDownFilteredMonths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    private ArrayList<String> populateMonths(int index) {

        ArrayList<String> temp = new ArrayList<>();

        for(int i=0; i<= index; i++) {
            temp.add(allMonths[i]);
        }

        return temp;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        Log.d("tag", allMonths[position] + " ");
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
