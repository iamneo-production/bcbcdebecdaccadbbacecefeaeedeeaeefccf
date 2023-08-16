@RestController
public class ApiController {
    @GetMapping("")
    public String welcome(){
        return "Welcome String Boot!"
    }
}
