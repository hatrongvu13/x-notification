package com.htv.notification.data.enums;

public enum EmailTemplateType {
    CONFIRM("email-confirm"),
    CV("email-cv"),
    SYSTEM_ALERT("email-system-alert"),
    THANK_YOU("email-thank-you"),
    ;

    private final String template;

    EmailTemplateType(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }
}
