package hu.feladat.beadando.dao;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class InputText {
    private String input="Alma a fa alatt";

    public InputText reverse() {
        return builder()
                .input(new StringBuilder(input).reverse().toString())
                .build();
    }
}
