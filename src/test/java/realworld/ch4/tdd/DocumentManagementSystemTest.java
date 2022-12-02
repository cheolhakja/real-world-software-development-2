package realworld.ch4.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentManagementSystemTest {

    @Test
    public void importFileAndCreateDocument() {
        DocumentManagementSystem documentManagementSystem = new DocumentManagementSystem();
        var result = documentManagementSystem.importFile();
        //Document에 이름 - Walker, PATH - ... 등 키-값 쌍으로 저장된 속성을 검증한다
    }

}