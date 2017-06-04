package eu.laramartin.androidjokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        TextView jokeTextView = (TextView) findViewById(R.id.tv_joke);
        if (getIntent().getExtras() != null) {
            Bundle intentData = getIntent().getExtras();
            String joke = intentData.getString("jokeToDisplay", "Default joke");
            jokeTextView.setText(joke);
        } else {
            jokeTextView.setText(R.string.no_joke_found);
        }
    }
}
