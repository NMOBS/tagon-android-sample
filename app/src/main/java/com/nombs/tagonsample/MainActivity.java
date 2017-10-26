package com.nombs.tagonsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nmobs.tagonandroid.adtypes.TagOnFullPage;
import com.nmobs.tagonandroid.interfaces.FullPageListener;

public class MainActivity extends AppCompatActivity implements FullPageListener {

    private TagOnFullPage tagOnFullPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tagOnFullPage = new TagOnFullPage.Builder()
                .publisherId("publisher id")
                .inventoryId("inventory id")
                .adunitId("adunit id")
                .availableFormats("")
                .referrer("")
                .fullPageListener(this)
                .build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        tagOnFullPage.resume();
    }

    @Override
    public void onFullPageLoaded(TagOnFullPage tagOnFullPage) {
        tagOnFullPage.show();
    }

    @Override
    public void onFullPageFailed(TagOnFullPage tagOnFullPage, String s) {

    }

    @Override
    public void onFullPageShown(TagOnFullPage tagOnFullPage) {

    }

    @Override
    public void onFullPageClicked(TagOnFullPage tagOnFullPage) {

    }

    @Override
    public void onFullPageDismissed(TagOnFullPage tagOnFullPage) {

    }

}
