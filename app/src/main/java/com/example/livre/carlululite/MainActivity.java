package com.example.livre.carlululite;

import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Registro> aRegistro;
    TelaPrincipal tela_principal;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.tela_principal);
        aRegistro = new ArrayList<Registro>();

        tela_principal = new TelaPrincipal(this);
        tela_cadastro = new TelaCadastroUsuario(this, tela_principal);
        tela_listagem = new TelaListagemUsuarios(this, tela_principal);
        tela_principal.setTelaCadastro(tela_cadastro);
        tela_principal.setTelaListagem(tela_listagem);

        tela_principal.CarregarTela();//iniciar tela app

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public ArrayList<Registro> getRegistros() {
        return aRegistro;
    }

    public void ExibirMensagem(String msg) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivity.this);
        d.setTitle("Aviso");
        d.setMessage(msg);
        d.setNeutralButton("OK", null);
        d.show();
    }

    public void Carregatelasobre() {
        setContentView(R.layout.sobre);//eu adicionei para o menu no alto
    }
    //ate aki codigo apostila


    //fim do meu codigo

    //codigo menu   olha no final do desenvolvimento!!!

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
