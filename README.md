![ToDoList](https://user-images.githubusercontent.com/81682147/150969156-077faa2a-bcd2-4f71-b193-9a764e7b430a.png)
> Vincent RODRIGUEZ
## ToDoList avec Android Studio :

**Fonctionnement :**
* Application crée avec comme base un projet "Tabbed Activity" auquelle j'ai ajouté différents fragments qui sont inflate en fonction des tabs cliquée.
* L'activité par défaut est composée d'un RecyclerView dont les éléments sont affichés en fonction d'une ArrayList "Task". 
* "Task" est l'objet représentant une tâche, il a un titre, une date de début et de fin. Le ReyclerView se met à jour à chaque modification de l'ArrayList "Task".
* Les tâches sont cochables et supprimables.


**Améliorations possibles :**
* Lier les tâches à l'onglet Calendrier.
* Faire un swipe ou pourquoi pas un appui long pour supprimer une tâche plutôt qu'une image cliquable.
