package com.mycompany.coactvwc;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.mycompany.coactvwc");

        noClasses()
            .that()
            .resideInAnyPackage("com.mycompany.coactvwc.service..")
            .or()
            .resideInAnyPackage("com.mycompany.coactvwc.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.mycompany.coactvwc.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
