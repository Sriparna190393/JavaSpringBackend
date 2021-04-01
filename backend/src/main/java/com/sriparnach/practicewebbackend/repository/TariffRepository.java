package com.sriparnach.practicewebbackend.repository;

import com.sriparnach.practicewebbackend.data.Tariff;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TariffRepository extends MongoRepository<Tariff, String> {}