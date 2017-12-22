package com.example.livre.carlululite;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaPrincipal {
    MainActivity act;

    Button btncadastrar_usuario;
    Button btn_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

    public TelaPrincipal(MainActivity act) {
        this.act = act;
        Toast.makeText(act, "sistema de ar condicionado", Toast.LENGTH_SHORT).show();
    }

    public void CarregarTela() {
        act.setContentView(R.layout.tela_principal);
        btncadastrar_usuario = (Button) act.findViewById(R.id.btcadastrar_usuario);
        btn_listar_usuarios_cadastrados = (Button) act.findViewById(R.id.bt_listar_usuarios_cadastrados);

        //Toast.makeText(act,"bem vindo",Toast.LENGTH_SHORT).show();// saudação tela inicial da aplicação poremexecutava sepre que a tela era criada mude de lugar

        btncadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }

        });

        btn_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            //erro com metodo do botão desse metodo
            public void onClick(View view) {
                tela_listagem.CarregaTela();    //CarregarTela();//vem da classe telalistagemusuario
            }
        });
    }



    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro)
    {

        this.tela_cadastro = tela_cadastro;
    }

    public void setTelaListagem(TelaListagemUsuarios tela_listagem)
    {

        this.tela_listagem = tela_listagem;//na apostila estav assim TelaPrincipal.tela_listagem
    }


}