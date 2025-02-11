public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
