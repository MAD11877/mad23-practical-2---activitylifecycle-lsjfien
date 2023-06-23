package sg.edu.np.mad.madpractical;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    final String TITLE= "Main Activity";
    User myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create!");

        myUser = new User("Fionn", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);

        TextView greeting = findViewById(R.id.textView2);
        greeting.setText(myUser.name);

        TextView description = findViewById(R.id.textView);
        description.setText(myUser.description);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TITLE, "On Start!");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.v(TITLE, "On Pause!");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.v(TITLE, "On Resume!");


        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myUser.followed == false)
                {
                    myUser.followed = true;
                    Log.v(TITLE, "Followed");
                    myButton.setText("Unfollow");
                }
                else
                {
                    myUser.followed = false;
                    Log.v(TITLE, "Unfollowed");
                    myButton.setText("Follow");
                }
            }
        });

        Button myButton2 = findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TITLE, "Message");
            }
        });
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.v(TITLE, "On Stop!");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.v(TITLE, "On Destroy!");
    }
}