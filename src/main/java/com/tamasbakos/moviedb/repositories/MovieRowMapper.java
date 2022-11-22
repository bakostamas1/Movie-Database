package com.tamasbakos.moviedb.repositories;

import com.tamasbakos.moviedb.models.Movie;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper<Movie> {

  @Override
  public Movie mapRow(ResultSet rs, int i) throws SQLException {
    return new Movie(
        rs.getInt("id"),
        rs.getString("name"),
        List.of(),
        LocalDate.parse(rs.getString("release_date"))
    );
  }
}
