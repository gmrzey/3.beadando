package hu.feladat.beadando.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Component
public class InputTextDaoImpl implements InputTextDao {

    private final List<InputText> inputTextList = new ArrayList<>();
    // []
    // ["olleH"]
    // ["h", "e"]

    @Override
    public Collection<InputText> readAll() {
        return inputTextList;
    }

    @Override
    public void reverse(InputText inputText) {
        inputTextList.add(inputText.reverse());
    }
}
