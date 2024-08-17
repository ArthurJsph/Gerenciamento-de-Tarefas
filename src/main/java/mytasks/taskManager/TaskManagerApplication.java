package mytasks.taskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagerApplication implements CommandLineRunner{
    
     @Autowired
    private TarefaService tarefaService;

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
}
