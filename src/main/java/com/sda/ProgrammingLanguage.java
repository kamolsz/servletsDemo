package com.sda;

public class ProgrammingLanguage {

    private String programmingLanguageName;
    private String programmingLanguageLevel;
    private String programmingLanguageUse;

    public ProgrammingLanguage(String programmingLanguageName, String programmingLanguageLevel, String programmingLanguageUse) {
        this.programmingLanguageName = programmingLanguageName;
        this.programmingLanguageLevel = programmingLanguageLevel;
        this.programmingLanguageUse = programmingLanguageUse;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguages{" +
                "programmingLanguageName='" + programmingLanguageName + '\'' +
                ", valueProgrammingLanguage=" + programmingLanguageLevel +
                ", programmingLanguageUse='" + programmingLanguageUse + '\'' +
                '}';
    }
}
