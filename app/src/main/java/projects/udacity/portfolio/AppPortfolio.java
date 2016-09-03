package projects.udacity.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppPortfolio extends AppCompatActivity {

    Button popularMovies;
    Button stockHawk;
    Button buildBigger;
    Button appMaterial;
    Button goUbiquitous;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);

        popularMovies = (Button) findViewById(R.id.button_popular_movies);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        buildBigger = (Button) findViewById(R.id.build_it_bigger);
        appMaterial = (Button) findViewById(R.id.app_material);
        goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        capstone = (Button) findViewById(R.id.capstone);
    }

    public void onButtonClicked(View v){
        Button button = (Button) v;
        String message = "This button launches " + button.getText() + " App";
        Toast.makeText(AppPortfolio.this, message, Toast.LENGTH_SHORT).show();
    }

}
