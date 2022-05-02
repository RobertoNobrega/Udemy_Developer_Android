package roberto.nobrega.primeironivelamentojava;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import roberto.nobrega.primeironivelamentojava.model.Cliente;

// OBS: Este projeto foi criado com base nos ensinamentos das aulas 21 (Seção 1)
//    O prof. Marco ensina a construir esse app usando a Arquitetura MVC.

public class MainActivity extends AppCompatActivity {
    // OBS: A classe MainActivity estará associada ao activity_main.xml

    String TAG = "APP_MINHA_IDEIA";
    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // "Carregando a tela activity_main".
        // Abaixo, está instanciando um objeto da classe Cliente.
        objCliente = new Cliente("Maddo","teste@teste.com","22330088",55,true);
        // Abaixo, estará exibindo os dados no LogCat do AndroidStudio.
        Log.i(TAG,"Nome: " + objCliente.getNome());
        Log.i(TAG,"Email: " + objCliente.getEmail());
        Log.i(TAG,"Telefone: " + objCliente.getTelefone());
        Log.i(TAG,"Idade: " + objCliente.getIdade());
        Log.i(TAG,"Sexo: " + objCliente.isSexo());
    }
}