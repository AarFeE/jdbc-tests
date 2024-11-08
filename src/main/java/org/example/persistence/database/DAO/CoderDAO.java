package org.example.persistence.database.DAO;

import org.example.models.CoderEntity;
import org.example.persistence.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CoderDAO {
    public void addCoder(CoderEntity coder) {
        String sql = "INSERT INTO coders(name, technologies, experience, clan) VALUES (?, ?, ?, ?)";

        try(
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ) {

            statement.setString(1, coder.getName());
            statement.setString(2, String.join(",", coder.getTechnologies()));
            statement.setInt(3, coder.getExperience());
            statement.setString(4, coder.getClan());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
