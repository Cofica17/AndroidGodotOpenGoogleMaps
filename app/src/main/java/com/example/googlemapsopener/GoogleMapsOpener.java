package com.example.googlemapsopener;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.ArraySet;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.SignalInfo;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class GoogleMapsOpener extends GodotPlugin {

    private Activity activity;

    public GoogleMapsOpener(Godot godot) {
        super(godot);
        activity = godot.getActivity();
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GoogleMapsOpener";
    }

    @NonNull
    @Override
    public List<String> getPluginMethods() {
        return Arrays.asList("openGoogleMaps");
    }

    public void openGoogleMaps(float lat, float lng){
        Uri gmmIntentUri = Uri.parse("geo:"+String.valueOf(lat)+","+String.valueOf(lng));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(mapIntent);
        }
    }
}
