package roberto.nobrega.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    /*
            Aqui, no método abaixo, (aula 22, da Seção 1), o Prof.Marco ensina que é possível transformar um WebSite
            (que se encontra hospedado na Internet) em um Aplicativo Nativo do Android.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webview); // OBS: Na aula, R.id.webview  existe na classe R, mas no meu ainda
        // não existe. Ou seja, tem que criar a variável webview (meu problema é "saber" o que ela recebe de valor).
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("");  // Aqui, insira o nome de seu site (que está na WEB), para poder ser
        // transformada em um aplicativo nativo do Android.
    }
}