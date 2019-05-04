package com.example.universalid;

import android.Manifest;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.android.gms.vision.text.Line;
import com.google.zxing.Result;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.List;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.Manifest.permission.CAMERA;

public class MainActivity extends AppCompatActivity  {

    LinearLayout linearlyt1;
    LinearLayout linearlyt2;
    Button newUserBtn;
    Button scanbtn;
    Button backbtn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LAYOUTS 1
        linearlyt1 = (LinearLayout) findViewById(R.id.linearlyt1);
        linearlyt2 = (LinearLayout) findViewById(R.id.linearlyt2);

        // BUTTONS
        newUserBtn = (Button) findViewById(R.id.newUserBtn);
        newUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearlyt1.setVisibility(View.INVISIBLE);
                linearlyt2.setVisibility(View.VISIBLE);
            }
        });

        scanbtn =(Button)findViewById(R.id.scanbtn);
        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BarcodeScanner.class);
                startActivity(intent);
            }
        });

        backbtn1 = (Button)findViewById(R.id.backbtn1);
        backbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearlyt1.setVisibility(View.VISIBLE);
                linearlyt2.setVisibility(View.INVISIBLE);
            }
        });




    }


}
