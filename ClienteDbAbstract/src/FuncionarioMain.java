import model.Funcionario;
import repository.FuncionarioRepository;
import service.FuncionarioService;
import java.sql.SQLException;

public class FuncionarioMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Funcionario funcionario = new Funcionario(2,"Emanuel","01102203344",10.00);

        FuncionarioService service = new FuncionarioService();

        service.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " - meu filho");

        service.update(funcionario);

        FuncionarioRepository repository = new FuncionarioRepository();

        repository.findAll();

        repository.findById(1);

    }
}
