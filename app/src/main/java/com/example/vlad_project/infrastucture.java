package com.example.vlad_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;

import java.util.List;


public class infrastucture extends AppCompatActivity {

    private MapView mapview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey("3b46cd80-429c-4899-8f85-01ccf3ea574d");
        MapKitFactory.initialize(this);
        setContentView(R.layout.activity_infrastucture);

            mapview = (MapView)findViewById(R.id.mapview);
            mapview.getMap().move(
                    new CameraPosition(new Point(46.339738, 48.026846), 15.0f, 0.0f, 0.0f),
                    new Animation(Animation.Type.SMOOTH, 0),
                    null);
        ImageProvider resourceBackedImage1 = ImageProvider.fromResource(this, R.drawable.metklotos);
        PlacemarkMapObject placemark1 = mapview.getMap().getMapObjects().addPlacemark( new Point(46.339920, 48.026763), resourceBackedImage1);

        ImageProvider resourceBackedImage2 = ImageProvider.fromResource(this, R.drawable.metkcinema);
        PlacemarkMapObject placemark2 = mapview.getMap().getMapObjects().addPlacemark( new Point(46.338212, 48.023131), resourceBackedImage2);

        ImageProvider resourceBackedImage3 = ImageProvider.fromResource(this, R.drawable.metkdoc);
        PlacemarkMapObject placemark3 = mapview.getMap().getMapObjects().addPlacemark( new Point(46.336409, 48.022320), resourceBackedImage3);

        ImageProvider resourceBackedImage4 = ImageProvider.fromResource(this, R.drawable.metkschool);
        PlacemarkMapObject placemark4 = mapview.getMap().getMapObjects().addPlacemark( new Point(46.346207, 48.026607), resourceBackedImage4);

        ImageProvider resourceBackedImage5 = ImageProvider.fromResource(this, R.drawable.metkschool);
        PlacemarkMapObject placemark5 = mapview.getMap().getMapObjects().addPlacemark( new Point(46.335273, 48.014720), resourceBackedImage5);

        ImageProvider resourceBackedImage6 = ImageProvider.fromResource(this, R.drawable.metkschool);
        PlacemarkMapObject placemark6 = mapview.getMap().getMapObjects().addPlacemark( new Point(46.340837, 48.031424), resourceBackedImage6);


        }
    @Override
    protected void onStop() {
        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapview.onStart();

        MapKitFactory.getInstance().onStart();
    }

    }


