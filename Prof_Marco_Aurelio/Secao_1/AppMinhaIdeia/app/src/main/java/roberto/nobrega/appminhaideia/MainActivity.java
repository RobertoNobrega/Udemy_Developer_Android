package roberto.nobrega.appminhaideia;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// OBS: Essa classe vai "carregar" nosso app.
// OBS2:   Toda classe, quando é uma Activity, possui um xml associado a classe.

/**
 *    OBS: Ao conectar o celular físico no computador e, em seguida, o AndroidStudio o reconhecer, no logcat
 *    do AndroidStudio exibirá informações, informadas pelos aplicativos instalados no celular.
 *    No filtro do logcat (representado pela lupa), pode colocar alguma informação desejada (EX: services)
 *        OBS: LTE está "associado" com a conectividade com a operadora de celular.
 *
 *    A classe AppCompatActivity faz parte do SDK do Android. Essa classe do SDK, contém tudo que é necessário
 *    para colocar na tela do celular, a "tela visual do Activity chamado MainActivity".
 */
public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState){ // Este método vai ser chamado, para "startar" o app.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Este método está carregando uma tela (representado pelo
        // de layout ( em xml ), que é uma tela para o aplicativo. A tela que está sendo carregada é a tela
        // activity_main.xml .
        // OBS: logd (seguido de ctrl mais a tecla de espaço, vai mostrar uma opção de função a ser inserida (logo abaixo)).
        Log.d(TAG, "onCreate: Tela Principal Carregada."); // Este método exibe mensagem no Logcat do AndroidStudio.
    }

}