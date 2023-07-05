# MapaDeSala_JAVA
Documentação do Programa SalaDeAula
Este programa em Java foi desenvolvido para gerenciar uma sala de aula, permitindo visualizar o mapa da sala, reservar e liberar lugares, visualizar detalhes de um lugar específico e visualizar o mapa da sala com os nomes dos alunos.

Funcionalidades
O programa oferece as seguintes funcionalidades:

Visualizar mapa da sala: Mostra um mapa da sala com os lugares ocupados marcados com "X" e os lugares vazios marcados com espaço em branco.

Reservar lugar: Permite ao usuário reservar um lugar informando a linha e coluna correspondentes. Se o lugar já estiver ocupado, uma mensagem de erro é exibida. O usuário também deve fornecer o nome do aluno que vai ocupar o lugar.

Liberar lugar: Permite ao usuário liberar um lugar informando a linha e coluna correspondentes. Se o lugar estiver vazio, uma mensagem de erro é exibida.

Visualizar detalhes do lugar: Permite ao usuário visualizar os detalhes (linha, coluna e nome do aluno) de um lugar específico informando a linha e coluna correspondentes.

Visualizar mapa de lugares com nomes: Mostra um mapa da sala com os nomes dos alunos nos lugares ocupados e espaço em branco nos lugares vazios.

Como usar o programa
Ao iniciar o programa, será solicitado que o usuário informe o número de linhas e colunas da sala de aula.

Em seguida, um menu será exibido com as opções disponíveis. O usuário pode selecionar a opção desejada digitando o número correspondente.

Para reservar um lugar, o usuário deve selecionar a opção "2" e informar a linha e coluna do lugar desejado. Se o lugar estiver ocupado, o usuário será solicitado a inserir o nome de um aluno para o lugar. Caso contrário, o lugar será reservado com sucesso.

Para liberar um lugar, o usuário deve selecionar a opção "3" e informar a linha e coluna do lugar a ser liberado. Se o lugar estiver vazio, uma mensagem de erro será exibida.

Para visualizar os detalhes de um lugar, o usuário deve selecionar a opção "4" e informar a linha e coluna correspondentes. Os detalhes do lugar, como linha, coluna e nome do aluno, serão exibidos na tela.

Para visualizar o mapa da sala com os nomes dos alunos, o usuário deve selecionar a opção "5". O mapa será exibido com os nomes dos alunos nos lugares ocupados e espaço em branco nos lugares vazios.

O usuário pode repetir as operações desejadas até selecionar a opção "0" para sair do programa.

Tratamento de erros
O programa realiza tratamento de erros para garantir a entrada correta do usuário. Por exemplo, se o usuário tentar reservar um lugar fora dos limites da sala, uma mensagem de erro será exibida. Da mesma forma, se o usuário tentar liberar um lugar que já está vazio, uma mensagem de erro será exibida.

Além disso, o programa corrige a entrada do usuário caso ele insira um nome inválido ao reservar um lugar, solicitando que insira um nome válido.

Estrutura do código
O código do programa está dividido em várias funções para facilitar a leitura e organização do código. Abaixo está a descrição de cada uma dessas funções:

main: A função principal que inicia o programa. Nela, é solicitado ao usuário o número de linhas e colunas da sala de aula e inicializa as matrizes mapaAlunos e mapaLugares. Em seguida, exibe o menu de opções e trata a escolha do usuário.

mostrarMapa: Função responsável por exibir o mapa da sala de aula. Percorre a matriz mapaLugares e exibe um "X" nos lugares ocupados e um espaço em branco nos lugares vazios.

reservarLugar: Função para reservar um lugar na sala de aula. Solicita ao usuário a linha e coluna do lugar desejado. Se o lugar estiver ocupado, solicita o nome do aluno. Realiza as devidas validações e registra o aluno na matriz mapaAlunos e marca o lugar como ocupado na matriz mapaLugares.

liberarLugar: Função para liberar um lugar previamente reservado. Solicita ao usuário a linha e coluna do lugar a ser liberado. Verifica se o lugar está ocupado e, em caso positivo, remove o aluno da matriz mapaAlunos e marca o lugar como vazio na matriz mapaLugares.

visualizarDetalhesLugar: Função para exibir os detalhes de um lugar específico. Solicita ao usuário a linha e coluna do lugar e exibe as informações daquele lugar, como linha, coluna e nome do aluno.

mostrarMapaNomes: Função para exibir o mapa da sala de aula com os nomes dos alunos. Percorre a matriz mapaAlunos e exibe os nomes dos alunos nos lugares ocupados e espaços em branco nos lugares vazios.

Essas são as principais funções do programa, responsáveis por suas funcionalidades. O programa também utiliza estruturas de repetição e condicionais para realizar as validações e repetir as operações conforme a escolha do usuário.
