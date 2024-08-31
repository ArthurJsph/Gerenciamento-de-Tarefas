
package mytasks.taskManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String descricao;
    private Date dataDeConclusao;
    private String status;

    public Tarefa(String descricao, Boolean concluida) {
        this.descricao = descricao;
        
    }

    public Tarefa(String status) {
        this.status = status;
    }
    
    public Tarefa(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(Date dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
}
