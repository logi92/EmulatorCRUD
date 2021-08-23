package ru.pflb.pflbConfig.repository;

import ru.pflb.pflbConfig.model.Emulator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Интерфейс - репозиторий для Emulator. Расширяет интерфейс JpaRepository
 * который в данном случае дает дефолтные API для работы с БД.
 */
@Repository
public interface EmulatorRepository extends JpaRepository<Emulator, Integer> {
}
