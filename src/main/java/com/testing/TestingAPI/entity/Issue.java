package com.testing.TestingAPI.entity;

import com.testing.TestingAPI.entity.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Issues")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Issue {
    @Id
    private String id;
    private String name;
    private String description;
    private Priority priority;
    private User user;
    private List<TestCase> testCases = new ArrayList<>();
}
