import model.Diretor;
import repository.DiretorRepository;
import service.DiretorService;

import java.sql.SQLException;

public class DiretorMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(3,"Renan","03142653090",1000.00,100.00);

        DiretorService service = new DiretorService();

        service.save(diretor);

        diretor.setNome(diretor.getNome() + " - alterado");

        service.update(diretor);

        DiretorRepository repository = new DiretorRepository();

        repository.findAll();

        repository.findById(1);

    }
}
