package jp.ac.chiba_fjb.a.test1011;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.File;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TwitterSend extends AsyncTask<Object, Void, Void> {
    private final String APIKEY = "ここ";
    private final String APIKEY_SECRET = "ここ";
    private final String ACCESSTOKEN = "ここ";
    private final String ACCESSTOKEN_SECRET = "ここに";
    private Twitter mTwitter;
    private String msg;
    private String count;
    private ProgressDialog dialog;
    private Context con;

    public TwitterSend(Context context) {
        con = context;
    }

    @Override
    protected void onPreExecute() {
        // TODO 自動生成されたメソッド・スタブ
        super.onPreExecute();
        dialog = new ProgressDialog(con);
        dialog.setTitle("pleas wait...");
        dialog.setMessage("Twitter update now");
        dialog.show();
    }

    @Override
    protected Void doInBackground(Object... params) {
        try {
            Log.v("log", "twittersend(log)");
            msg = String.valueOf(params[1]);
            File imgfile = new File(String.valueOf(params[2]));
            System.out.println("画像取得");
            mTwitter = Twitter_Util.getTwitter();
            StatusUpdate status = new StatusUpdate(msg + "\nうまい点数は：" + "です！！！！！");
            status.media(imgfile);
            mTwitter.updateStatus(status);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {

        super.onPostExecute(result);
        dialog.dismiss();
        System.out.println("ぽすと");
    }

}