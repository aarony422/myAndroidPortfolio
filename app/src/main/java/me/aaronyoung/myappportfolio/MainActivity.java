package me.aaronyoung.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // https://discussions.udacity.com/t/lesson-0-displaying-the-toast-message/21243/2
    public void displayMessage(View view) {
        Button button = (Button) view;
        // get button text
        String projName = (String) button.getText();
        // get the context
        Context context = getApplicationContext();

        // make toast
        Toast toast = Toast.makeText(context, "This button will launch my " + projName + " App", Toast.LENGTH_SHORT);
        toast.show();
    }
}
