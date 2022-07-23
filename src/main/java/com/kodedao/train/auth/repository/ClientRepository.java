package com.kodedao.train.auth.repository;

import com.kodedao.train.auth.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findOneByClientId(String clientId);
}
