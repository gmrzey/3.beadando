package hu.feladat.beadando.dao;


import java.util.Collection;

public interface InputTextDao {
    Collection<InputText> readAll();
    void reverse(InputText inputText);
}
