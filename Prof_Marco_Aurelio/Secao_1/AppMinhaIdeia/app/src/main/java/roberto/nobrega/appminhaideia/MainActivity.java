package roberto.nobrega.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// OBS: Essa classe vai "carregar" nosso app.
// OBS2:   Toda classe, quando é uma Activity, possui um xml associado a classe.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){ // Este método vai ser chamado, para "startar" o app.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}