package com.nitro.robotrater;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar ratingBar1 = (RatingBar) findViewById(R.id.hang_rate);
        ratingBar1.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if (ratingBar.getRating() < 1.0f) {
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar2 = (RatingBar) findViewById(R.id.high_score_rate);
        ratingBar2.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if (ratingBar.getRating() < 1.0f) {
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar3 = (RatingBar) findViewById(R.id.medium_score_rate);
        ratingBar3.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar4 = (RatingBar) findViewById(R.id.low_score_rate);
        ratingBar4.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar5 = (RatingBar) findViewById(R.id.auto_climber_rate);
        ratingBar5.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar6 = (RatingBar) findViewById(R.id.auto_park_rate);
        ratingBar6.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar7 = (RatingBar) findViewById(R.id.driving_rate);
        ratingBar7.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar8 = (RatingBar) findViewById(R.id.park_high_zone_rate);
        ratingBar8.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar9 = (RatingBar) findViewById(R.id.park_mid_zone_rate);
        ratingBar9.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar10 = (RatingBar) findViewById(R.id.signal);
        ratingBar10.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar11 = (RatingBar) findViewById(R.id.climbers);
        ratingBar11.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void refreshScore(View view){
        int hang_rate = Math.round(((RatingBar) findViewById(R.id.hang_rate)).getRating());
        int high_score_rate = Math.round(((RatingBar) findViewById(R.id.high_score_rate)).getRating());
        int medium_score_rate = Math.round(((RatingBar) findViewById(R.id.medium_score_rate)).getRating());
        int low_score_rate = Math.round(((RatingBar) findViewById(R.id.low_score_rate)).getRating());
        int auto_climber_rate = Math.round(((RatingBar) findViewById(R.id.auto_climber_rate)).getRating());
        int auto_park_rate = Math.round(((RatingBar) findViewById(R.id.auto_park_rate)).getRating());
        int driving_rate = Math.round(((RatingBar) findViewById(R.id.driving_rate)).getRating());
        int park_mid_zone_rate = Math.round(((RatingBar) findViewById(R.id.park_mid_zone_rate)).getRating());
        int park_high_zone_rate = Math.round(((RatingBar) findViewById(R.id.park_high_zone_rate)).getRating());
        int signal = Math.round(((RatingBar) findViewById(R.id.signal)).getRating());
        int ramp_climbers = Math.round(((RatingBar) findViewById(R.id.climbers)).getRating());
        TextView score = (TextView) findViewById(R.id.score);
        double final_score = calculate_score(hang_rate, high_score_rate, medium_score_rate, low_score_rate,
                auto_climber_rate, auto_park_rate, driving_rate, park_mid_zone_rate, park_high_zone_rate,
                signal, ramp_climbers);
        double final_score_rounded = Math.round(final_score * 100.0)/100.0;
        score.setText(Double.toString(final_score_rounded));
    }

    private double calculate_score(int hang_rate, int high_score_rate, int medium_score_rate,
                          int low_score_rate, int auto_climber_rate, int auto_park_rate,
                          int driving_rate, int park_mid_zone_rate, int park_high_zone_rate,
                                   int signal, int ramp_climbers){
        double score1 = Math.pow(hang_rate-1,2)*200;
        double score2 = Math.pow(high_score_rate-1,3)*40;
        double score3 = Math.pow(medium_score_rate-1,2)*50;
        double score4 = (low_score_rate-1)*100;
        double score5 = Math.pow(auto_climber_rate-1,3)*30;
        double score6 = Math.pow(auto_park_rate-1,3)*5;
        double score7 = (driving_rate-4.2)*(Math.abs(driving_rate-4.2))*200;
        double score8 = (park_mid_zone_rate-1)*50;
        double score9 = (park_high_zone_rate-1)*75;
        double score10 = (signal-1)*75;
        double score11 = (ramp_climbers-1)*75;
        double summation = score1+score2+score3+score4+score5+score6+score7+score8+score9+score10+score11+2048;
        return (summation*100/12476);
    }
}
