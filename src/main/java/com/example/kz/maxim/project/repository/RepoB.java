package com.example.kz.maxim.project.repository;

import com.example.kz.maxim.project.RepoInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class RepoB implements RepoInterface {
    public void functionB() {
        System.out.println("class (RepoB) method called");
    }

    @Override
    public void repoMethod() {
        System.out.println("class (RepoB) method");
    }
}
