package com.example.livre.carlululite;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastroUsuario {
    MainActivity act;
    EditText edtnome, edttelefone, edtendereco;
    Button btncadastrar, btncancelar_cadastro;
    TelaPrincipal tela_principal;

    public TelaCadastroUsuario(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.cadastro_de_usuario);
        edtnome = (EditText) act.findViewById(R.id.ednome);
        edttelefone = (EditText) act.findViewById(R.id.edtelefone);
        edtendereco = (EditText) act.findViewById(R.id.edendereco);

        btncadastrar = (Button) act.findViewById(R.id.btncadastrar);
        btncancelar_cadastro = (Button) act.findViewById(R.id.btncancelar_cadastro);


        btncadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtnome.getText().toString().equals("")) {//
                    Toast.makeText(act, "Campo Nome de preenchimento Obrigatório", Toast.LENGTH_SHORT).show(); //this deve ser act no toast
                    //	Toast.makeText(this, "campo vazio", Toast.LENGTH_SHORT).show();
                }//
                else if (edtendereco.getText().toString().equals(""))
                    Toast.makeText(act, "Campo Endereço de preenchimento Obrigatório", Toast.LENGTH_SHORT).show();

                else if (edttelefone.getText().toString().equals(""))
                    Toast.makeText(act, "Campo Telefone de preenchimento Obriatório", Toast.LENGTH_SHORT).show();

                else {//
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                    dialogo.setTitle("Aviso Carlululite");
                    dialogo.setMessage("cadastrar usuário ?");
                    dialogo.setNegativeButton("NÂO", null);
                    dialogo.setPositiveButton("SIM", new
                            DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                    String nome = edtnome.getText().toString();
                                    String telefone = edttelefone.getText().toString();
                                    String endereco = edtendereco.getText().toString();

                                    act.getRegistros().add(new Registro(nome, telefone, endereco));
                                    act.ExibirMensagem("Cadastro Efetuado com Sucesso!!!");
                                    tela_principal.CarregarTela();

                                    //}
                                    //}
                                }
                            });
                    dialogo.show();
                }
            }//
        });


        btncancelar_cadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso Carlululite");
                dialogo.setMessage("Sair do Cadastro ?");
                dialogo.setNegativeButton("NÂO", null);
                dialogo.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tela_principal.CarregarTela();
                    }
                });
                dialogo.show();
            }
        });


    }

}