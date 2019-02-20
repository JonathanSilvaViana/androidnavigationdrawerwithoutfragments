package menudrawer.com.br.menudrawerdenavegao;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;



public class SegundaActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Toast.makeText(this, "segunda act.", Toast.LENGTH_SHORT).show();

        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.account:
                        //Toast.makeText(SegundaActivity.this, "My Account",Toast.LENGTH_SHORT).show();

                        Intent primeira = new Intent(SegundaActivity.this, MainActivity.class);
                        startActivity(primeira);

                    case R.id.settings:
                        //Toast.makeText(SegundaActivity.this, "Settings",Toast.LENGTH_SHORT).show();

//                        Intent segunda = new Intent(SegundaActivity.this, SegundaActivity.class);
//                        startActivity(segunda);

                    case R.id.mycart:
                        //Toast.makeText(SegundaActivity.this, "My Cart",Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }




            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
