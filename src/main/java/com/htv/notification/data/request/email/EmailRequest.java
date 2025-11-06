package com.htv.notification.data.request.email;

import lombok.Data;

import java.io.File;
import java.util.List;
import java.util.Map;

@Data
public class EmailRequest {
    private List<String> to;
    private List<String> cc;
    private String subject;
    private Map<String, Object> data;
    private File attachment;
}
