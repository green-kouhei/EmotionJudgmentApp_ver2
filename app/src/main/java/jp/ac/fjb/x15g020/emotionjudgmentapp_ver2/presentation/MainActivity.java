package jp.ac.chiba_fjb.a.test1108;


        import android.app.Activity;
        import android.app.Application;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.net.Uri;
        import android.provider.MediaStore;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

        import java.io.File;

public class MainActivity extends AppCompatActivity {

    private final static int RESULT_CAMERA = 1001;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //インスタンス取得
        imageView = (ImageView)findViewById(R.id.image_view);
        Button cameraButton = (Button)findViewById(R.id.camera_button);

        //カメラ起動
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, RESULT_CAMERA);
            }
        });
    }

    //シャッター後Twitterに投稿
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RESULT_CAMERA) {

            //imageViewに結果写真を表示する
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);


            //twitter投稿
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.setType("image/*");
            intent.putExtra(Intent.EXTRA_TEXT,"「Smile VS Alien」～表情で宇宙人を倒すアプリ～");
            //intent.putExtra("img",bitmap);
            intent.putExtra("data", bitmap);

            this.startActivity(intent);





        }


    }

}
