public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
