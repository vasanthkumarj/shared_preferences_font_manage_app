package vk.com.shared_preferences_font_manage_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;

import org.apache.commons.lang3.StringUtils;

public class MainActivity extends AppCompatActivity {

    private EditText message;
    private SeekBar fontAdjuster;

    private static final String TEXT_RED = "Red";
    private static final String TEXT_BLUE = "Blue";
    private static final String TEXT_GREEN = "Green";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.edit_text);
        fontAdjuster = findViewById(R.id.seek_bar_font_zize_adjuster);

        fontAdjuster.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                message.setTextSize(TypedValue.COMPLEX_UNIT_PX, i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }




    public void changeTextColor(View view) {

        RadioButton colorOption = (RadioButton) view;
        if(StringUtils.equalsIgnoreCase(colorOption.getText(), TEXT_RED))
        {
           message.setTextColor(Color.RED);
        }
        else if(StringUtils.equalsIgnoreCase(colorOption.getText(), TEXT_GREEN))
        {
            message.setTextColor(Color.GREEN);
        }
        else if(StringUtils.equalsIgnoreCase(colorOption.getText(), TEXT_BLUE))
        {
            message.setTextColor(Color.BLUE);
        }
    }
}
