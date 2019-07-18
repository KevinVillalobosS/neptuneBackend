package jupiter.jupiter;

import jupiter.jupiter.models.Propuesta;
import jupiter.jupiter.repository.RepositorioPropuestas;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
    private RepositorioPropuestas repoProp;

    public DbSeeder(RepositorioPropuestas repoProp){
        this.repoProp = repoProp;
    }


    @Override
    public void run(String... args) throws Exception {
        Propuesta propuesta1 = new Propuesta(
                "1",
                "Titanium",
                "FACH",
                "2",
                "01/02/2019",
                "Pendiente"
        );
        Propuesta propuesta2 = new Propuesta(
                "2",
                "Nuevo Pudahuel",
                "EFE",
                "3",
                "03/05/2016",
                "aprobado"
        );
        Propuesta propuesta3 = new Propuesta(
                "3",
                "Cau Cau",
                "EFE",
                "3",
                "20/12/2019",
                "Pendiente"
        );

        //Se limpia la base de datos de pruebas
        this.repoProp.deleteAll();

        //Se agregan elementos de prueba
        this.repoProp.save(propuesta1);
        this.repoProp.save(propuesta2);
        this.repoProp.save(propuesta3);
    }


}
