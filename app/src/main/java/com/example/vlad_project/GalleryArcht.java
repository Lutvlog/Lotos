package com.example.vlad_project;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


public class GalleryArcht extends AppCompatActivity {

    private ViewPager2 mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galleryarcht);

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (R.id.change == item.getItemId()) {
            mPager.setOrientation(mPager.getOrientation() != ViewPager2.ORIENTATION_VERTICAL ? ViewPager2.ORIENTATION_VERTICAL : ViewPager2.ORIENTATION_HORIZONTAL);
        }
        return super.onOptionsItemSelected(item);
    }
}