
/**
 * @author Ahmed Al Hashmi @Hashimati
 *
 */
package io.hashimati.usersservices.repository;


import io.hashimati.usersservices.domains.User; 
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;


// an interface to handle user crud
// annotate the user repository,
@JdbcRepository(dialect = Dialect.MYSQL)
public interface UserRepository extends CrudRepository<User, Long>
{
    public User findUserByUsername(String username);
    public boolean existsByUsername(String username); 
}
