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

        final RatingBar ratingBar1 = (RatingBar) findViewById(R.id.cap_capball);
        ratingBar1.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if (ratingBar.getRating() < 1.0f) {
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar2 = (RatingBar) findViewById(R.id.cap_high);
        ratingBar2.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if (ratingBar.getRating() < 1.0f) {
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar3 = (RatingBar) findViewById(R.id.cap_low);
        ratingBar3.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar4 = (RatingBar) findViewById(R.id.beacon);
        ratingBar4.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar5 = (RatingBar) findViewById(R.id.particle_center);
        ratingBar5.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar6 = (RatingBar) findViewById(R.id.particle_corner);
        ratingBar6.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar7 = (RatingBar) findViewById(R.id.parking_center);
        ratingBar7.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar8 = (RatingBar) findViewById(R.id.parking_corner);
        ratingBar8.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar9 = (RatingBar) findViewById(R.id.autonomous_particle_center);
        ratingBar9.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar10 = (RatingBar) findViewById(R.id.autonomous_beacon);
        ratingBar10.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar11 = (RatingBar) findViewById(R.id.autonomous_capball);
        ratingBar11.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar12 = (RatingBar) findViewById(R.id.drive);
        ratingBar12.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                if(ratingBar.getRating() < 1.0f){
                    ratingBar.setRating(1.0f);
                }
            }
        });
        final RatingBar ratingBar13 = (RatingBar) findViewById(R.id.autonomous_particle_corner);
        ratingBar13.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
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
        int cap_capball = Math.round(((RatingBar) findViewById(R.id.cap_capball)).getRating());
        int cap_high = Math.round(((RatingBar) findViewById(R.id.cap_high)).getRating());
        int cap_low = Math.round(((RatingBar) findViewById(R.id.cap_low)).getRating());
        int teleop_beacon = Math.round(((RatingBar) findViewById(R.id.beacon)).getRating());
        int particle_center = Math.round(((RatingBar) findViewById(R.id.particle_center)).getRating());
        int particle_corner = Math.round(((RatingBar) findViewById(R.id.particle_corner)).getRating());
        int parking_center = Math.round(((RatingBar) findViewById(R.id.parking_center)).getRating());
        int parking_corner = Math.round(((RatingBar) findViewById(R.id.parking_corner)).getRating());
        int autonomous_particle_center = Math.round(((RatingBar) findViewById(R.id.autonomous_particle_center)).getRating());
        int autonomous_particle_corner = Math.round(((RatingBar) findViewById(R.id.autonomous_particle_corner)).getRating());
        int autonomous_beacon = Math.round(((RatingBar) findViewById(R.id.autonomous_beacon)).getRating());
        int autonomous_capball = Math.round(((RatingBar) findViewById(R.id.autonomous_capball)).getRating());
        int drive = Math.round(((RatingBar) findViewById(R.id.drive)).getRating());
        TextView score = (TextView) findViewById(R.id.score);
        double final_score = calculate_score(cap_capball, cap_high, cap_low, teleop_beacon,
                particle_center, particle_corner, parking_center, parking_corner, autonomous_particle_center, autonomous_particle_corner,
                autonomous_beacon, autonomous_capball, drive);
        //double final_score_rounded = Math.round(final_score * 100.0)/100.0;
        double final_score_rounded = Math.round(final_score * (100/87.78));
        score.setText(Double.toString(final_score_rounded));
    }

    private double calculate_score(int cap_capball, int cap_high, int cap_low,
                          int teleop_beacon, int particle_center, int particle_corner,
                          int parking_center, int parking_corner, int autonomous_particle_center,
                                   int autonomous_particle_corner, int autonomous_beacon, int autonomous_capball, int drive){
        double score1 = Math.pow(cap_capball-1,2)*150;
        double score2 = Math.pow(cap_high-1,1)*200;
        double score3 = Math.pow(cap_low-1,1)*50;
        double score4 = Math.pow(teleop_beacon-1,2)*50;
        double score5 = Math.pow(particle_center-1,3)*20;
        double score6 = Math.pow(particle_corner-1,2)*10;
        double score7 = Math.pow(parking_center-1,1)*50;
        double score8 = (parking_corner-1)*50;
        double score9 = (autonomous_particle_center-1)*100;
        double score13 = (autonomous_particle_corner-1)*25;
        double score10 = Math.pow(autonomous_beacon-1, 2)*25;
        double score11 = Math.pow(autonomous_capball-1,1)*25;
        double score12 = (drive-5)*Math.abs(drive-5)*150;
        double summation = score1+score2+score3+score4+score5+score6+score7+score8+score9+score10+score11+score12+2400;
        return (summation/10640)*100;
    }
}
