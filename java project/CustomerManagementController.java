@RestController
@RequestMapping("/customer")
public class CustomerManagementController {

    @GetMapping
    public ResponseEntity<String> getCustomerData() {
        return ResponseEntity.ok("Customer data");
    }

    @PostMapping
    public ResponseEntity<String> createCustomer() {
        return ResponseEntity.ok("Customer created");
    }
}
