package roberto.nobrega.appminhaideia;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

// Esta classe será para a tela de Splash de nosso aplicativo.

public class SplashActivity extends AppCompatActivity{

    int tempoDeEspera = 1000 * 5;   // 5000 milissegundos (5 segundos).
    String TAG = "APP_MINHA_IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // OBS: logd (seguido de ctrl mais a tecla de espaço, vai mostrar uma opção de função a ser inserida (logo abaixo)).
        Log.d(TAG, "Tela de Splash Carregada.");  // Este método exibe mensagem no Logcat do AndroidStudio. OBS: A mensagem
        // será exibida quando o aplicativo que estamos criando, for executado em um celular físico (conectado ao computador, sendo
        // reconhecido pelo AndroidStudio) ou em um emulador de Android.
        trocarTela();  // Chamando o método trocarTela. Ele não recebe nenhum argumento em sua chamada.
    }

    private void trocarTela(){
        // OBS: Está usando o "camelCase", para a elaboração de nomes dos métodos criados pelo programador.
        Log.d(TAG, "trocarTela: Mudando de Tela..."); // Exibindo mensagem no Logcat.
        // Abaixo, iremos colocar um tempo (tempo de 5000 milissegundos (5 segundos), para mudar de uma tela para outra).
        // A classe Handler é nativa do Android. Ela permite o que será executado (como se fosse uma tarefa em segundo plano. Neste
        // nosso exemplo será a parte da contagem de tempo).

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Log.d(TAG, "trocarTela: Esperando um tempo..."); // Exibindo mensagem no Logcat.
                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class); // Instanciando um objeto da classe
                // Intent. O construtor está recebendo dois argumentos (neste caso, duas classes). O primeiro argumento é para informar em
                // qual classe o método trocarTela se encontra (ou seja, a classe SplashActivity), enquanto que o segundo argumento é a
                // classe que se deseja ir (ou seja, ir para a classe MainActivity).
                startActivity(trocarDeTela); // Realizando a ação de trocar de tela.
                finish();  // Finalizando.
            }
        }, tempoDeEspera); // Chamando o postDelayed.

        //      OBS: Os códigos abaixo foram inseridos, assumindo que não tivesse sido inserido o método postDelayed acima.
        //Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class); // Instanciando um objeto da classe
        // Intent. O construtor está recebendo dois argumentos (neste caso, duas classes). O primeiro argumento é para informar em
        // qual classe o método trocarTela se encontra (ou seja, a classe SplashActivity), enquanto que o segundo argumento é a
        // classe que se deseja ir (ou seja, ir para a classe MainActivity).
        //startActivity(trocarDeTela); // Realizando a ação de trocar de tela.
        //finish();  // Finalizando.
    }


}