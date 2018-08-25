package com.example.smit.quizone;
import android.support.v7.widget.CardView;

interface CardAdapter {
    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}

