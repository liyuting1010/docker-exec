package server.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUsersController {
    private final GetUsersService getUsersService;

    public GetUsersController(GetUsersService getUsersService) {
        this.getUsersService = getUsersService;
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllUsers() {
        try {
            System.out.println("get user data");
            return ResponseEntity.ok().body(getUsersService.getAll());
        } catch (IllegalStateException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
