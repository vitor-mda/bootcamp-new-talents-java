package personapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String showInfo() {
        return
                "<div style=\"font-family: monospace\"><b>======================== I N S T R U C T I O N S ========================</b>" +
                "<br><br>Access /person resource to perform GET, POST, PUT and DELETE HTTP methods." +
                "<br><br><ul><li>GET returns every recorded person;</li>" +
                "<li>POST records a new person;</li>" +
                "<li>GET (with /id) returns the identified person;</li>" +
                "<li>PUT (with /id) updates the identified person;</li>" +
                "<li>DELETE (with /id) deletes the identified person;</li></ul>" +
                "<br><br><b>======================= P E R S O N___F O R M A T =======================</b>" +
                "<br><br>{\"firstName\" : String(min = 2, max = 100, not empty)," +
                "<br>\"lastName\" : String(min = 2, max = 100, not empty)," +
                "<br>\"cpf\" : String(validated, not empty)," +
                "<br>\"birthDate\" : String(Format = dd-MM-yyyy)," +
                "<br>\"phones\" : Phone[](validated, not empty)}" +
                "<br><br><b>======================== P H O N E___F O R M A T ========================</b>" +
                "<br><br>{\"type\" : String(enum = \"HOME\"|\"MOBILE\"|\"COMMERCIAL\", not empty)," +
                "<br>\"number\" : String(min = 13, max = 14, not empty)}" +
                "<br><br>Ids for both people and phones are of type Long and auto-generated." +
                "<br><br><hr><a href=\"https://github.com/vitor-mda/bootcamp-new-talents-java/tree/master/person-api\" target=\"_blank\">" +
                "<svg height=\"13\" aria-hidden=\"true\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"13\" data-view-component=\"true\" class=\"octicon octicon-mark-github v-align-middle\">\n" +
                    "<path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z\"></path>\n" +
                "</svg> GitHub repo</a></div>";
    }
}
