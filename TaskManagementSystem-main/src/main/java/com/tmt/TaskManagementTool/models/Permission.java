package com.tmt.TaskManagementTool.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {

    @Id
    private ObjectId id;
    private String pid;
    private String name;

    public String getName() {
        return null;
    }

    public Object getPid() {
        return null;
    }

    public void setPid(Object pid) {
    }

    public void setName(Object name) {
    }

    public ObjectId getId() {
        return null;
    }
}
