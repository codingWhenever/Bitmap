package dbh.leo.com.bitmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import dbh.leo.com.bitmap.utils.BitmapUtil;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setImageBitmap(
                BitmapUtil.decodeBitmapFromResource(getResources(), R.mipmap.qrcode, 300, 300));
    }
}
