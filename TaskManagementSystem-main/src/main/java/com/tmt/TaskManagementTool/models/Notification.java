package com.tmt.TaskManagementTool.models;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document( collection = "Notification")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    
    @Id
    private ObjectId id;
    private String taskId;
    private String body;
    private String userId;

    public void setBody(String s) {
    }

    public void setUserId(Phrase assignedTo) {
    }

    public void setTaskId(PdfPCell tid) {
    }
}
