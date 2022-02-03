package id.yusufrizalh.project003;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CustomAppbarActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_appbar);

        toolbar = findViewById(R.id.toolbar_display_activity);
        setSupportActionBar(toolbar);
    }

    // menampilkan options menu pada toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // ketika salah satu options menu dipilih
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_contact:
                Toast.makeText(this, "Menu Contact is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_gallery:
                Toast.makeText(this, "Menu Gallery is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(this, "Menu Search is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_settings:
                Toast.makeText(this, "Menu Settings is selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.menu_share:
                Toast.makeText(this, "Menu Share is selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "No Menu is selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}