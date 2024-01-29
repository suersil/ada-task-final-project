## ada-task-final-project
# Descrição Geral
AdaTask é um aplicativo de console para gerenciamento de tarefas. 
Ele permite aos usuários criar, editar, deletar e visualizar tarefas pessoais e profissionais. A simulação de um banco de dados será realizada através de listas em memória.

# ESTRUTURA 

# Main:
Instancia TaskRepository, TaskService, e TaskController.
Inicia o loop principal chamando taskController.startMenu().

taskController.startMenu():
Exibe um menu de opções para o usuário no console.
Aguarda a entrada do usuário e executa a operação correspondente.
O loop continua até que o usuário escolha sair (opção 0).

# Controller
## TaskController:
Gerencia a interação do usuário:
- Cria Tarefas (createTask): Solicita informações ao usuário, cria uma nova tarefa e a adiciona via TaskService.
- Edita Tarefas (editTask): Lista todas as tarefas, permite ao usuário escolher uma, coleta novas informações e chama TaskService para editar.
- Deleta Tarefas (deleteTask): Lista todas as tarefas, permite ao usuário escolher uma, e chama TaskService para excluir.
- Visualiza Todas as Tarefas (viewAllTasks): Chama TaskService para obter todas as tarefas e as exibe no console.

# Service
## TaskService:
Contém a lógica (criar, editar, excluir, visualizar tarefas).
Interage com TaskRepository para manipular os dados.

# Repository
## TaskRepository:
Gerencia a "persistência" dos dados em listas.
Oferece métodos para adicionar, remover, atualizar e buscar tarefas.

# Domain:
Contém as classes Task(interface), BaseTask, PersonalTask e WorkTask.
