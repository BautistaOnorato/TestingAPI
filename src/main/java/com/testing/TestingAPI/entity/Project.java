package com.testing.TestingAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Projects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    private String id;
    private String name;
    private String description;
    private String imageUrl;
    private List<Module> modules = new ArrayList<>();
    private List<User> members = new ArrayList<>();
    private User admin;
}
