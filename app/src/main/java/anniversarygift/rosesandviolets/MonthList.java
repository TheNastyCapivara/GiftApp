package anniversarygift.rosesandviolets;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MonthList extends ActionBarActivity {

    ListView monthsList;
    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_list);

        months = getResources().getStringArray(R.array.Months);

        monthsList = (ListView) findViewById(R.id.monthsListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.icon_and_textrow, R.id.rowText, months);
        monthsList.setAdapter(adapter);
//        monthsList.setOnClickListener((android.view.View.OnClickListener) this);
        // commit 2

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_month_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
