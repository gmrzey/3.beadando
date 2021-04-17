package hu.feladat.beadando.service;

import hu.feladat.beadando.dao.InputTextDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class InputTextServiceImpl implements InputTextService {

    final private InputTextDao inputTextDao;

    @Override
    public void reverse(InputText inputText) {
        inputTextDao.reverse(hu.feladat.beadando.dao.InputText.builder()
                        .input(inputText.getInput())
                        .build()
                );

    }

    @Override
    public Collection<InputText> getAll() {
        return inputTextDao.readAll().stream().map(
                daoInputText -> InputText.builder()
                .input(daoInputText.getInput())
                .build()
        ).collect(Collectors.toList());
    }
}
