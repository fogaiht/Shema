//package fogaiht.shema;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//
///**
// * Created by thiago on 20/01/17.
// */
//public class Faq extends AppCompatActivity{
//
//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), MainActivity.class));
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.site);
//
////        WebView webview = (WebView) findViewById(R.id.wv);
//
////        webview.loadUrl("http://shemadeuschama.wixsite.com/shema");
//
//
//        String url ="http://shemadeuschama.wixsite.com/shema";
//        WebView view = (WebView)this.findViewById(R.id.wv);
//        view.getSettings().setJavaScriptEnabled(true);
//        view.loadUrl(url);
//        view.setWebViewClient(new MyBrowser());
//    }
//    private class MyBrowser extends WebViewClient {
//        @Override public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url); return true;
//        }
//    }
//}