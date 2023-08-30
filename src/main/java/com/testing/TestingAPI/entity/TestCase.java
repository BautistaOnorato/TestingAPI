package com.testing.TestingAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "TestCases")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestCase {
    @Id
    private String id;
    private String title;
    private String testScenario;
    private String testCase;
    private List<String> preCondition = new ArrayList<>();
    private List<String> testSteps = new ArrayList<>();
    private List<String> testData = new ArrayList<>();
    private String expectedResult;
    private String postCondition;
    private String actualResult;
    private Boolean status;
    private User author;
    private LocalDate createdAt;
    private LocalDate reviewedAt;
}
