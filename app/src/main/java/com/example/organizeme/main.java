package com.example.organizeme;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        LinearLayout[] tab_array = {findViewById(R.id.home_tab), findViewById(R.id.category_tab), findViewById(R.id.calendar_tab), findViewById(R.id.reminders_tab)};
        LinearLayout[] content_array = {findViewById(R.id.home_content), findViewById(R.id.category_content), findViewById(R.id.calendar_content), findViewById(R.id.reminder_content)};
        ImageView[] tab_img = {findViewById(R.id.home_img), findViewById(R.id.category_img), findViewById(R.id.calendar_img), findViewById(R.id.reminder_img)};
        TextView[] tab_text = {findViewById(R.id.home_text), findViewById(R.id.category_text), findViewById(R.id.calendar_text), findViewById(R.id.reminder_text)};
        Drawable[] normal_tab = {getDrawable(R.drawable.home_img), getDrawable(R.drawable.category_img), getDrawable(R.drawable.calendar_img), getDrawable(R.drawable.reminder_img)};
        Drawable[] select_tab = {getDrawable(R.drawable.select_home_img), getDrawable(R.drawable.select_category_img), getDrawable(R.drawable.select_calendar_img), getDrawable(R.drawable.select_reminder_img)};

        change_tab(tab_array, content_array, tab_img, tab_text, normal_tab, select_tab);
    }

    private void change_tab(LinearLayout[] tab_array, LinearLayout[] content_array, ImageView[] tab_img, TextView[] tab_text, Drawable[] normal_tab, Drawable[] select_tab){
        for(int i = 0; i < tab_array.length; i++){
            int finalI = i;
            tab_array[i].setOnClickListener(view -> {
                for(int j = 0; j < tab_array.length; j++){
                    if(finalI != j){
                        content_array[j].setVisibility(view.GONE);
                        tab_text[j].setTextColor(Color.parseColor("#212121"));
                        tab_img[j].setImageDrawable(normal_tab[j]);
                    }
                    else{
                        content_array[j].setVisibility(view.VISIBLE);
                        tab_text[j].setTextColor(Color.parseColor("#615cf6"));
                        tab_img[j].setImageDrawable(select_tab[j]);
                    }
                }
            });
        }
    }
}
