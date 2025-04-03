package com.tmt.TaskManagementTool.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document( collection = "Comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    private ObjectId id;
    private String taskId;
    private String body;
    private String createdAt;
    private String createdBy;

    public void setBody(String body) {
    }

    public void setCreatedBy(String nraj) {
    }

    public void setTaskId(String tid) {
    }

    public void setCreatedAt(String currentDateTime) {
    }

    public String getCreatedBy() {
        return null;
    }
}
