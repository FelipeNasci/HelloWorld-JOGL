# HelloWorld-JOGL

#Configuração inicial OpenGL com Java

## Bibliotecas
Realize o [Download](
http://jogamp.org/deployment/jogamp-current/archive/) da bilbioteca JOGL

````
Baixar o JOGL para todas as plataformas
Baixar o jogl-javadoc
````

[!2-download](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/2-download.PNG?raw=true)

Crie uma pasta para alocar as bibliotecas que serão utilizadas

Descompacte o arquivo **jogamp-all-platforms** e caminhe até a pasta **JAR**

Selecione os arquivos:  

````
gluegen-rt
jogl-all
gluegen-rt-natives-windows-amd64
gluegen-rt-natives-windows-i586
jogl-all-natives-windows-amd64
jogl-all-natives-windows-i586
````

Copie e cole na pasta criada para alocar as biliotecas

[!3-libs](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/3-llibs.PNG?raw=true)

Copie o java-doc baixado para esta mesma pasta

## Configure o Netbeans

Abra o netbeans > Ferramentas > Bibliotecas > Nova Biblioteca

[!4-netbeans](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/4-netbeans.png?raw=true)

[!5-criar-libs](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/5-criar-libs.PNG?raw=true)

````
Nome da Bibblioteca: JOGL
````

[!6-add-libs](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/6-add-libs.png?raw=true)

Adicione as bibliotecas que estão separadas na pasta que você criou

Adicione o java doc separado na biblioteca

[!7-lib-add](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/7-lib-add.PNG?raw=true)

[!8-add-doc](https://github.com/FelipeNasci/HelloWorld-JOGL/blob/master/images/8-add-doc.PNG?raw=true)

PRONTO!

Referência
[Setting up JOGL with Netbeans](https://www.youtube.com/watch?v=eQbgJQozAEc)
