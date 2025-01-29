package com.dpadd;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RequiredArgsConstructor
@SpringBootTest
public class SpringBootAndNullBeanTest {

    private final ApplicationContext appContext;

    @Test
    void testThatSpringBootAllowsBeanDeclarationAsNull() {
        assertNotNull(appContext);
        // OK, app is up and running, despite spring bean was declared as null
        // (in fact Spring treats it as if the bean was never defined)
    }

    @Test
    void testThatSpringBootDoesntRegisterBeanDeclaredAsNull() {
        assertThrows(
                NoSuchBeanDefinitionException.class,
                () -> appContext.getBean(CardNumberProvider.class));
    }
}
