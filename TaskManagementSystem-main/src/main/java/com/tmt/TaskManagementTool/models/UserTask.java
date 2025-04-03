package com.tmt.TaskManagementTool.models;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserTask {
    String taskid;
    String createdBy;
    String assignedTo;

    public void setCreatedBy(PdfPCell createdBy) {
    }

    public void setAssignedTo(Phrase assignedTo) {
    }

    public void getClass(PdfPCell tid) {
    }
}
