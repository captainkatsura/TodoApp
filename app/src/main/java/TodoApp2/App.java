/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TodoApp2;

import controller.ProjectController;
import util.ConnectionFactory;
import java.sql.Connection;
import java.util.List;
import model.Project;

public class App {

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        
        // salvar novo projeto
//        project.setName("Projeto teste");
//        project.setDescription("descricao");
//        projectController.save(project);

        // alterar info de projeto que j� existe
//        project.setId(1);
//        project.setName("nome mudado teste");
//        project.setDescription("mudou!!");
//        projectController.update(project);

        // listar projetos
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos: " + projects.size());
        
        // deletar com o id
        //projectController.removeById(1);
    }
}