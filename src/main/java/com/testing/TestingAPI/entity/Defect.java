package com.testing.TestingAPI.entity;

import com.testing.TestingAPI.entity.enums.DefectStatus;
import com.testing.TestingAPI.entity.enums.Environment;
import com.testing.TestingAPI.entity.enums.Priority;
import com.testing.TestingAPI.entity.enums.Severity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "Defects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Defect {
    @Id
    private String id;
    private String title;
    private String description;
    private LocalDate createdAt;
    private User author;
    private Issue issue;
    private String appVersion;
    private Environment environment;
    private List<String> steps;
    private String expectedResult;
    private String actualResult;
    private Severity severity;
    private Priority priority;
    private DefectStatus status;
    private TestCase testCase;
    private List<String> images;
}
