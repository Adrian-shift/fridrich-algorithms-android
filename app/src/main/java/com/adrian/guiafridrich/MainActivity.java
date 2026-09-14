package com.adrian.guiafridrich;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button btnF2L;
    Button btnOLL;
    Button btnPLL;
    Button btnModoVisualizacao;

    LinearLayout listaAlgoritmos;
    ScrollView scrollView;

    boolean modoQuadro = false;

    String abaAtual = "F2L";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnF2L = findViewById(R.id.btnF2L);
        btnOLL = findViewById(R.id.btnOLL);
        btnPLL = findViewById(R.id.btnPLL);
        btnModoVisualizacao = findViewById(R.id.btnModoVisualizacao);

        listaAlgoritmos = findViewById(R.id.listaAlgoritmos);
        scrollView = findViewById(R.id.scrollView);

        btnF2L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abaAtual = "F2L";
                mudarCorAba(btnF2L);
                carregarAba();
            }
        });

        btnOLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abaAtual = "OLL";
                mudarCorAba(btnOLL);
                carregarAba();
            }
        });

        btnPLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abaAtual = "PLL";
                mudarCorAba(btnPLL);
                carregarAba();
            }
        });

        btnModoVisualizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                modoQuadro = !modoQuadro;

                carregarAba();

            }
        });

        mudarCorAba(btnF2L);

        carregarAba();
    }


    // =========================================================
    // CARREGA A ABA ATUAL
    // =========================================================

    private void carregarAba() {

        limparLista();

        if (modoQuadro) {

            btnModoVisualizacao.setText("☷");

            if (abaAtual.equals("F2L")) {
                carregarQuadroF2L();
            }
            else if (abaAtual.equals("OLL")) {
                carregarQuadroOLL();
            }
            else {
                carregarQuadroPLL();
            }

        } else {

            btnModoVisualizacao.setText("▦");

            if (abaAtual.equals("F2L")) {
                carregarF2L();
            }
            else if (abaAtual.equals("OLL")) {
                carregarOLL();
            }
            else {
                carregarPLL();
            }
        }

        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0, 0);
            }
        });
    }


    // =========================================================
    // MODO VERTICAL
    // =========================================================

    private void carregarF2L() {

        adicionarCaso("Caso F2L 01", "R U R'", R.drawable.f2l_01);
        adicionarCaso("Caso F2L 02", "L' U' L", R.drawable.f2l_02);
        adicionarCaso("Caso F2L 03", "U R U' R'", R.drawable.f2l_03);
        adicionarCaso("Caso F2L 04", "U' L' U L", R.drawable.f2l_04);
        adicionarCaso("Caso F2L 05", "U R U' R' U' F' U F", R.drawable.f2l_05);
        adicionarCaso("Caso F2L 06", "U' L' U L U F U' F'", R.drawable.f2l_06);
        adicionarCaso("Caso F2L 07", "L' U L U' L' U L", R.drawable.f2l_07);
        adicionarCaso("Caso F2L 08", "R U R' U' R U R'", R.drawable.f2l_08);
        adicionarCaso("Caso F2L 09", "R U' R' U R U' R'", R.drawable.f2l_09);
        adicionarCaso("Caso F2L 10", "L' U' L U L' U' L", R.drawable.f2l_10);
        adicionarCaso("Caso F2L 11", "R U R' U' R U R' U' R U R'", R.drawable.f2l_11);
        adicionarCaso("Caso F2L 12", "R U' R' y L' U2 L", R.drawable.f2l_12);
        adicionarCaso("Caso F2L 13", "U R U R' U2 R U R'", R.drawable.f2l_13);
        adicionarCaso("Caso F2L 14", "U F' U' F U' R U R'", R.drawable.f2l_14);
        adicionarCaso("Caso F2L 15", "U' R U' R' U2 R U' R'", R.drawable.f2l_15);
        adicionarCaso("Caso F2L 16", "U' R U R' Dw R' U' R", R.drawable.f2l_16);
        adicionarCaso("Caso F2L 17", "R U' R' U Dw R' U' R", R.drawable.f2l_17);
        adicionarCaso("Caso F2L 18", "Dw R' U2 R U2 R' U R", R.drawable.f2l_18);
        adicionarCaso("Caso F2L 19", "Dw R' U' R U2 R' U R", R.drawable.f2l_19);
        adicionarCaso("Caso F2L 20", "U' R U' R' U R U R'", R.drawable.f2l_20);
        adicionarCaso("Caso F2L 21", "U' R U R' U R U R'", R.drawable.f2l_21);
        adicionarCaso("Caso F2L 22", "Dw R' U2 R Dw' R U R'", R.drawable.f2l_22);
        adicionarCaso("Caso F2L 23", "R U R' U2 R U' R' U R U' R'", R.drawable.f2l_23);
        adicionarCaso("Caso F2L 24", "U' R U2 R' U2 R U' R'", R.drawable.f2l_24);
        adicionarCaso("Caso F2L 25", "U' R U R' U2 R U' R'", R.drawable.f2l_25);
        adicionarCaso("Caso F2L 26", "Dw R' U R U' R' U' R", R.drawable.f2l_26);
        adicionarCaso("Caso F2L 27", "U' R U' R' U F' U' F", R.drawable.f2l_27);
        adicionarCaso("Caso F2L 28", "U' R U2 R' U F' U' F", R.drawable.f2l_28);
        adicionarCaso("Caso F2L 29", "R U R' U2 R U R' U' R U R'", R.drawable.f2l_29);
        adicionarCaso("Caso F2L 30", "U2 R U R' U R U' R'", R.drawable.f2l_30);
        adicionarCaso("Caso F2L 31", "U R U2 R' U R U' R'", R.drawable.f2l_31);
        adicionarCaso("Caso F2L 32", "R U2 R' U' R U R'", R.drawable.f2l_32);
        adicionarCaso("Caso F2L 33", "L' U' L U2 L' U' L U L' U' L", R.drawable.f2l_33);
        adicionarCaso("Caso F2L 34", "U2 L' U' L U' L' U L", R.drawable.f2l_34);
        adicionarCaso("Caso F2L 35", "U' L' U2 L U' L' U L", R.drawable.f2l_35);
        adicionarCaso("Caso F2L 36", "L' U2 L U L' U' L", R.drawable.f2l_36);
        adicionarCaso("Caso F2L 37", "R U' R' Dw R' U2 R U R' U2 R", R.drawable.f2l_37);
        adicionarCaso("Caso F2L 38", "R U R' U2 R U' R' U R U R'", R.drawable.f2l_38);
        adicionarCaso("Caso F2L 39", "R U R' U' R U2 R' U' R U R'", R.drawable.f2l_39);
        adicionarCaso("Caso F2L 40", "R U R' U' R U' R' U2 F' U' F", R.drawable.f2l_40);
        adicionarCaso("Caso F2L 41", "R U' R' Dw R' U' R U' R' U' R", R.drawable.f2l_41);
    }


    private void carregarOLL() {

        adicionarCaso("Caso OLL 01", "R U R' U R U2 R'", R.drawable.oll_01);
        adicionarCaso("Caso OLL 02", "R' U' R U' R' U2 R", R.drawable.oll_02);
        adicionarCaso("Caso OLL 03", "R U R' U R U' R' U R U2 R'", R.drawable.oll_03);
        adicionarCaso("Caso OLL 04", "R U2 R2 U' R2 U' R2 U2 R", R.drawable.oll_04);
        adicionarCaso("Caso OLL 05", "Rw U R' U' Rw' F R F'", R.drawable.oll_05);
        adicionarCaso("Caso OLL 06", "R2 D' R U2 R' D R U2 R", R.drawable.oll_06);
        adicionarCaso("Caso OLL 07", "F R' F' Rw U R U' Rw'", R.drawable.oll_07);
        adicionarCaso("Caso OLL 08", "F R U R' U' F'", R.drawable.oll_08);
        adicionarCaso("Caso OLL 09", "R U R' U' R' F R F'", R.drawable.oll_09);
        adicionarCaso("Caso OLL 10", "F U R U' R' F'", R.drawable.oll_10);
        adicionarCaso("Caso OLL 11", "R' U' F' U F R", R.drawable.oll_11);
        adicionarCaso("Caso OLL 12", "S R U R' U' R' F R Fw'", R.drawable.oll_12);
        adicionarCaso("Caso OLL 13", "R' U' F U R U' R' F' R", R.drawable.oll_13);
        adicionarCaso("Caso OLL 14", "F R U R' U' R U R' U' F'", R.drawable.oll_14);
        adicionarCaso("Caso OLL 15", "R' U' R' F R F' R' F R F' U R", R.drawable.oll_15);
        adicionarCaso("Caso OLL 16", "Lw' U' L U' L' U L U' L' U2 Lw", R.drawable.oll_16);
        adicionarCaso("Caso OLL 17", "Rw U R' U R U' R' U R U2 Rw'", R.drawable.oll_17);
        adicionarCaso("Caso OLL 18", "R' F R2 B' R2 F' R2 B R'", R.drawable.oll_18);
        adicionarCaso("Caso OLL 19", "Rw U' Rw2 U Rw2 U Rw2 U' Rw", R.drawable.oll_19);
        adicionarCaso("Caso OLL 20", "F R' F' R U R U' R'", R.drawable.oll_20);
        adicionarCaso("Caso OLL 21", "R U2 R2 F R F' R U2 R'", R.drawable.oll_21);
        adicionarCaso("Caso OLL 22", "Lw' U2 L U L' U Lw", R.drawable.oll_22);
        adicionarCaso("Caso OLL 23", "Rw U2 R' U' R U' Rw'", R.drawable.oll_23);
        adicionarCaso("Caso OLL 24", "Rw U R' U R U2 RW", R.drawable.oll_24);
        adicionarCaso("Caso OLL 25", "Lw' U' L U' L' U2 Lw", R.drawable.oll_25);
        adicionarCaso("Caso OLL 26", "M R U R' U R U2 R' U M'", R.drawable.oll_26);
        adicionarCaso("Caso OLL 27", "M' R' U' R U' R' U2 R U' M", R.drawable.oll_27);
        adicionarCaso("Caso OLL 28", "R U R' U' Rw R' U R U' Rw'", R.drawable.oll_28);
        adicionarCaso("Caso OLL 29", "Rw U R' U' Rw' R U R U' R'", R.drawable.oll_29);
        adicionarCaso("Caso OLL 30", "F U R U' R' U R U' R' F'", R.drawable.oll_30);
        adicionarCaso("Caso OLL 31", "R' F R U R U' R2 F' R2 U' R' U R U R'", R.drawable.oll_31);
        adicionarCaso("Caso OLL 32", "R' F' U' F U' R U R' U R", R.drawable.oll_32);
        adicionarCaso("Caso OLL 33", "Rw U Rw' U R U' R' U R U' R' Rw U' Rw", R.drawable.oll_33);
        adicionarCaso("Caso OLL 34", "R' U' R' F R F' U R", R.drawable.oll_34);
        adicionarCaso("Caso OLL 35", "R U R2 U' R' F R U R U' F'", R.drawable.oll_35);
        adicionarCaso("Caso OLL 36", "R U R' U R U' R' U' R' F R F'", R.drawable.oll_36);
        adicionarCaso("Caso OLL 37", "L' U' L U' L' U L U L F' L' F", R.drawable.oll_37);
        adicionarCaso("Caso OLL 38", "L F' L' U' L U F U' L'", R.drawable.oll_38);
        adicionarCaso("Caso OLL 39", "R' F R U R' U' F' U R", R.drawable.oll_39);
        adicionarCaso("Caso OLL 40", "R' F R U R' F' R F U' F'", R.drawable.oll_40);
        adicionarCaso("Caso OLL 41", "Rw U' Rw' U' Rw U Rw' F' U F", R.drawable.oll_41);
        adicionarCaso("Caso OLL 42", "Rw U M U R' U' Rw U' Rw'", R.drawable.oll_42);
        adicionarCaso("Caso OLL 43", "Lw' U' M U' L U Lw' U Lw", R.drawable.oll_43);
        adicionarCaso("Caso OLL 44", "R U R' U' R U' R' F' U' F R U R'", R.drawable.oll_44);
        adicionarCaso("Caso OLL 45", "F U R U2 R' U' R U2 R' U' F'", R.drawable.oll_45);
        adicionarCaso("Caso OLL 46", "R U R' U R U2 R' F R U R' U' F'", R.drawable.oll_46);
        adicionarCaso("Caso OLL 47", "R' U' R U' R' U2 R F R U R' U' F'", R.drawable.oll_47);
        adicionarCaso("Caso OLL 48", "R U R' U' R' F R2 U R' U' F'", R.drawable.oll_48);
        adicionarCaso("Caso OLL 49", "R U R' U R' F R F' R U2 R'", R.drawable.oll_49);
        adicionarCaso("Caso OLL 50", "Rw U R' U' M2 U R U' R' U' M", R.drawable.oll_50);
        adicionarCaso("Caso OLL 51", "Rw' R U R U R' U' Rw R2 F R F'", R.drawable.oll_51);
        adicionarCaso("Caso OLL 52", "Rw U R' U R U2 Rw2 U' R U' R' U2 Rw", R.drawable.oll_52);
        adicionarCaso("Caso OLL 53", "R U R' U R' F R F' U2 R' F R F'", R.drawable.oll_53);
        adicionarCaso("Caso OLL 54", "Fw R U R' U' Fw' U' F R U R' U' F'", R.drawable.oll_54);
        adicionarCaso("Caso OLL 55", "Fw R U R' U' Fw' U F R U R' U' F'", R.drawable.oll_55);
        adicionarCaso("Caso OLL 56", "R U' R2 D' Rw U Rw' D R2 U R'", R.drawable.oll_56);
        adicionarCaso("Caso OLL 57", "R U2 R2 F R F' U2 R' F R F'", R.drawable.oll_57);
    }


    private void carregarPLL() {

        adicionarCaso("Caso U1 – horário", "R' U R' U' R' U' R' U R U R2", R.drawable.pll_01_u1);
        adicionarCaso("Caso U2 – anti-horário", "R2 U' R' U' R U R U R U' R", R.drawable.pll_02_u2);
        adicionarCaso("Caso H", "M2 U M2 U2 M2 U M2", R.drawable.pll_03_h);
        adicionarCaso("Caso Z", "M2 U M2 U M' U2 M2 U2 M' U2", R.drawable.pll_04_z);
        adicionarCaso("Caso A1", "x R2 D2 R U R' D2 R U' R", R.drawable.pll_05_a1);
        adicionarCaso("Caso A2", "x R' U R' D2 R U' R' D2 R2", R.drawable.pll_06_a2);
        adicionarCaso("Caso T", "R U R' U' R' F R2 U' R' U' R U R' F'", R.drawable.pll_07_t);
        adicionarCaso("Caso F", "R' U' F' R U R' U' R' F / R2 U' R' U' R U R' U R", R.drawable.pll_08_f);
        adicionarCaso("Caso Y", "F R U' R' U' R U R' F' / R U R' U' R' F R F'", R.drawable.pll_09_y);
        adicionarCaso("Caso E", "x' R U' R' D R U R' D' / R U R' D R U' R' D'", R.drawable.pll_10_e);
        adicionarCaso("Caso J1", "R U R' F' R U R' U' R' F R2 U' R' U'", R.drawable.pll_11_j1);
        adicionarCaso("Caso J2", "x R2 F R F' R U2 Rw' U Rw U2 x'", R.drawable.pll_12_j2);
        adicionarCaso("Caso R1", "R' U2 R U2 R' F R U R' U' R' F' R2 U'", R.drawable.pll_13_r1);
        adicionarCaso("Caso R2", "R U' R' U' R U R D R' U' R D' R' U2 R'", R.drawable.pll_14_r2);
        adicionarCaso("Caso N1", "R U R' U R U R' F' R U R' U' R' / F R2 U' R' U2 R U' R'", R.drawable.pll_15_n1);
        adicionarCaso("Caso N2", "R' U R U' R' F' U' F / R U R' F R' F' R U' R", R.drawable.pll_16_n2);
        adicionarCaso("Caso V", "R' U R' U' y R' F' R2 U' R' U R' F R F", R.drawable.pll_17_v);
        adicionarCaso("Caso G1", "R2 U R' U R' U' R U' R2 U' D R' U R D'", R.drawable.pll_18_g1);
        adicionarCaso("Caso G2", "R' U' R U D' R2 U R' U R U' R U' R2 D", R.drawable.pll_19_g2);
        adicionarCaso("Caso G3", "R2 U' R U' R U R' U R2 U D' R U' R' D", R.drawable.pll_20_g3);
        adicionarCaso("Caso G4", "R U R' U' D R2 U' R U' R' U R' U R2 D'", R.drawable.pll_21_g4);
    }


    // =========================================================
    // MODO QUADRO
    // =========================================================

    private void carregarQuadroF2L() {

        LinearLayout linha = criarLinha();

        for (int i = 1; i <= 41; i++) {

            if (linha.getChildCount() == 4) {
                listaAlgoritmos.addView(linha);
                linha = criarLinha();
            }

            adicionarMiniatura(linha, getIdImagem("f2l_" + String.format("%02d", i)));
        }

        if (linha.getChildCount() > 0) {
            listaAlgoritmos.addView(linha);
        }
    }


    private void carregarQuadroOLL() {

        LinearLayout linha = criarLinha();

        for (int i = 1; i <= 57; i++) {

            if (linha.getChildCount() == 4) {
                listaAlgoritmos.addView(linha);
                linha = criarLinha();
            }

            adicionarMiniatura(linha, getIdImagem("oll_" + String.format("%02d", i)));
        }

        if (linha.getChildCount() > 0) {
            listaAlgoritmos.addView(linha);
        }
    }


    private void carregarQuadroPLL() {

        String[] nomes = {
                "pll_01_u1",
                "pll_02_u2",
                "pll_03_h",
                "pll_04_z",
                "pll_05_a1",
                "pll_06_a2",
                "pll_07_t",
                "pll_08_f",
                "pll_09_y",
                "pll_10_e",
                "pll_11_j1",
                "pll_12_j2",
                "pll_13_r1",
                "pll_14_r2",
                "pll_15_n1",
                "pll_16_n2",
                "pll_17_v",
                "pll_18_g1",
                "pll_19_g2",
                "pll_20_g3",
                "pll_21_g4"
        };

        LinearLayout linha = criarLinha();

        for (int i = 0; i < nomes.length; i++) {

            if (linha.getChildCount() == 4) {
                listaAlgoritmos.addView(linha);
                linha = criarLinha();
            }

            adicionarMiniatura(linha, getIdImagem(nomes[i]));
        }

        if (linha.getChildCount() > 0) {
            listaAlgoritmos.addView(linha);
        }
    }


    // =========================================================
    // CRIA LINHA DO QUADRO
    // =========================================================

    private LinearLayout criarLinha() {

        LinearLayout linha = new LinearLayout(this);

        linha.setLayoutParams(
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                )
        );

        linha.setOrientation(LinearLayout.HORIZONTAL);

        return linha;
    }


    // =========================================================
    // ADICIONA MINIATURA
    // =========================================================

    private void adicionarMiniatura(
            LinearLayout linha,
            int idImagem) {

        View item = LayoutInflater.from(this)
                .inflate(R.layout.item_miniatura, linha, false);

        ImageView imagem = item.findViewById(R.id.imgMiniatura);

        imagem.setImageResource(idImagem);

        final int posicao = linha.getChildCount();

        imagem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int indice = calcularIndice(v);

                modoQuadro = false;

                carregarAba();

                rolarParaCaso(indice);
            }
        });

        linha.addView(item);
    }


    // =========================================================
    // DESCOBRE QUAL IMAGEM FOI CLICADA
    // =========================================================

    private int calcularIndice(View view) {

        View item = (View) view.getParent();

        View linhaView = (View) item.getParent();

        int indiceLinha = listaAlgoritmos.indexOfChild(linhaView);

        int indiceColuna = ((LinearLayout) linhaView).indexOfChild(item);

        return indiceLinha * 4 + indiceColuna;
    }


    // =========================================================
    // ROLA ATÉ O CASO
    // =========================================================

private void rolarParaCaso(final int indice) {

    listaAlgoritmos.post(new Runnable() {

        @Override
        public void run() {

            if (indice < 0 ||
                    indice >= listaAlgoritmos.getChildCount()) {
                return;
            }

            View caso =
                    listaAlgoritmos.getChildAt(indice);

            scrollView.smoothScrollTo(
                    0,
                    caso.getTop()
            );
        }
    });
}


private View obterCasoVertical(int indice) {

    if (indice < 0 ||
            indice >= listaAlgoritmos.getChildCount()) {
        return null;
    }

    return listaAlgoritmos.getChildAt(indice);
}




    // =========================================================
    // ADICIONA CASO VERTICAL
    // =========================================================

    private void adicionarCaso(
            String titulo,
            String formula,
            int idImagem) {

        View item = LayoutInflater.from(this)
                .inflate(
                        R.layout.item_algoritmo,
                        listaAlgoritmos,
                        false
                );

        TextView txtCaso =
                item.findViewById(R.id.txtCaso);

        TextView txtAlgoritmo =
                item.findViewById(R.id.txtAlgoritmo);

        ImageView imgCubo =
                item.findViewById(R.id.imgCubo);

        txtCaso.setText(titulo);
        txtAlgoritmo.setText(formula);
        imgCubo.setImageResource(idImagem);

        listaAlgoritmos.addView(item);
    }


    // =========================================================
    // LIMPA LISTA
    // =========================================================

    private void limparLista() {

        listaAlgoritmos.removeAllViews();
    }


    // =========================================================
    // ID DA IMAGEM PELO NOME
    // =========================================================

    private int getIdImagem(String nome) {

        return getResources().getIdentifier(
                nome,
                "drawable",
                getPackageName()
        );
    }


    // =========================================================
    // CORES DAS ABAS
    // =========================================================

    private void mudarCorAba(Button selecionado) {

        btnF2L.setBackgroundResource(
                R.drawable.botao_inativo
        );

        btnOLL.setBackgroundResource(
                R.drawable.botao_inativo
        );

        btnPLL.setBackgroundResource(
                R.drawable.botao_inativo
        );

        selecionado.setBackgroundResource(
                R.drawable.botao_selecionado
        );
    }
}
