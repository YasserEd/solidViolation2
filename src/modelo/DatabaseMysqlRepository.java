package modelo;

import bd.DatabaseMysql;

public class DatabaseMysqlRepository implements OrderRepository {

    @Override
    public void save(Order order) {
        // Lógica para guardar en la base de datos
        DatabaseMysql databaseMysql = new DatabaseMysql();
        databaseMysql.guardar();
    }
}
