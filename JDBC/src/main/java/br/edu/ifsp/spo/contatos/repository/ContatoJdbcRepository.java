package br.edu.ifsp.spo.contatos.repository;

import br.edu.ifsp.spo.contatos.model.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContatoJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SELECT_ALL_QUERY = "SELECT * FROM contato";

    private RowMapper<Contato> contatoRowMapper = new RowMapper<Contato>() {
        @Override
        public Contato mapRow(ResultSet rs, int rowNum) throws SQLException {
            Contato contato = new Contato();
            contato.setId(rs.getLong("id"));
            contato.setNome(rs.getString("nome"));
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));
            contato.setNascimento(rs.getDate("nascimento"));
            return contato;
        }
    };

    public List<Contato> findAll() {
        return jdbcTemplate.query(SELECT_ALL_QUERY, contatoRowMapper);
    }

    // Outros métodos do repositório, como save, delete, etc.
}