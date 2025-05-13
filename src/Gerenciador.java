import java.util.ArrayList;
import java.util.List;

public class Gerenciador {

    private List<Tarefa> tarefas;

    public Gerenciador() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listarTarefas() {
        System.out.println("📋 LISTA DE TAREFAS:");
        for (int i = 0; i < tarefas.size(); i++) {
            String status = tarefas.get(i).isConcluida() ? "✅" : "⏳";
            System.out.println((i+1) + ". " + status + " " + tarefas.get(i).getDescricao());
        }
    }
}
