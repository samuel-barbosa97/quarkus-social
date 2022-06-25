package io.github.samuel.barbosa97.quarkussocial.domain.repository;

import io.github.samuel.barbosa97.quarkussocial.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
}
