package com.adrian.guiafridrich;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Diz qual XML é a tela desta Activity
        setContentView(R.layout.activity_main);

        // 1. Encontra a lista vazia que criamos no activity_main.xml
        LinearLayout listaAlgoritmos = findViewById(R.id.listaAlgoritmos);

        // 2. Adiciona os primeiros casos de teste puxando o molde
        adicionarCaso(listaAlgoritmos, "Caso 01", "R U R' U R U2 R'");
        adicionarCaso(listaAlgoritmos, "Caso 02", "R' U' R U' R' U2 R");
        adicionarCaso(listaAlgoritmos, "Caso 03", "R U R' U R U2 R2 U' R U' R' U2 R");
    }

    // Função que "carimba" o item_algoritmo.xml na tela
    private void adicionarCaso(LinearLayout lista, String titulo, String formula) {
        // Transforma o arquivo XML em um objeto visual (View)
        View molde = LayoutInflater.from(this).inflate(R.layout.item_algoritmo, lista, false);

        // Encontra os campos de texto dentro deste molde específico
        TextView txtCaso = molde.findViewById(R.id.txtCaso);
        TextView txtAlgoritmo = molde.findViewById(R.id.txtAlgoritmo);

        // Define os textos que passamos na função
        txtCaso.setText(titulo);
        txtAlgoritmo.setText(formula);

        // Adiciona o molde preenchido na lista da tela principal
        lista.addView(molde);
    }
}
