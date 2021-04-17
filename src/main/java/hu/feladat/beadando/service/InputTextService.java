package hu.feladat.beadando.service;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface InputTextService {
    void reverse(InputText inputText);
    Collection<InputText> getAll();
}
