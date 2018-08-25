package com.example.smit.quizone;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Categories extends AppCompatActivity {
    ShadowTransformer mCardShadowTransformer;
    CardPagerAdapter mCardAdapter;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        mViewPager = findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter(new CardPagerAdapter.OnItemClickListner() {
            @Override
            public void onItemClick(CardItem cardItem) {
                startActivity(new Intent(Categories.this,MainActivity.class));
            }
        });
        mCardAdapter.addCardItem(new CardItem(R.drawable.physics, "Physics"));
        mCardAdapter.addCardItem(new CardItem(R.drawable.worldmap, "World Map"));
        mCardAdapter.addCardItem(new CardItem(R.drawable.sports,"Sports"));
        mCardAdapter.addCardItem(new CardItem(R.drawable.books,"Books"));
        mCardAdapter.addCardItem(new CardItem(R.drawable.politics,"Indian Politics"));
        mCardAdapter.addCardItem(new CardItem(R.drawable.technology,"Technology"));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);

    }
}
