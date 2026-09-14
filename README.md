# GuiaFridrich

Aplicativo Android offline para consulta de algoritmos do método **Fridrich (CFOP)** para resolução do cubo mágico 3×3×3.

O **GuiaFridrich** foi desenvolvido com o objetivo de oferecer uma forma simples, rápida e totalmente offline de consultar os casos e seus respectivos algoritmos durante o estudo e treinamento de cubo mágico.

---

## Sobre o aplicativo

O aplicativo reúne os algoritmos das três principais etapas do método CFOP:

* **F2L — First Two Layers**
* **OLL — Orientation of the Last Layer**
* **PLL — Permutation of the Last Layer**

Ao todo, o aplicativo possui **119 casos**:

| Etapa     | Quantidade |
| --------- | ---------: |
| F2L       |         41 |
| OLL       |         57 |
| PLL       |         21 |
| **Total** |    **119** |

Cada caso possui uma imagem representando a configuração do cubo e seu respectivo algoritmo.

O aplicativo funciona **offline**, não dependendo de conexão com a internet para consultar os algoritmos.

---

## Recursos

###  F2L, OLL e PLL

O usuário pode alternar facilmente entre as três etapas através dos botões superiores:

**F2L | OLL | PLL**

A etapa selecionada fica destacada visualmente.

###  Modo vertical

No modo vertical, cada caso é apresentado em um cartão contendo:

* imagem da configuração do cubo;
* identificação do caso;
* algoritmo correspondente.

Esse modo é indicado para estudar cada caso individualmente.

###  Modo quadro

O aplicativo também possui um modo de visualização em quadro.

Os casos são apresentados em uma grade de **4 colunas**, mostrando somente as imagens.

Isso permite localizar rapidamente um caso visualmente.

Ao tocar em uma miniatura, o aplicativo retorna para o modo vertical e posiciona a tela no caso selecionado.

###  Funcionamento offline

Os algoritmos e imagens fazem parte do próprio aplicativo.

Não é necessário:

* criar uma conta;
* fazer login;
* utilizar um servidor;
* possuir conexão com a internet.

---

## 📦 APK

Na raiz deste repositório existe um arquivo `.apk` correspondente à versão compilada mais recente do aplicativo.

Exemplo:

```text
/
├── APK
├── app/
├── ...
└── README.md
```

O APK pode ser baixado diretamente pelo GitHub e instalado em um dispositivo Android compatível.

> **Observação:** o APK disponibilizado no repositório representa a versão mais recente compilada deste projeto.

---

# 📥 Como baixar e instalar

## 1. Baixe o APK

Baixe o arquivo `.apk` disponível na raiz deste repositório.

## 2. Transfira para o celular

Caso o download seja feito em um computador, transfira o APK para o dispositivo Android.

Também é possível realizar o download diretamente pelo navegador do celular.

## 3. Instale o aplicativo

Abra o arquivo `.apk`.

Dependendo da versão do Android, poderá aparecer uma mensagem informando que a instalação de aplicativos dessa origem não é permitida.

Nesse caso, permita a instalação para o aplicativo utilizado para abrir o APK, como o navegador ou gerenciador de arquivos.

Depois disso, confirme a instalação.

## 4. Execute o GuiaFridrich

Após a instalação, o aplicativo aparecerá normalmente na lista de aplicativos do Android.

O ícone do aplicativo é baseado em um cubo mágico e utiliza a identidade visual dourada do projeto.

---

#  Código-fonte

O repositório também contém os arquivos-fonte utilizados para desenvolver o aplicativo.

A estrutura principal do projeto Android segue o padrão:

```text
app/
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── adrian/
        │           └── guiafridrich/
        │               └── MainActivity.java
        │
        └── res/
            ├── drawable/
            ├── layout/
            └── values/
```

Entre os principais arquivos utilizados estão:

```text
MainActivity.java
activity_main.xml
item_algoritmo.xml
item_miniatura.xml
```

Além dos arquivos de recursos visuais presentes em `drawable`.

As imagens dos casos seguem o padrão:

```text
F2L:
f2l_01.png
f2l_02.png
...
f2l_41.png

OLL:
oll_01.png
oll_02.png
...
oll_57.png

PLL:
pll_01_u1.png
pll_02_u2.png
...
pll_21_g4.png
```

---

#  Desenvolvimento

O aplicativo foi desenvolvido para Android utilizando **Java** e layouts **XML**.

A interface utiliza recursos nativos do Android, enquanto os algoritmos e imagens ficam armazenados localmente no aplicativo.

O projeto também pode ser aberto e compilado diretamente no **AIDE**, permitindo desenvolver e testar o aplicativo utilizando um dispositivo Android.

---

#  Como abrir o projeto no AIDE

O projeto pode ser utilizado no **AIDE (Android IDE)** para Android.

## 1. Obtenha o código-fonte

Baixe ou clone este repositório no dispositivo Android.

Se estiver utilizando o Git:

```bash
git clone URL_DO_REPOSITORIO
```

Substitua `URL_DO_REPOSITORIO` pelo endereço deste repositório.

Também é possível baixar o projeto como `.zip` pelo GitHub e extraí-lo no armazenamento do dispositivo.

---

## 2. Abra o projeto no AIDE

Abra o AIDE e selecione a opção para abrir um projeto existente.

Localize a pasta do projeto:

```text
GuiaFridrich/
```

O AIDE deverá reconhecer a estrutura do projeto Android.

---

## 3. Aguarde a configuração do projeto

Na primeira abertura, o AIDE poderá precisar configurar ou sincronizar os arquivos do projeto.

Aguarde o processo terminar antes de tentar executar o aplicativo.

---

## 4. Compile e execute

Com o projeto aberto, utilize a opção **Run/Executar** do AIDE.

O AIDE irá compilar o projeto e instalar a versão de desenvolvimento no dispositivo.

Caso o dispositivo esteja configurado para permitir instalação de aplicativos desenvolvidos localmente, o aplicativo poderá ser executado diretamente após a compilação.

---

#  Como gerar um APK pelo AIDE

Para gerar uma nova versão compilada:

1. Abra o projeto no AIDE.
2. Faça as alterações desejadas.
3. Salve os arquivos.
4. Execute a opção de **Build/Compilar**.
5. Aguarde a conclusão da compilação.
6. O AIDE irá gerar o APK do projeto.

O APK gerado poderá então ser utilizado para testes ou distribuído para outros dispositivos Android.

> O local exato onde o AIDE salva o APK pode variar de acordo com a versão do AIDE e a configuração do projeto.

---

#  Modificando os algoritmos

Os algoritmos utilizados pelo aplicativo estão organizados no arquivo:

```text
algoritmos.txt
```

Esse arquivo contém os casos utilizados pelo aplicativo para F2L, OLL e PLL.

As imagens correspondentes aos casos ficam dentro de:

```text
app/src/main/res/drawable/
```

Quando um novo caso ou uma alteração for realizada, é importante manter a correspondência entre o algoritmo e a imagem utilizada pelo aplicativo.

---

#  Interface

A interface utiliza uma identidade visual baseada principalmente em:

* dourado;
* bege;
* branco/off-white;
* preto e tons neutros.

Alguns dos principais recursos visuais são:

```text
botao_selecionado.xml
botao_inativo.xml
fundo_cartao.xml
item_algoritmo.xml
item_miniatura.xml
```

Os botões F2L, OLL e PLL utilizam diferentes estados visuais para indicar a etapa atualmente selecionada.

---

#  Objetivo do projeto

O GuiaFridrich foi criado como uma ferramenta simples de estudo para praticantes de cubo mágico que utilizam o método CFOP.

A proposta é oferecer acesso rápido aos algoritmos sem depender de conexão com a internet e sem a necessidade de navegar por páginas da web durante o treinamento.

---

#  Status do projeto

**Versão atual:** versão disponível no APK da raiz do repositório.

**Status:** funcional e em desenvolvimento.

Novas melhorias de interface e recursos poderão ser adicionadas futuramente.

