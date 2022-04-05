package uit.lab1.bt3_18521450_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rdG);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.red_button:
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        break;
                    case R.id.green_button:
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.blue_button:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.gray_button:
                        getWindow().getDecorView().setBackgroundColor(Color.GRAY);
                        break;
                }
            }
        });

    }
}