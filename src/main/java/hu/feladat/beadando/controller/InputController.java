package hu.feladat.beadando.controller;


import hu.feladat.beadando.controller.dto.InputTextDto;
import hu.feladat.beadando.service.InputText;
import hu.feladat.beadando.service.InputTextService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.stream.Collectors;

@RequestMapping("/input")
@RestController

public class InputController {


    private final InputTextService inputTextService;

    public InputController(InputTextService inputTextService) {
        this.inputTextService = inputTextService;
    }

    @PostMapping("/reverse")
    public void reverse(@RequestBody InputTextDto dto) {

            inputTextService.reverse(InputText.builder()
                    .input(dto.getInput())
                    .build());

    }
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<InputTextDto> query(){
        return inputTextService.getAll().stream().map(model ->
                 InputTextDto.builder()
                       .input(model.getInput())
                        .build()
        ).collect(Collectors.toList());
    }

}
