package app.repository;

import app.model.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Обновление, удаление, добавление, получение
@Repository
public interface WordsRepository extends JpaRepository<Words, Integer> { }
